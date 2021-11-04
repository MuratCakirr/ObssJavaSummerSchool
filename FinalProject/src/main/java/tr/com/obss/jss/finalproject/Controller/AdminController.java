package tr.com.obss.jss.finalproject.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import tr.com.obss.jss.finalproject.Model.Product;
import tr.com.obss.jss.finalproject.Results.Result;
import tr.com.obss.jss.finalproject.Service.ProductService;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@PreAuthorize("hasAuthority('ADMIN')")
@RequestMapping("/api/admin")
public class AdminController {

    private ProductService productService;

    @PostMapping("/add")
    public Result addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @DeleteMapping("/delete/{productId}")
    public Result deleteProductById(@PathVariable(value = "productId") Long productId){
        return productService.deleteProductById(productId);
    }

    @PutMapping("/edit/product")
    public Result updateProduct(@Valid @RequestBody String productName){
        return productService.updateProduct(productName);
    }

}
