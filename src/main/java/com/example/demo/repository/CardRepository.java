package com.example.demo.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Card;

import org.springframework.stereotype.Repository;

@Repository
public class CardRepository {

    private List<Card> initalCards() {
        List<Card> cards = new ArrayList<Card>();
        cards.add(new Card(1L, "Tarjeta 1", "Descripción tarjeta 1", LocalDate.now()));
        cards.add(new Card(2L, "Tarjeta 2", "Descripción tarjeta 2", LocalDate.now()));
        cards.add(new Card(3L, "Tarjeta 3", "Descripción tarjeta 3", LocalDate.now()));
        cards.add(new Card(4L, "Tarjeta 4", "Descripción tarjeta 4", LocalDate.now()));
        return cards;
    }

    public List<Card> list = initalCards();

    public List<Card> findAll() {
        return list;
    }

    public Card add(Card card) {
        list.add(card);
        return card;
    }

    public Card findOne(Long id) {
        return list.stream().filter(card -> card.getId().equals(id)).findAny().orElse(null);
    }

    public Card update(Card card) {
        Long id = card.getId();
        Boolean wasRemoved = list.removeIf(c -> c.getId().equals(id));
        if (wasRemoved) {
            list.add(card);
            return card;
        }
        return null;

    }

    public Long delete(Long id) {
        list.removeIf(card -> card.getId().equals(id));
        return id;
    }

}
