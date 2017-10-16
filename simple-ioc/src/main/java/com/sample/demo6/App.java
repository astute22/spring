package com.sample.demo6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		String resource = "classpath:/META-INF/spring/demo6-context.xml";
		ApplicationContext context = new GenericXmlApplicationContext(resource);
		MessageService service = context.getBean("service", MessageService.class);
		service.sendMessage("행복풀", "K");
	}

}
