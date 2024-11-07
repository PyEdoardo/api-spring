package br.com.minhaempresa.produto_api.produto.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@Entity
public class Produto {

  @Id //jakarta
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull(message = "O nome do produto é obrigatório.")
  @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres.")
  @Column(nullable = false)
  private String nome;

  @Size(max = 255, message = "A descrição não pode ultrapassar 255 caracteres.")
  private String descricao;

  @NotNull(message = "O preço do produto é obrigatório.")
  @Positive(message = "O preço deve ser um valor positivo.")
  @Column(nullable = false)
  private BigDecimal preco;

  @NotNull(message = "A quantidade em estoque é obrigatória.")
  @Positive(message = "A quantidade em estoque deve ser um valor positivo.")
  @Column(nullable = false)
  private Integer estoque;

  @Column(name = "data_criacao", nullable = false, updatable = false)
  private LocalDateTime dataCriacao;

  public Produto() {}

  public Produto(String nome, String descricao, BigDecimal preco, Integer estoque) {
    this.nome = nome;
    this.descricao = descricao;
    this.preco = preco;
    this.estoque = estoque;
    this.dataCriacao = LocalDateTime.now();
  }

  @PrePersist
  protected void onCreate() {
    this.dataCriacao = LocalDateTime.now();
  }


}

