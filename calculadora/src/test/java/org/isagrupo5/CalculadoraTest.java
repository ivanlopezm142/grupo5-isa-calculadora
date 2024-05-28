package org.isagrupo5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private Calculadora calculadoraTest = new Calculadora();


    //Bloque suma

    @Test
    public void testSumaDouble(){
        Assertions.assertEquals(6.0, calculadoraTest.sumar(2.0, 4.0), "La suma de 2.0 y 4.0 debería ser 6.0");
    }

    @Test
    public void testSumaFloat(){
        Assertions.assertEquals(24.0f, calculadoraTest.sumar(20f, 4.0f), "La suma de 20f y 4.0f debería ser 24.0f");
    }

    @Test
    public void testSumaInt(){
        Assertions.assertEquals(10, calculadoraTest.sumar(2, 8), "La suma de 2 y 8 debería ser 10");
    }

    @Test
    public void testSumaPosNeg(){
        Assertions.assertEquals(6.0, calculadoraTest.sumar(-2.0, 8), "La suma de 2 y 8 debería ser 10");
    }

    //Bloque resta

    @Test
    public void testRestaDouble(){
        Assertions.assertEquals(-2.0, calculadoraTest.resta(2.0, 4.0), "La resta de 2.0 y 4.0 debería ser -2.0");
    }

    @Test
    public void testRestaFloat(){
        Assertions.assertEquals(16.0f, calculadoraTest.resta(20f, 4.0f), "La resta de 20f y 4.0f debería ser 16.0f");
    }

    @Test
    public void testRestaInt(){
        Assertions.assertEquals(-6, calculadoraTest.resta(2, 8), "La resta de 2 y 8 debería ser -6");
    }

    @Test
    public void testRestaPosNeg(){
        Assertions.assertEquals(10.0, calculadoraTest.resta(2.0, -8), "La resta de 2.0 y -8 debería ser 10");
    }

    //Bloque multiplicación

    @Test
    public void testMultiplicacionPosNeg(){
        Assertions.assertEquals(-16.0, calculadoraTest.multiplicacion(2.0, -8), "La multiplicación de 2.0 y -8 debería ser -16");
    }

    @Test
    public void testMultiplicacionInt(){
        Assertions.assertEquals(10, calculadoraTest.multiplicacion(2, 5), "La multiplicación de 2 y 5 debería ser 10");
    }

    @Test
    public void testMultiplicacionDouble(){
        Assertions.assertEquals(10.5, calculadoraTest.multiplicacion(2.5, 4.2), "La multiplicación de 2.5 y 4.2 debería ser 10.5");
    }

    @Test
    public void testMultiplicacionFloat(){
        Assertions.assertEquals(80.0f, calculadoraTest.multiplicacion(20f, 4.0f), "La multiplicación de 20f y 4.0f debería ser 80.0f");
    }
















}
