package com.sistemabancario.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaTest {

    @Test
    void testSetNumeroValido() {
        final Conta instance = new Conta();
        final String esperado = "12345-6";
        instance.setNumero(esperado);
        final String obtido = instance.getNumero();

    }

    @Test
    void testSetNumeroInvalidoExcecao() {
        final Conta instance = new Conta();
        final String invalido = "123";
        assertThrows(IllegalArgumentException.class, () -> instance.setNumero(invalido));
    }

    @Test
    void testSetNumeroInvalidoNaoArmazena() {
        final Conta instance = new Conta();
        final String invalido = "123";
        assertThrows(IllegalArgumentException.class, () -> instance.setNumero(invalido));
        final String obtido = instance.getNumero();
        assertNotEquals(invalido, obtido);
    }

    @Test
    void testInstanciaPadraoPoupanca() {
        final Conta instance = new Conta();
        assertFalse(instance.isPoupanca());
    }

    @Test
    void testLimiteContaEspecial() {
        final Conta instance = new Conta();
        instance.setEspecial(true);
        final double esperado = 1000;
        instance.setLimite(esperado);
        final double obtido = instance.getLimite();
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testSetLimiteContaNaoEspecial(){
        final Conta instance = new Conta ();
        final double limite = 1000;
         assertThrows(IllegalStateException.class, () -> instance.setLimite(limite));        
    }
    
    @Test
    void testHistoricoNotNull(){
        final Conta instance = new Conta ();
        assertNotNull(instance.getMovimentacoes());
    }
    
    @Test
    void testGetSaldoTotal(){
        final double limite = 500;
        final double esperado = limite;
        final Conta instance = new Conta ();
        instance.setEspecial(true);
        instance.setLimite(limite);
        final double obtido = instance.getSaldoTotal();
        assertEquals(esperado, obtido);
    }

    @Test
    void testAddMovimentacao() {
        //TODO: Você precisa implementar este teste
    }

}
