package com.example.demo.service.implement;

import java.util.List;

import com.example.demo.model.Card;
import com.example.demo.repository.CardRepository;
import com.example.demo.service.CardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImplement implements CardService {

    @Autowired
    private CardRepository cardRepository;

    @Override
    public List<Card> findAll() {
        return cardRepository.findAll();
    }

    @Override
    public Card save(Card card) {
        return cardRepository.add(card);

    }

    @Override
    public Card findOne(Long id) {
        return cardRepository.findOne(id);
    }

    @Override
    public Card update(Card card) {
        return cardRepository.update(card);

    }

    @Override
    public Long delete(Long id) {

        return cardRepository.delete(id);
    }

}
