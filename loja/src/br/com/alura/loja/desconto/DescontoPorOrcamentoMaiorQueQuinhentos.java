package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoPorOrcamentoMaiorQueQuinhentos extends Desconto {

	public DescontoPorOrcamentoMaiorQueQuinhentos(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcular(final Orcamento orcamento) {

		if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0)
			return orcamento.getValor().multiply(new BigDecimal("0.05"));

		return proximo.calcular(orcamento);
	}

}
