package br.com.curso.biblioteca.entity;

import java.util.Date;

public class Postagem extends ObraDigital {

    private Enum plataforma;
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