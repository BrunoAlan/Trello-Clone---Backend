package com.example.demo.service.implement;

import java.util.List;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepostory;
import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplement implements UserService {

    @Autowired
    UserRepostory userRepostory;

    @Override
    public List<User> findAll() {
        return userRepostory.findAll();
    }

    @Override
    public User save(User user) {
        userRepostory.add(user);
        return user;
    }

    @Override
    public User findOne(Long id) {

        return userRepostory.findOne(id);
    }

    @Override
    public User update(User user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Long delete(Long id) {
        userRepostory.delete(id);
        return id;
    }

}
