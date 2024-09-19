package br.com.teste.tdd.service;

import br.com.teste.tdd.modelo.Desempenho;
import br.com.teste.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
    public void concerderReajuste(Funcionario funcionario, Desempenho desempenho) {
        if(desempenho == Desempenho.A_DESEJAR){
            BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
            funcionario.reajustarSalario(reajuste);
        }

    }
}
