package br.com.jonathanamarante.todolist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.jonathanamarante.todolist.entity.Todo;
import br.com.jonathanamarante.todolist.repository.TodoRepository;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> create(Todo todo){
        if(todo != null)
            todoRepository.save(todo);
        return list();
    }
    public List<Todo> list(){
        Sort sort = Sort.by("priority")
        .descending()
        .and(Sort.by("name")
        .ascending());
        return todoRepository.findAll(sort);
    }
    public List<Todo> update(Todo todo){
        if(todo != null)
            todoRepository.save(todo);
        return list();
    }
    public List<Todo> delete(Long id){
        if(id != null)
            todoRepository.deleteById(id);
        return list();
    }
}
