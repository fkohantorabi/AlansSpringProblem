package com.example.demo.service;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;


public class Data {
	@NotNull
	private String name;

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
}
