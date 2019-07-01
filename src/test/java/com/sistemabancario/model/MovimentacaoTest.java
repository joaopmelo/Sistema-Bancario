package com.sistemabancario.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Manoel Campos da Silva Filho
 */
public class MovimentacaoTest {

    private  Movimentacao instancia = new Movimentacao();

    @Before
    public void setUp() {
//        instancia = new Movimentacao();
//        instancia.setValor(0);
//        System.out.println("Instanciado a Movimentacao");
    }

    @Test
    public void instanciaComoNaoConfirmada(){
        assertFalse(instancia.isConfirmada());
    }

    @Test
    public void setTipoCreditoMaiusculo() {
        final char esperado = 'C';
        instancia.setTipo(esperado);
        final char obtido = instancia.getTipo();
        assertEquals(esperado, obtido);
        instancia.setConfirmada(true);
    }

    @Test
    public void setTipoCreditoMinusculo() {
        final char esperado = 'c';
        instancia.setTipo(esperado);
        final char obtido = instancia.getTipo();
        assertEquals(esperado, obtido);
    }
    @Test
    public void setValorPositivo() {
        final char esperado = 100;
        instancia.setValor(esperado);
        final Double obtido = instancia.getValor();
        assertEquals(esperado, obtido, 0.0001);
    }

    @Test
    public void getPadraoC() {
        final char esperado = 'C';
        final char obtido = instancia.getTipo();
        assertEquals(esperado, obtido);
    }

    @Test
    public void setTipoInvalido() {
        final char invalido = 'x';

        try {
            instancia.setTipo(invalido);
        } catch (Exception e) {
        }
        final char obtido = instancia.getTipo();
        assertNotEquals(invalido, obtido);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setTipoInvalidoExcecao() {
        final char invalido = 'x';
        instancia.setTipo(invalido);
        final char obtido = instancia.getTipo();
        assertNotEquals(invalido, obtido);
    }
}