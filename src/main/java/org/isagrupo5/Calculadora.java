package org.isagrupo5;

public class Calculadora {

    // Método para sumar dos números
    public double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    // Método para restar dos números
    public double resta(double numero1, double numero2) {
        return numero1 - numero2;
    }

    // Método para multiplicar dos números
    public double multiplicacion(double numero1, double numero2) {
        return numero1 * numero2;
    }

    // Método para dividir dos números
    public double division(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return numero1 / numero2;
    }

    // Método para calcular la raíz cuadrada usando la aproximación de Bakhshali
    public double raizCuadrada(int numero) {
        if (numero < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo");
        }

        // Encontrar el cuadrado perfecto más cercano
        int pSq = 0;
        int N = 0;

        for (int i = numero; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (j * j == i) {
                    pSq = i;
                    N = j;
                    break;
                }
            }
            if (pSq > 0) {
                break;
            }
        }

        double d = numero - pSq;
        double P = d / (2.0 * N);
        double A = N + P;

        // Calcular sqrt(número)
        return A - ((P * P) / (2.0 * A));
    }
}
