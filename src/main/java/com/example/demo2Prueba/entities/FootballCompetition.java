package com.example.demo2Prueba.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FootballCompetition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para geerar un id autoincrementable
    private Long id;

    @Column(name = "name", columnDefinition = "VARCHAR(300)")
    private String name;

    @Column(name = "cuantity_price", length = 10, nullable = false)
    private Integer cuantityPrice;
    @Column(name="start_date", columnDefinition = "DATE")
    private LocalDate startDate;
    @Column(name="end_date", columnDefinition = "DATE")
    private LocalDate endtDate;


}
