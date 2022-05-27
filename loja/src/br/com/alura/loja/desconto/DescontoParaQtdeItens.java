package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoParaQtdeItens extends Desconto {

	public DescontoParaQtdeItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(final Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQtdeItens() > 5;
	}

}
