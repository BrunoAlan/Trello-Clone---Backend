package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Column;
import com.example.demo.service.ColumnService;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/api"))
@CrossOrigin(origins = "http://localhost:3000")
public class ColumnController {

    @Autowired
    private ColumnService columnService;

    @GetMapping("/columns")
    private ResponseEntity<List<Column>> finalAll() {
        return ResponseEntity.ok().body(columnService.findAll());
    }
}
