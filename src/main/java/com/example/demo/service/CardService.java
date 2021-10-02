package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Card;

public interface CardService {

    public List<Card> findAll();

    public Card save(Card card);

    public Card findOne(Long id);

    public Card update(Card card);

    public Long delete(Long id);

}
