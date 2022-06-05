package br.com.alura.loja.pedido;

import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.PedidoRepository;

import java.math.BigDecimal;
import java.util.Arrays;

public class PedidoTeste {

    public static void main(String[] args) {

        String cliente = "Gabryel";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int qtdeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente,valorOrcamento, qtdeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new PedidoRepository(), new EnviarEmailPedido())
        );

        handler.executar(gerador);
    }
}
