package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.PedidoRepository;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    //Contrutor da classe que realizar a injeção de dependencia: repository, service, etc;
    //public GeraPedidoHandler() {}

    public void executar(GeraPedido dados) {
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), new Orcamento(dados.getValorOrcamento(), dados.getQtdeItens()));

        EnviarEmailPedido emailPedido = new EnviarEmailPedido();
        emailPedido.executar(pedido);

        PedidoRepository pedidoRepository = new PedidoRepository();
        pedidoRepository.executar(pedido);
    }

}
