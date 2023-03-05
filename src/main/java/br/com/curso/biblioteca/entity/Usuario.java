package br.com.curso.biblioteca.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_USUARIO")
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