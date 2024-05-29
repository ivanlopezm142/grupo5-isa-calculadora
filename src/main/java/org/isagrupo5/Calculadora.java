package org.isagrupo5;

public class Calculadora {

    // Método para sumar dos números
    public double sumar(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        return redondear(resultado);
    }

    // Método para restar dos números
    public double resta(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        return redondear(resultado);
    }

    // Método para multiplicar dos números
    public double multiplicacion(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        return redondear(resultado);
    }

    // Método para dividir dos números
    public double division(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        double resultado = numero1 / numero2;
        return redondear(resultado);
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
        double resultado = A - ((P * P) / (2.0 * A));
        return redondear(resultado);
    }

    //Método para redondear a 10^-3
    private double redondear(double valor) {
        int factor = 1;
        for (int i = 0; i < 3; i++) {
            factor *= 10;
        }
        if (valor >= 0) {
            return (double) ((int) (valor * factor + 0.5)) / factor;
        } else {
            return (double) ((int) (valor * factor - 0.5)) / factor;
        }
    }
}
