package br.com.curso.biblioteca.entity;

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