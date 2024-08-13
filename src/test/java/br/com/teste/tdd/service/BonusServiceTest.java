package br.com.teste.tdd.service;

import br.com.teste.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {
    @Test
    void bonusDeveriaSerZeroParaFuncionarioComSalarioMaiorQue10000() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario(
                "Thiago", LocalDate.now(), new BigDecimal("25000")));

        assertEquals(BigDecimal.ZERO, bonus);
    }

    @Test
    void bonusDeveriaSer10PorCentoParaFuncionarioComSalarioMenorQue10000() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario(
                "Thiago", LocalDate.now(), new BigDecimal("5000")));

        assertEquals(new BigDecimal("500.0"), bonus);
    }

    @Test
    void bonusDeveriaSer10PorCentoParaFuncionarioComSalarioIgualA10000() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario(
                "Thiago", LocalDate.now(), new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.0"), bonus);
    }
}
