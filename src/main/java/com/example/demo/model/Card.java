package com.example.demo.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {

    private Long id;
    private String title;
    private String description;
    private LocalDate date;

}
