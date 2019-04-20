package com.example.demo.web.customizer;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;

public class MyCustomErrorController implements ErrorController
{

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "/error";
	}
	
	@GetMapping(value="/error")
    public String error() {
        return "Error haven";
	}
	
	@GetMapping(value="/errorHaven")
    public String errorHaven() {
        return "Custom error page - /errorHaven";
	}
	
}
