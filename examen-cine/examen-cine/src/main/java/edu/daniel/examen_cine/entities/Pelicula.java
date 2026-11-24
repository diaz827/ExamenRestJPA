package edu.daniel.examen_cine.entities;

import jakarta.persistence.Table;

@Table(name="pelicula")
public class Pelicula {

    public Long id;

    public String titulo;

    public String director;

    public int anio;

    public int duracion;

}
