package com.example.demo.controller;

import java.util.List;
import com.example.demo.model.Card;
import com.example.demo.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class CardController {

    @Autowired
    private CardService cardService;

    @GetMapping("/cards")
    private ResponseEntity<List<Card>> getAllCards() {
        return ResponseEntity.ok().body(cardService.findAll());
    }

    @PostMapping("/cards")
    private ResponseEntity<Card> addCard(@RequestBody Card card) {
        return ResponseEntity.status(HttpStatus.CREATED).body(cardService.save(card));
    }

    @GetMapping("/cards/{id}")
    private ResponseEntity<Card> findOne(@PathVariable Long id) {
        return ResponseEntity.ok().body(cardService.findOne(id));
    }

    @PutMapping("/cards")
    private ResponseEntity<Card> findOne(@RequestBody Card card) {
        return ResponseEntity.ok().body(cardService.update(card));
    }

    @DeleteMapping("/cards/{id}")
    private ResponseEntity<Long> delete(@PathVariable Long id) {
        return ResponseEntity.ok().body(cardService.delete(id));
    }

}