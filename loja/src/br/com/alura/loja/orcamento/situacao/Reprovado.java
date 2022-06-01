package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.SituacaoOrcamento;

public class Reprovado extends SituacaoOrcamento {

    @Override
    public void reprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
