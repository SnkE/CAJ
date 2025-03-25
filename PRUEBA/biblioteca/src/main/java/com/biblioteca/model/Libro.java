package com.biblioteca.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Libros", schema = "dbo")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID") // Mapea a la columna "ID"
    private int ID;

    @Column(name = "Titulo") // Mapea a la columna "Titulo"
    private String Titulo;

    @Column(name = "Autor") // Mapea a la columna "Autor"
    private String Autor;

    @Column(name = "Anio") // Mapea a la columna "AnioPublicacion"
    private int Anio;

    // Getters y Setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int anio) {
        Anio = anio;
    }
}