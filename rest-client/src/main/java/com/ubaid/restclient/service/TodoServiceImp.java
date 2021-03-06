package com.ubaid.restclient.service;

import com.ubaid.restclient.entity.Todo;
import com.ubaid.restclient.feignProxy.FeignProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImp implements  TodoService {

    @Autowired
    FeignProxy proxy;

    @Override
    public Todo getTodo(String username, int id) {
        return proxy.getTodo(username, id);
    }

    @Override
    public List<Todo> getAllTodo(String username) {
        return proxy.getAllTodos(username);
    }

    @Override
    public Todo deleteTodo(String username, int id) {
        return proxy.deleteTodo(username, id);
    }

    @Override
    public Todo updateTodo(String username, Todo todo) {
        return proxy.updateTodo(username, todo);
    }

    @Override
    public Todo addTodo(String username, Todo todo) {
        return proxy.addTodo(username, todo);
    }
}
