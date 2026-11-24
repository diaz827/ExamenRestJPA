package edu.daniel.examen_cine.entities;

import jakarta.persistence.Table;

@Table(name="actor")
public class Actor {

    
    public Long id;

    public String nombre;

    public String nacionalidad;


}
