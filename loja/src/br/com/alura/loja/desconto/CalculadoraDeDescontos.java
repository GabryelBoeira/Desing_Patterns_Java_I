package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

	public BigDecimal calcularDesconto(final Orcamento orcamento) {

		Desconto desconto = 
				new DescontoPorOrcamentoMaiorQueQuinhentos(
						new DescontoParaQtdeItens(
								new SemDesconto()));

		return desconto.calcular(orcamento);
	}

}
