package com.example.demo.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class CallingService implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	public void call() {
		DemoService service = applicationContext.getBean(DemoService.class);

		Data data = new Data();
		data.setName("Some really long name");

		service.demo(data);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
