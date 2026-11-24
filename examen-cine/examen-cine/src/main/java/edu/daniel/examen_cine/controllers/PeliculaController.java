package edu.daniel.examen_cine.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.daniel.examen_cine.dtos.PeliculaResponseDTO;
import edu.daniel.examen_cine.dtos.RquestDTO;
import edu.daniel.examen_cine.services.IpeliculaService;

@RestController 
@RequestMapping ("/api/peliculas")
public class PeliculaController {

    @Autowired 
    private final IpeliculaService peliculaService;

    @PostMapping
    public ResponseEntity <PeliculaResponseDTO> crearpelicula(@RequestPelicula RquestDTO pelicula){

        try{
            PeliculaResponseDTO peliResponseDTO = peliculaService.crearPelicula(pelicula);

            return ResponseEntity.status(201).body(peliResponseDTO);
        } 

        catch(IllegalArgumentException e){
            
             System.out.println(e.getMessage());

             return ResponseEntity.status(400).build();
        }
    }

    public PeliculaController(IpeliculaService peliculaService) {
        this.peliculaService = peliculaService;
    }

}
