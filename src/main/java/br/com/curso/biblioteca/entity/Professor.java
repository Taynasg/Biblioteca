package br.com.curso.biblioteca.entity;

public class Professor extends Usuario {

    private String titulacao;

    Professor() {
    }


    Professor(Long id,String nome,String rg,String email,String titulacao) {
        super(id,nome,rg,email);
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

}