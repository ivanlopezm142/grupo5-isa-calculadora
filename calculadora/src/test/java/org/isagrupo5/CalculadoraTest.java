package org.isagrupo5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private Calculadora calculadoraTest = new Calculadora();


    //Bloque suma

    @Test
    public void testSumaDouble(){
        Double resultadoSuma = calculadoraTest.sumar(2.0, 4.0);
        Assertions.assertEquals(6.0, resultadoSuma, "La suma de 2.0 y 4.0 debería ser 6.0");
    }

    @Test
    public void testSumaFloat(){
        Double resultadoSuma = calculadoraTest.sumar(20f, 4.0f);
        Assertions.assertEquals(24.0f, resultadoSuma, "La suma de 20f y 4.0f debería ser 24.0f");
    }

    @Test
    public void testSumaInt(){
        Double resultadoSuma = calculadoraTest.sumar(2, 8);
        Assertions.assertEquals(10, resultadoSuma, "La suma de 2 y 8 debería ser 10");
    }

    @Test
    public void testSumaPosNeg(){
        Double resultadoSuma = calculadoraTest.sumar(-2.0, 8);
        Assertions.assertEquals(6.0, resultadoSuma, "La suma de 2 y 8 debería ser 10");
    }

    //Bloque resta

    @Test
    public void testRestaDouble(){
        Double resultadoSuma = calculadoraTest.resta(2.0, 4.0);
        Assertions.assertEquals(-2.0, resultadoSuma, "La resta de 2.0 y 4.0 debería ser -2.0");
    }

    @Test
    public void testRestaFloat(){
        Double resultadoSuma = calculadoraTest.resta(20f, 4.0f);
        Assertions.assertEquals(16.0f, resultadoSuma, "La resta de 20f y 4.0f debería ser 16.0f");
    }

    @Test
    public void testRestaInt(){
        Double resultadoSuma = calculadoraTest.resta(2, 8);
        Assertions.assertEquals(-6, resultadoSuma, "La resta de 2 y 8 debería ser -6");
    }

    @Test
    public void testRestaPosNeg(){
        Double resultadoSuma = calculadoraTest.resta(2.0, -8);
        Assertions.assertEquals(10.0, resultadoSuma, "La resta de 2.0 y -8 debería ser 10");
    }







}
