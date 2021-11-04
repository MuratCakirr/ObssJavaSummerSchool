package tr.com.obss.jss.finalproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import tr.com.obss.jss.finalproject.Model.User;
import tr.com.obss.jss.finalproject.Results.ErrorDataResult;
import tr.com.obss.jss.finalproject.Service.UserService;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/user/")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/addUser")
    public ResponseEntity<?> addUser(@Valid @RequestBody User user) {
        return ResponseEntity.ok(userService.addUser(user));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions){
        Map<String,String> validationErrors = new HashMap<>();
        for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()){
            validationErrors.put(fieldError.getField(),fieldError.getDefaultMessage());
        }

        ErrorDataResult<Object> errorDataResult = new ErrorDataResult<>(validationErrors, "Validation Errors");
        return errorDataResult;
    }

    @GetMapping("all")
    public String allAccess() {
        return "Public Content.";
    }

    @GetMapping("user")
    @PreAuthorize("hasAuthority('USER')")
    public String userAccess() {
        return "User Content.";
    }

    @GetMapping("admin")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<User> findAllUser(){
        return userService.findAllUser();
    }

}
