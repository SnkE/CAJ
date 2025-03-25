package com.biblioteca.repository;

import com.biblioteca.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LibroRepository extends JpaRepository<Libro, Integer> {

    @Query("SELECT l FROM Libro l WHERE l.Titulo LIKE %:titulo% AND l.Autor LIKE %:autor%")
    List<Libro> findByTituloAndAutor(@Param("titulo") String titulo, @Param("autor") String autor);
}