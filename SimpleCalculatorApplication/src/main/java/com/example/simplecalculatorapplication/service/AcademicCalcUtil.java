package com.example.simplecalculatorapplication.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AcademicCalcUtil{

    public long calculate(long number1,long number2){
        return number1/number2;
    }
}
