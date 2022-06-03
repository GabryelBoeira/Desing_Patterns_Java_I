package br.com.alura.loja.pedido;

import java.math.BigDecimal;

public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int qtdeItens;

    public GeraPedido() {}

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int qtdeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.qtdeItens = qtdeItens;
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
