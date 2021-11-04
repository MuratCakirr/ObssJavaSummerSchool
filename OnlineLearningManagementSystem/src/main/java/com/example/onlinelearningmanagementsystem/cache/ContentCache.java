package com.example.onlinelearningmanagementsystem.cache;

import com.example.onlinelearningmanagementsystem.model.content.Content;

public interface ContentCache {
    Content getContent(long id);
    Content addContent(Content content);
    Content removeContent(long id);
    void printCacheSize();
}
