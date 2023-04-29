package br.com.curso.biblioteca.repository;

import br.com.curso.biblioteca.entity.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;


public interface EmprestimoRepository extends JpaRepository<Emprestimo,Long> {
    @Procedure(name = "atrasos")
    public Integer quantidadeEmAtraso();



}
