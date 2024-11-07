package br.com.minhaempresa.produto_api.produto.service;

import br.com.minhaempresa.produto_api.produto.entity.Produto;
import br.com.minhaempresa.produto_api.produto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto salvarProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public List<Produto> pegarProdutos(){
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarProdutoPorId(Long id){
        return produtoRepository.findById(id);
    }

    public void apagarProduto(Long id){
        produtoRepository.deleteById(id);
    }
}
