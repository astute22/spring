package com.sample.demo.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.demo.todo.mappers.TodoMapper;
import com.sample.demo.todo.vo.Todo;

@Service
public class TodoServiceImpl implements TodoService{

	@Autowired
	private TodoMapper mapper;
	
	public List<Todo> getAllTodo() {
		// TODO Auto-generated method stub
		List<Todo> todos = mapper.getAllTodo();
		if(todos.isEmpty()) {
			System.out.println("조회목록이 없습니다.");
		}
		return todos;
	}
	
	public void addTodo(Todo todo) {
		// TODO Auto-generated method stub
		mapper.addTodo(todo);
	}
	
	public void delTodo(int no) {
		// TODO Auto-generated method stub
		mapper.delTodo(no);
	}
}
