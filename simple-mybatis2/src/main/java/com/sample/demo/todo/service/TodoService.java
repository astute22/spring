package com.sample.demo.todo.service;

import java.util.List;

import com.sample.demo.todo.vo.Todo;

public interface TodoService {

	List<Todo> getAllTodo();
	void addTodo(Todo todo);
	void delTodo(int no);
}
