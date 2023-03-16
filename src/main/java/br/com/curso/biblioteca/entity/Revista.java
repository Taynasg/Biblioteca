package br.com.curso.biblioteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "TB_EXEMPLAR_REVISTTA")
@PrimaryKeyJoinColumn(name = "idObra")
public class Revista extends ObraFisica {
    @Override
    @Column(nullable = false)
    public String getCodLocalizacao() {
        return super.getCodLocalizacao();
    }

    @Column(nullable = true)
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

    @Override
    public String toString() {
        return "Revista [id=" + id + ", titulo=" + titulo + ", dataPublicacao=" + dataPublicacao + ", codLocalizacao="
                + codLocalizacao + ", numero=" + numero + "]";
    }

}