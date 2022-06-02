package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int qtdeItens;

    public GeraPedido() {
    }

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int qtdeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.qtdeItens = qtdeItens;
    }

    public void executar() {
        Pedido pedido = new Pedido(this.cliente, LocalDateTime.now(), new Orcamento(this.valorOrcamento, this.qtdeItens));

        System.out.println("Salvar pedido no banco de dados");
        System.out.println("Enviar e-mail com dados do novo pedido");
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getQtdeItens() {
        return qtdeItens;
    }

    public void setQtdeItens(int qtdeItens) {
        this.qtdeItens = qtdeItens;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrcamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }
}
