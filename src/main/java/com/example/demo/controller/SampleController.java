package com.example.demo.controller;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	private static final String EXCHANGE_NAME = "sample.exchange";
	
	@Autowired
	RabbitTemplate rabbitTemplate;
	
	@GetMapping("/sample/queue")
	public String samplePublish() {
		rabbitTemplate.convertAndSend(EXCHANGE_NAME, "sample.oingdaddy.#", "응답성공");
		return "응답됐어요";
	}

}

