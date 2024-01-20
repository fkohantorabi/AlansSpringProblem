package com.example.demo.service;

import jakarta.validation.Valid;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Profile("test")
@Validated
public class ServiceWithProblem implements DemoService {

	@Override
	public void demo(@Valid Data data) {
		System.out.println(">>>>> Reaches here!");
	}
}
