package br.com.curso.biblioteca.entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Date;

@Entity
@Table(name = "TB_EXEMPLAR_OBRA")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Obra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @Column( nullable = false)
    protected String titulo;
    @Column( nullable = false)
    protected Date dataPublicacao;

    //OPCIONAL - Neste caso não seria mecessário o mapeamento bidirecional,
    //pois a obra em tese não precisa conhecre o emprestimo dela
    //@OneToOne(mappedBy = "obra")

    protected Emprestimo emprestimo;
    public Obra() {

    }

    public Obra(Long id, String titulo, Date dataPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }
}