package edu.daniel.examen_cine.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="reparto")
public class Reparto {

    @Column (name = "reparto_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name="personaje", length = 100, nullable = false)
    public String personaje;

    @Column(name = "salario")
    public double salario;

    @Column (name = "pelicula_id")
    public Long pelicula_id;

    @Column (name = "actor_id")
    public Long actor_id;

    public Reparto() {
    }

    public Reparto(String personaje, double salario, Long pelicula_id, Long actor_id) {
        this.personaje = personaje;
        this.salario = salario;
        this.pelicula_id = pelicula_id;
        this.actor_id = actor_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Long getPelicula_id() {
        return pelicula_id;
    }

    public void setPelicula_id(Long pelicula_id) {
        this.pelicula_id = pelicula_id;
    }

    public Long getActor_id() {
        return actor_id;
    }

    public void setActor_id(Long actor_id) {
        this.actor_id = actor_id;
    }

    
}
