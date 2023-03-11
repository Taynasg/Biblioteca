package br.com.curso.biblioteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
@Entity
@Table(name = "TB_POSTAGEM")
public class Postagem extends ObraDigital {

    @Column( nullable = false)
    private Enum plataforma;
    @Column( nullable = false)
    private String conteudo;

    public Postagem(Long id, String titulo, Date dataPublicacao, String codLocalizacao, Enum plataforma, String conteudo) {
        super(id,titulo, dataPublicacao,codLocalizacao);
        this.plataforma = plataforma;
        this.conteudo = conteudo;
    }

    Postagem() {

    }

    public Enum getPlataforma() {
        return plataforma;
    }

    public String getConteudo() {
        return conteudo;
    }
}