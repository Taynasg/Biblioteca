package br.com.curso.biblioteca.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_ESTUDANTE")
public class Estudante extends Usuario {
    private String matricula;

    Estudante(Long id,String nome,String rg,String email ,String matricula){
        super(id,nome,rg,email);
        this.matricula = matricula;
    }

    Estudante(){

    }

    public String getMatricula() {
        return matricula;
    }
}