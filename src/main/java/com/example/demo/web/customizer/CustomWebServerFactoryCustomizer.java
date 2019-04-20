package com.example.demo.web.customizer;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomWebServerFactoryCustomizer
		implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> 
{

	@Override
	public void customize(ConfigurableServletWebServerFactory factory) {
		// TODO Auto-generated method stub
		factory.setPort(8082);
		factory.addErrorPages(new ErrorPage("/errorHaven"));
	}

}
