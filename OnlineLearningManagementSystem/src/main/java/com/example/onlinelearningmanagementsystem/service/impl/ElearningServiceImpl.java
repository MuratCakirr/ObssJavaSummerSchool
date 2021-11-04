package com.example.onlinelearningmanagementsystem.service.impl;

import com.example.onlinelearningmanagementsystem.cache.ContentCache;
import com.example.onlinelearningmanagementsystem.model.content.ElearningContent;
import com.example.onlinelearningmanagementsystem.service.ElearningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElearningServiceImpl implements ElearningService {
    private ContentCache contentCache;

    @Autowired
    public ElearningServiceImpl(ContentCache contentCache) {
        this.contentCache = contentCache;
    }

    @Override
    public ElearningContent createNewElearningContent(ElearningContent elearningContent) {
        return (ElearningContent) contentCache.addContent(elearningContent);
    }

    @Override
    public ElearningContent deleteElearningContent(ElearningContent elearningContent) {
        return (ElearningContent) contentCache.removeContent(elearningContent.getId());
    }

    @Override
    public String getElearningUrl(Long id) {
        return contentCache.getContent(id).getName();
    }

    @Override
    public ContentCache getContentCache() {
        return contentCache;
    }
}
