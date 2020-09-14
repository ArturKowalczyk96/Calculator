package com.calculator.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Calculator {
    double a;
    double b;

    public double addAToB(double a, double b) {
        System.out.println("This works!");
        return a + b;
    }

    public double subtractBFromA(double a, double b){
        System.out.println("This works!");
        return a - b;
    }

    public static void main(String[] args) {
        SpringApplication.run(Calculator.class, args);

        Calculator calculator = new Calculator();
        double sum = calculator.addAToB(4.3, 3.3);
        System.out.println("Sum: " + sum);
        double subt = calculator.subtractBFromA(5.5, 4.5);
        System.out.println("Subtraction: " + subt);
    }

}
