package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoParaQtdeItens extends Desconto {

	public DescontoParaQtdeItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcular(final Orcamento orcamento) {

		if (orcamento.getQtdeItens() > 5)
			return orcamento.getValor().multiply(new BigDecimal("0.1"));

		return proximo.calcular(orcamento);
	}

}
