package br.com.curso.biblioteca.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "TB_EMPRESTIMO")
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @OneToOne
    @JoinColumn(name = "idObra", referencedColumnName = "id")
    private Obra obra;

   @ManyToOne
   @JoinColumn(name = "idUsuario", referencedColumnName = "id")
    private Usuario usuario;
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