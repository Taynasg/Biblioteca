package br.com.curso.biblioteca.entity;

public class Usuario {

    protected Long id;
    protected String nome;
    protected String rg;
    protected String email;

    public Usuario(){

    }

    public Usuario(Long id, String nome, String rg, String email){
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.email = email;

    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public String getEmail() {
        return email;
    }
}