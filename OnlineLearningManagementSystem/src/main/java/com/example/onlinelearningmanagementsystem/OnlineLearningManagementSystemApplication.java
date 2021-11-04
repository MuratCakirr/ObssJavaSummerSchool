package com.example.onlinelearningmanagementsystem;

import com.example.onlinelearningmanagementsystem.service.ElearningService;
import com.example.onlinelearningmanagementsystem.service.VideoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineLearningManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineLearningManagementSystemApplication.class, args);
    }


}
