package br.com.curso.biblioteca.repository;

import br.com.curso.biblioteca.entity.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem,Long> {



}
