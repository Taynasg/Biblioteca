package br.com.curso.biblioteca.entity;

import java.util.Date;

public class ObraDigital extends Obra{

    protected String url;

    ObraDigital(Long id, String titulo, Date dataPublicacao, String url) {
        super(id, titulo,dataPublicacao );
        this.url = url;
    }

    ObraDigital() {

    }

    public String getUrl() {
        return url;
    }
}