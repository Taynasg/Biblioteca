package br.com.curso.biblioteca.repository;


import br.com.curso.biblioteca.entity.Livro;
import br.com.curso.biblioteca.entity.Obra;
import br.com.curso.biblioteca.entity.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface UsuarioRepoitory extends JpaRepository<Usuario, Long> {

    // Pesquisando usuáio por id
    public Livro findByID(String isbn);

    @Query(name = "buscaUsuarioPorNomeOuRg")
    List<Usuario> buscaPorNomeOuRg(@Param("nome") String nome, @Param("rg") String rg);

    @Query(name = "buscaUsuarioPorOrdemAlfabetica")
    List<Usuario> buscaPorOrdemAlfabetica();

    @Query(name = "buscaUsuarioPorOrdemDeId")
    List<Usuario> buscaPorOrdemDeId();

    @Query(name = "buscaObrasEmprestadasParaUsuario")
    List<Obra> obrasEmprestadasParaUsuario(@Param("usuario") Usuario usuario);
}


