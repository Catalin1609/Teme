package com.example.spring_recap.persitence.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime date;

    private Double total;

    @OneToMany(mappedBy = "invoice")
    private Long id;

}
