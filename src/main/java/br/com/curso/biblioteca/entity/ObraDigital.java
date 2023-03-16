package br.com.curso.biblioteca.entity;


import jakarta.persistence.MappedSuperclass;

import java.util.Date;

@MappedSuperclass
public abstract class ObraDigital extends Obra{

    protected String url;

    public ObraDigital(){

    }

    public ObraDigital(Long id, String titulo, Date dataPublicacao, String url) {
        super(id, titulo,dataPublicacao );
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}