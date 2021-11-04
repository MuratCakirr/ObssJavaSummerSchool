package com.example.onlinelearningmanagementsystem.cache.impl;

import org.springframework.stereotype.Service;
import com.example.onlinelearningmanagementsystem.model.content.Content;
import com.example.onlinelearningmanagementsystem.cache.ContentCache;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class InMemoryContentCache implements ContentCache {

    private Map<Long, Content> contentCache = new ConcurrentHashMap<>();

    @Override
    public Content getContent(long id) {
        Content content = contentCache.get(id);
        if(content != null){
            return content;
        }else{
            System.out.println("null");
            return null;
        }

    }

    @Override
    public Content addContent(Content content) {
        Random random = new Random();
        Long id = random.nextLong();
        System.out.println(id);
        contentCache.put(id,content);
        content.setId(id);
        return content;
    }

    @Override
    public Content removeContent(long id) {
        contentCache.remove(id);
        return contentCache.get(id);
    }

    @Override
    public void printCacheSize() {

    }

}
