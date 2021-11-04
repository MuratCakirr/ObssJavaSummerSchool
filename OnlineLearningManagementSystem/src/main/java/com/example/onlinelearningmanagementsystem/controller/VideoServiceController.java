package com.example.onlinelearningmanagementsystem.controller;

import com.example.onlinelearningmanagementsystem.model.content.VideoContent;
import com.example.onlinelearningmanagementsystem.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/video")
public class VideoServiceController {

    private VideoService videoService;

    @Autowired
    public VideoServiceController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping("/get/{id}")
    public String getVideoContent(@PathVariable("id") long id){
        return videoService.getVideoUrl(id);
    }

    @PostMapping("/post")
    public VideoContent createNewVideoContent(@RequestBody VideoContent videoContent){
        return videoService.createNewVideoContent(videoContent);
    }

    @DeleteMapping("/delete/{id}")
    public VideoContent deleteVideoContent(@PathVariable("id") long id){
       return videoService.deleteVideoContent((VideoContent) videoService.getContentCache().getContent(id));
    }
}
