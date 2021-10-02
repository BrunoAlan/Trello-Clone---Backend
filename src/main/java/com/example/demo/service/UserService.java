package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {

    public List<User> findAll();

    public User save(User user);

    public User findOne(Long id);

    public User update(User user);

    public Long delete(Long id);

}
