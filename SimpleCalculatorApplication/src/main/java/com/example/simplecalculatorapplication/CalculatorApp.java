package com.example.simplecalculatorapplication;

import com.example.simplecalculatorapplication.service.AcademicCalcUtil;
import com.example.simplecalculatorapplication.service.Calculator;
import com.example.simplecalculatorapplication.service.PrimarySchoolCalcUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CalculatorApp implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(CalculatorApp.class);

    private Calculator calculator1;
    private Calculator calculator2;

    @Autowired
    public CalculatorApp(@Qualifier("scientificCalculator") Calculator calculator1, @Qualifier("simpleCalculator") Calculator calculator2) {
        this.calculator1 = calculator1;
        this.calculator2 = calculator2;
    }

    @Override
    public void run(String... args) throws Exception {
        if(LOGGER.isInfoEnabled()) {
            LOGGER.info("Calculated value scientificCalculator {}", calculator1.calculate(6, 2));
            LOGGER.info("Calculated value simpleCalculator {}", calculator2.calculate(2, 3));
        }
    }

}
