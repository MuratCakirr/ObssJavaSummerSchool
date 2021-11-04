package com.example.onlinelearningmanagementsystem.service.impl;

import com.example.onlinelearningmanagementsystem.cache.ContentCache;
import com.example.onlinelearningmanagementsystem.model.content.VideoContent;
import com.example.onlinelearningmanagementsystem.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoServiceImpl implements VideoService {

    private ContentCache contentCache;

    @Autowired
    public VideoServiceImpl(ContentCache contentCache) {
        this.contentCache = contentCache;
    }

    @Override
    public VideoContent createNewVideoContent(VideoContent videoContent) {
        contentCache.addContent(videoContent);
        return (VideoContent) contentCache.addContent(videoContent);
    }

    @Override
    public VideoContent deleteVideoContent(VideoContent videoContent) {
        return (VideoContent) contentCache.removeContent(videoContent.getId());
    }

    @Override
    public String getVideoUrl(long id) {
        return contentCache.getContent(id).getName();
    }

    @Override
    public void updateCurrentTime(long id, long duration) {
    }

    @Override
    public ContentCache getContentCache() {
        return contentCache;
    }
}
