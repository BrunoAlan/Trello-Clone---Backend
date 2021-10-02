package com.example.demo.controller;

import java.util.List;
import com.example.demo.model.User;
import com.example.demo.service.CardService;
import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    private ResponseEntity<List<User>> getAllCards() {
        return ResponseEntity.ok().body(userService.findAll());
    }

    @PostMapping("/users")
    private ResponseEntity<User> addCard(@RequestBody User user) {
        return ResponseEntity.ok().body(userService.save(user));
    }

    @GetMapping("/users/{id}")
    private ResponseEntity<User> findOne(@PathVariable Long id) {
        return ResponseEntity.ok().body(userService.findOne(id));
    }

    @PutMapping("/users")
    private ResponseEntity<User> findOne(@RequestBody User user) {
        return ResponseEntity.ok().body(userService.update(user));
    }

    @DeleteMapping("/users/{id}")
    private ResponseEntity<Long> delete(@PathVariable Long id) {
        return ResponseEntity.ok().body(userService.delete(id));
    }

}