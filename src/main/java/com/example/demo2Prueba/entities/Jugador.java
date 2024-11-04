package com.example.demo2Prueba.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para geerar un id autoincrementable

    private Long id;
    private String name;
    @Column(name="last_name")//sql
    private String lastName;//java
    private String nationality;
    private Integer age;
    private String position;

    @ManyToOne(targetEntity = Club.class)
    private Club club;
}
