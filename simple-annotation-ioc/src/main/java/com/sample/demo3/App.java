package com.sample.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		String resource = "classpath:/META-INF/spring/demo3-value-context.xml";
		
		ApplicationContext context = new GenericXmlApplicationContext(resource);
		
		FileProcessor processor = context.getBean(resource, FileProcessor.class);
		
		processor.process();
	}
}
