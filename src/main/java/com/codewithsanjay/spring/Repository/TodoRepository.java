package com.codewithsanjay.spring.Repository;



import com.codewithsanjay.spring.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public List<Todo> findall() {
         return jdbcTemplate.query("SELECT * FROM todo",new BeanPropertyRowMapper<>(Todo.class));
    }

    public List<Todo> insert(Todo todo) {
         jdbcTemplate.update("insert into todo(id,name,gender) value(?,?,?)",new Object[]{todo.getID(),todo.getNAME(),todo.getGENDER()});
         return findall();
    }

    public List<Todo> update(Todo todo) {
        jdbcTemplate.update("Update todo SET name =?,gender=? where id=?",new Object[]{todo.getNAME(),todo.getGENDER(),todo.getID()});
        return findall();

    }

    public List<Todo> delete(int id) {
        jdbcTemplate.update("delete from todo where id=?",new Object[]{id});
        return findall();
    }
}
