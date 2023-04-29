package br.com.curso.biblioteca.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "TB_USUARIO")
@PrimaryKeyJoinColumn(name = "idUsuario")
@NamedQueries({
        @NamedQuery(name = "buscaUsuariosPorNomeouRg" ,query = "SELECT u FROM Usuario u WHERE u.nome = :nome OR u.rg = :rg"),
        @NamedQuery(name = "buscaUsuarioPorOrdemAlfabetica", query = "SELECT u FROM Usuario u ORDER BY u.nome ASC"),
        @NamedQuery(name = "buscaUsuarioPorOrdemDeId", query = "SELECT u FROM Usuario u ORDER BY u.id"),
        @NamedQuery(name = "buscaObrasEmprestadasParaUsuario", query = "SELECT o FROM Obra o WHERE o.usuario = :usuario"),
})
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column( nullable = false)
    protected Long id;
    @Column( nullable = false)
    protected String nome;
    @Column( nullable = false)
    protected String rg;
    @Column( nullable = false)
    protected String email;

    //@OneToMany(mappedBy = "usuario")
    //protected List<Emprestimo> emprestimos;

    public Usuario(){

    }

    public Usuario(Long id, String nome, String rg, String email){
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.email = email;

    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public String getEmail() {
        return email;
    }
}