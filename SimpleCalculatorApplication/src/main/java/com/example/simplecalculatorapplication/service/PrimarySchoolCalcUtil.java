package com.example.simplecalculatorapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PrimarySchoolCalcUtil {

    public long calculate(long number1,long number2){
        return number1*number2;
    }
}
