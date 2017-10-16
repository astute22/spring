package com.sample.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.sample.demo.event.EventService;
import com.sample.demo.order.OrderService;

public class App {

	public static void main(String[] args) {
		String resource= "classpath:/META-INF/spring/app-context.xml";
		ApplicationContext context = new GenericXmlApplicationContext(resource);
		
		EventService eventService = context.getBean("eventService",EventService.class);
		OrderService orderService = context.getBean("orderService",OrderService.class);
		
		//eventService.newEventNotice();
		orderService.sendOrderState();
	}
}
