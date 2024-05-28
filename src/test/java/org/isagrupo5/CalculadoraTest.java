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

    //Bloque división

    @Test
    public void testDivisionPosNeg(){
        Assertions.assertEquals(0.25, calculadoraTest.division(2.0, -8), "La división de 2.0 y -8 debería ser -0.25");
    }

    @Test
    public void testDivisionInt(){
        Assertions.assertEquals(10, calculadoraTest.division(2, 5), "La división de 2 y 5 debería ser 0.4");
    }

    @Test
    public void testDivisionDouble(){
        //Dividir 2.5/4.2 da como resultado: 0.5952380952
        //Lo que hacemos es ajustarnos a 10^-3 y usar el anterior y posterior.
        //El resultado de la calculadora debería estar entre ambos
        //Anterior: 0.594
        //Posterior: 0.596
        Assertions.assertTrue("Error, el resultado es demasiado alto.",  0.596 >= calculadoraTest.division(2.5, 4.2));
        Assertions.assertTrue("Error, el resultado es demasiado bajo.",  0.594 < calculadoraTest.division(2.5, 4.2));
    }

    @Test
    public void testDivisionFloat(){
        //Comprobamos que la calculadora no permite la introducción de números negativos, dando una excepción
        Assertions.assertEquals(5.0f, calculadoraTest.division(-2), "La división de 20f y 4.0f debería ser 5f");
    }


    //Bloque raíz cuadrada

    @Test
    public void testRaizNeg(){
        //Cuando se programe la raíz cuadrada, hacer una excepción personalizada llamada "ExceptionNumNegativo" que se usará aquí
        //Además de un mensaje del estilo: "No se permiten números negativos"
        Exception exception = Assertions.assertThrows(ExceptionNumNegativo.class, () -> {calculadoraTest.raizCuadrada(-8);});
        String mensajeError = "números negativos";
        String mensajeSalida = exception.getMessage();
        Assertions.assertTrue(mensajeSalida.contains(mensajeError));
    }

    @Test
    public void testRaizIntExact(){
        Assertions.assertEquals(4, calculadoraTest.raizCuadrada(16), "La raíz cuadrada de 16 debería ser 4");
    }

    @Test
    public void testRaizIntInex(){
        //Raíz de 30 da como resultado: 5.477225575
        //Lo que hacemos es ajustarnos a 10^-3 y usar el anterior y posterior.
        //El resultado de la calculadora debería estar entre ambos
        //Anterior: 5.478
        //Posterior: 5.476
        Assertions.assertTrue("Error, el resultado es demasiado alto.",  5.478 >= calculadoraTest.raizCuadrada(30));
        Assertions.assertTrue("Error, el resultado es demasiado bajo.",  5.476 < calculadoraTest.raizCuadrada(30));
    }

















}
