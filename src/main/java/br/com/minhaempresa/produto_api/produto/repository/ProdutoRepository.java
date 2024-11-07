package br.com.minhaempresa.produto_api.produto.repository;

import br.com.minhaempresa.produto_api.produto.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
