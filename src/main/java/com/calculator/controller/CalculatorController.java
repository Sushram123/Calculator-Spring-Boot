package com.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {
	
	
	

	    @GetMapping("/add")
	    public double add(@RequestParam double num1, @RequestParam double num2) {
	        return num1 + num2;
	    }

	    @GetMapping("/subtract")
	    public double subtract(@RequestParam double num1, @RequestParam double num2) {
	        return num1 - num2;
	    }

	    @GetMapping("/multiply")
	    public double multiply(@RequestParam double num1, @RequestParam double num2) {
	        return num1 * num2;
	    }

	    @GetMapping("/divide")
	    public double divide(@RequestParam double num1, @RequestParam double num2) {
	        if (num2 == 0) {
	            throw new IllegalArgumentException("Cannot divide by zero");
	        }
	        return num1 / num2;
	    }
	}
