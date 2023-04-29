package br.com.curso.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.curso.biblioteca.entity.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

    // Pesquisando por palavras-chaves
    public Livro findByIsbn(String isbn);

    // Pesquisando por query nativa
    @Query(value =
            "SELECT \r\n"
                    + " ROUND(DATEDIFF(NOW(), o.data_publicacao) / 365) AS anos_publicacao\r\n"
                    + "FROM \r\n"
                    + " biblioteca.tb_exemplar_livro l,\r\n"
                    + " biblioteca.tb_exemplar_obra o\r\n"
                    + "WHERE\r\n"
                    + " l.id_obra = o.id\r\n"
                    + " AND o.id = :id", nativeQuery = true)
    public Integer quantosAnosPublicacaoLivro(@Param("id") Long idLivro);

    @Query(name = "buscaTodosOrdenadosTitulo")
    public List<Livro> buscaTodosOrdenadosTitulo();

    @Query(name = "buscaTodosOrdenadosAutor")
    public List<Livro> buscaTodosOrdenadosAutor();

    @Query(name = "buscaMaisAntigo")
    public String buscaMaisAntigo();

    @Transactional(readOnly = false)
    @Modifying
    @Query("UPDATE Livro SET isbn = :isbn WHERE id = :id")
    public void atualizaIsbnLivro(@Param("id") Long idLivro, @Param("isbn") String isbn);

    @Transactional(readOnly = false)
    @Modifying
    @Query("DELETE FROM Livro WHERE id = :id")
    public void apagaLivro(@Param("id") Long idLivro);

}
