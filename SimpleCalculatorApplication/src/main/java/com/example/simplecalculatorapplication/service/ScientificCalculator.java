package com.example.simplecalculatorapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScientificCalculator implements Calculator{

    private AcademicCalcUtil academicCalcUtil;

    @Autowired
    public ScientificCalculator(AcademicCalcUtil academicCalcUtil) {
        this.academicCalcUtil = academicCalcUtil;
    }

    @Override
    public long calculate(long number1, long number2) {
        return academicCalcUtil.calculate(number1,number2);
    }

}
