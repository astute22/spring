package com.sample.demo.todo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.sample.demo.todo.service.TodoService;
import com.sample.demo.todo.vo.Todo;

public class App {

	public static void main(String[] args) {
		String resource = "classpath:/META-INF/spring/app-context.xml";
		ApplicationContext context = new GenericXmlApplicationContext(resource);
		TodoService service = context.getBean(TodoService.class);
		
		String title = "오늘의 할일 남바완";
		String contents = "필기테스트 공부 하기";
		//Todo todo = new Todo();
		//todo.setTitle(title);
		//todo.setContents(contents);
		
		List<Todo> todos = service.getAllTodo();
		System.out.println("조회된 글의 수 : " + todos.size());
		//service.addTodo(todo);
		//service.delTodo(61);
	}
}
