package com.sample.demo.todo.mappers;

import java.util.List;

import com.sample.demo.todo.vo.Todo;

public interface TodoMapper {

	List<Todo> getAllTodo();
	void addTodo(Todo todo);
	void delTodo(int no);
}
