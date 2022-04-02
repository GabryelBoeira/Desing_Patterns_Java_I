package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.tipoImposto.ICMS;
import br.com.alura.loja.imposto.tipoImposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class LojaApplication {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("150"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        System.out.println("ISS: " + calculadora.calcular(orcamento, new ISS()));
        System.out.println("ICMS: " + calculadora.calcular(orcamento, new ICMS()));
    }
}
