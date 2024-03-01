package br.com.jonathanamarante.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jonathanamarante.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
