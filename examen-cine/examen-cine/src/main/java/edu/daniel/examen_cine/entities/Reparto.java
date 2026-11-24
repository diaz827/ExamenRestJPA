package edu.daniel.examen_cine.entities;

import jakarta.persistence.Table;

@Table(name="reparto")
public class Reparto {

    public Long id;

    public String personaje;

    public double salario;

    public Long pelicula_id;

    public Long actor_id;

}
