package br.com.curso.biblioteca.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
@Entity
@Table(name = "TB_EMPRESTIMO")
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