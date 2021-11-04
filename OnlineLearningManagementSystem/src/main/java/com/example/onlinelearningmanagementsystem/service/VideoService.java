package com.example.onlinelearningmanagementsystem.service;

import com.example.onlinelearningmanagementsystem.cache.ContentCache;
import com.example.onlinelearningmanagementsystem.model.content.VideoContent;

public interface VideoService {
    VideoContent createNewVideoContent(VideoContent videoContent);
    VideoContent deleteVideoContent(VideoContent videoContent);
    String getVideoUrl(long id);
    void updateCurrentTime(long id, long duration);
    ContentCache getContentCache();
}
