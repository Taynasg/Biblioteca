package br.com.curso.biblioteca.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
@Entity
@Table(name = "TB_EXEMPLAR_REVISTTA")
public class Revista extends ObraFisica {

    private Integer numero;


    public Revista() {
    }

    public Revista(Long id, String titulo, Date dataPublicacao, String codLocalizacao, Integer numero) {
        super(id, titulo, dataPublicacao, codLocalizacao);
        this.numero = numero;

    }

    public Integer getNumero() {
        return numero;
    }
}