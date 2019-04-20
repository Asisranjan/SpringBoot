package com.example.demo.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.ReactiveHealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

import reactor.core.publisher.Mono;

@Component
public class CustomHealthIndicator implements ReactiveHealthIndicator{

	@Override
	public Mono<Health> health() {
		// TODO Auto-generated method stub
		return Mono.just(new Health.Builder().status(Status.OUT_OF_SERVICE).build());
	}
	
}
