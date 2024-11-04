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
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para geerar un id autoincrementable
    private Long id;
    private String nombre;

    //PAra crear una relació 1 a 1 dependiente de club
    @OneToOne(targetEntity = Coach.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name="id_coach")//para darle nombre a la columna clave foranea
    private Coach coach;

    @OneToMany(targetEntity = Jugador.class, fetch = FetchType.LAZY, mappedBy = "club")
    private List<Jugador> jugadores;

    @ManyToOne(targetEntity = Association.class)
    private Association footballAssociation;

    @ManyToMany(targetEntity = FootballCompetition.class,  fetch = FetchType.LAZY)
    @JoinTable(name="club_competition", joinColumns = @JoinColumn(name = "club"), inverseJoinColumns = @JoinColumn(name="competition"))
    private List<FootballCompetition> listaCompetencias;

}
