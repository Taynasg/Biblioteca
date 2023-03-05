package br.com.curso.biblioteca.entity;

import java.util.Date;

public class Emprestimo {
    private Long id;
    private Date date;

    Emprestimo() {
    }

    Emprestimo(Long id, Date date){
        this.id = id;
        this.date = date;
    }
    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }
}