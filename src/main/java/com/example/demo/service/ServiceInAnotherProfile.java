package com.example.demo.service;

import jakarta.validation.Valid;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Profile("no-this-profile")
@Validated
public class ServiceInAnotherProfile implements DemoService {

	@Override
	public void demo(@Valid Data data) {
		System.out.println(">>>>> It should not reach here!");
	}
}
