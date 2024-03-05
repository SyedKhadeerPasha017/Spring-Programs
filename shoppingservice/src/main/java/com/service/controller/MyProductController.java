package com.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/shopping")
public class MyProductController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/test")
	public String home()
	{
		return "Welcome To Home Page Content";
	}
	
	@GetMapping("/amaonpay/{price}")
	public String invokePayment(@PathVariable double price)
	{
		String url="http://PAYMENT-SERVICE/payment/pay/"+price;
		return restTemplate.getForObject(url,String.class);
	}
	
	

}
