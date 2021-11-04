package com.example.simplecalculatorapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleCalculator implements Calculator{

    private PrimarySchoolCalcUtil primarySchoolCalcUtil;

    @Autowired
    public SimpleCalculator(PrimarySchoolCalcUtil primarySchoolCalcUtil) {
        this.primarySchoolCalcUtil = primarySchoolCalcUtil;
    }

    @Override
    public long calculate(long number1, long number2) {
        return primarySchoolCalcUtil.calculate(number1,number2);
    }
}
