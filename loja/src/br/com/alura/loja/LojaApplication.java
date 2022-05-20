package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.tipoImposto.ICMS;
import br.com.alura.loja.imposto.tipoImposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class LojaApplication {

    public static void main(String[] args) {
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        Orcamento orcamento = new Orcamento(new BigDecimal("150"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento3 = new Orcamento(new BigDecimal("1000"), 2);

        System.out.println("======================");
        System.out.println("CalculadoraDeImpostos");
        System.out.println("ISS: " + calculadoraDeImpostos.calcular(orcamento, new ISS()));
        System.out.println("ICMS: " + calculadoraDeImpostos.calcular(orcamento, new ICMS()));

        System.out.println("======================");
        System.out.println("CalculadoraDeDesconto");
        System.out.println("Desconto por Qtde de produto: " + calculadoraDeDescontos.calcularDesconto(orcamento2));
        System.out.println("Desconto por valor total: " + calculadoraDeDescontos.calcularDesconto(orcamento3));

    }
}
