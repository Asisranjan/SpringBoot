package com.example.demo.actuator;

import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.web.WebEndpointResponse;
import org.springframework.boot.actuate.endpoint.web.annotation.EndpointWebExtension;
import org.springframework.boot.actuate.info.InfoEndpoint;
import org.springframework.stereotype.Component;

@Component
@EndpointWebExtension(endpoint = InfoEndpoint.class)
public class InfoWebEndpointExtension {

	private InfoEndpoint delegate;
	
	public InfoWebEndpointExtension(InfoEndpoint infoEndpoint) {
        this.delegate = infoEndpoint;
    }
	
	@ReadOperation
	public WebEndpointResponse<Map> info(){
		System.out.println(this.delegate);
		Map<String,Object> map = this.delegate.info();
		Integer status = getStatus(map);
		return new WebEndpointResponse<>(map, status);
	}

	private Integer getStatus(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return 500;
	}
}
