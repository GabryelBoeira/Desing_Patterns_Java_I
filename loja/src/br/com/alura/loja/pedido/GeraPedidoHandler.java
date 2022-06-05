package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGerarPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acaoList;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acaoList) {
        this.acaoList = acaoList;
    }

    public void executar(GeraPedido dados) {

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), new Orcamento(dados.getValorOrcamento(), dados.getQtdeItens()));
        acaoList.forEach(acao -> acao.executarAcao(pedido));
    }
}
