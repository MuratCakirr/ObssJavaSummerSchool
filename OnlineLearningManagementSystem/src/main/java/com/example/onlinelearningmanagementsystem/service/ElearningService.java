package com.example.onlinelearningmanagementsystem.service;

import com.example.onlinelearningmanagementsystem.cache.ContentCache;
import com.example.onlinelearningmanagementsystem.model.content.ElearningContent;

public interface ElearningService {
    ElearningContent createNewElearningContent(ElearningContent videoContent);
    ElearningContent deleteElearningContent(ElearningContent videoContent);
    String getElearningUrl(Long id);
    ContentCache getContentCache();
}
