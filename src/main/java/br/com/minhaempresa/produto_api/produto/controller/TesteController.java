package br.com.minhaempresa.produto_api.produto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/teste-controller")
public class TesteController {

  @GetMapping
  public String getMensagemTeste() {
    return "Servidor funcionando";
  }

}
