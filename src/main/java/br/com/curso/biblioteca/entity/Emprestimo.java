package br.com.curso.biblioteca.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name ="TB_EMPRESTIMO")
@NamedStoredProcedureQuery(
        name = "atrasos",
        procedureName = "proc_qtde_emprestimos_em_atraso",
        parameters = {
                @StoredProcedureParameter(
                        mode = ParameterMode.OUT,
                        name = "quantidade",
                        type = Integer.class)

        })
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
/*
    @OneToOne
    @JoinColumn(name = "idObra", referencedColumnName = "id")
    private Obra obra;

    @ManyToOne
    @JoinColumn(name = "idUsuario", referencedColumnName = "id")
    private Usuario usuario;
*/
    public Emprestimo() {
    }

    public Emprestimo(Long id, Date data, Usuario usuario, Obra obra) {
        super();
        this.id = id;
        this.data = data;
       // this.usuario = usuario;
        //this.obra = obra;
    }

    public Long getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

   /* public Usuario getUsuario() {
        return usuario;
   }

    public Obra getObra() {
        return obra;
    }
*/
}
