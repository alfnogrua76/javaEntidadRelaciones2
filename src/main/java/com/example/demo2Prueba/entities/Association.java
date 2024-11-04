package com.example.demo2Prueba.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Association {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para geerar un id autoincrementable
    private Long id;
    private String name;
    private String countrY;
    private String president;

    @OneToMany(targetEntity = Club.class, fetch = FetchType.LAZY, mappedBy = "footballAssociation")
    private List<Club> club;
}
