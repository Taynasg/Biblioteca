
package br.com.curso.biblioteca.entity;

import java.util.Date;

public class ObraFisica extends Obra {

    protected String codLocalizacao;

    ObraFisica() {
    }

    public ObraFisica(Long id, String titulo, Date dataPublicacao, String codLocalizacao) {
        super(id, titulo, dataPublicacao);
        this.codLocalizacao = codLocalizacao;
    }


    public String getCodLocalizacao() {
        return codLocalizacao;
    }
}