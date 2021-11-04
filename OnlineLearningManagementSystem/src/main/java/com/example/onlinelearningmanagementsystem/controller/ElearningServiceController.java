package com.example.onlinelearningmanagementsystem.controller;

import com.example.onlinelearningmanagementsystem.exception.ExceptionController;
import com.example.onlinelearningmanagementsystem.model.content.ElearningContent;
import com.example.onlinelearningmanagementsystem.service.ElearningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/elearning")
public class ElearningServiceController {

    private ElearningService elearningService;

    @Autowired
    public ElearningServiceController(ElearningService elearningService) {
        this.elearningService = elearningService;
    }

    @GetMapping("/get/{id}")
    public String getElearningContent(@PathVariable("id") long id){
        return elearningService.getElearningUrl(id);
    }

    @PostMapping("/post")
    public ElearningContent createElearningContent(@RequestBody ElearningContent elearningContent){
        System.out.println(elearningContent.getId());
        return elearningService.createNewElearningContent(elearningContent);
    }

    @DeleteMapping("/delete/{id}")
    public ElearningContent deleteElearningContent(@PathVariable("id") long id){
        return elearningService.deleteElearningContent((ElearningContent) elearningService.getContentCache().getContent(id));
    }

}
