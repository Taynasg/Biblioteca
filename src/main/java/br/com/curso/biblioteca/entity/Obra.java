package br.com.curso.biblioteca.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
@Entity
@Table(name = "TB_EXEMPLAR_OBRA")
public abstract class Obra {

    protected Long id;

    protected String titulo;

    protected Date dataPublicacao;

    public Obra(){

    }

    public Obra(Long id, String titulo, Date dataPublicacao){
        this.id = id;
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }
}