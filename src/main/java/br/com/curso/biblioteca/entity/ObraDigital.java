package br.com.curso.biblioteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import java.util.Date;

@MappedSuperclass
public class ObraDigital extends Obra{

    @Column( nullable = false)
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