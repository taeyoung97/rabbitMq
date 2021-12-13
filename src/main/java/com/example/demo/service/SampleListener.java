package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

import org.springframework.stereotype.Component;
@Component
public class SampleListener {
	
	private static final Logger log = LoggerFactory.getLogger(SampleListener.class);
	
	@RabbitListener(queues = "sample.queue")
	public void getString(String message) {
		log.info(message.toString());
	}
}

