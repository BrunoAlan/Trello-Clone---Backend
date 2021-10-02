package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.User;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepostory {

    private List<User> initialUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User(1L, "Alan", "Bruno"));
        return users;
    }

    private List<User> users = initialUsers();

    public List<User> findAll() {
        return users;
    }

    public User add(User user) {
        users.add(user);
        return user;
    }

    public User findOne(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findAny().orElse(null);
    }

    public Long delete(Long id) {
        users.removeIf(user -> user.getId().equals(id));
        return id;
    }

}
