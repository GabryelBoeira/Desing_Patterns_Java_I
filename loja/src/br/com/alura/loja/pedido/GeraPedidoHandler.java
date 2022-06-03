package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    //Contrutor da classe que realizar a injeção de dependencia: repository, service, etc;
    //public GeraPedidoHandler() {}

    public void executar(GeraPedido dados) {
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), new Orcamento(dados.getValorOrcamento(), dados.getQtdeItens()));

        System.out.println("Salvar pedido no banco de dados");
        System.out.println("Enviar e-mail com dados do novo pedido");
    }

}
