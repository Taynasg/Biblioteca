package br.com.curso.biblioteca.repository;

import br.com.curso.biblioteca.entity.Revista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RevistaRepository extends JpaRepository<Revista, Long> {



}
