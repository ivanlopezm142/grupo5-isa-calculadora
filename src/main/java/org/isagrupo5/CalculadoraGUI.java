package org.isagrupo5;

import org.isagrupo5.Calculadora;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class CalculadoraGUI extends JFrame implements ActionListener {

    private Calculadora calculadora;

    JPanel panelPantalla;
    JPanel panelBotones;

    JTextField pantalla;

    JButton[] botonesNumeros;
    JButton botonSumar, botonRestar, botonMultiplicar, botonDividir, botonIgual, botonLimpiar, botonRaizCuadrada;

    double num1, num2, resultado;
    char operador;

    public CalculadoraGUI() {
        super("Calculadora");
        calculadora = new Calculadora();
        initGUI();
    }

    private void initGUI() {
        // PANEL PANTALLA
        panelPantalla = new JPanel();
        pantalla = new JTextField(20);
        pantalla.setEditable(false);
        panelPantalla.add(pantalla);

        // PANEL BOTONES
        panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(5, 4, 5, 5));

        botonesNumeros = new JButton[10];
        for (int i = 0; i < 10; i++) {
            botonesNumeros[i] = new JButton(String.valueOf(i));
            botonesNumeros[i].addActionListener(this);
        }

        // Añadir botones
        panelBotones.add(botonesNumeros[1]);
        panelBotones.add(botonesNumeros[2]);
        panelBotones.add(botonesNumeros[3]);
        panelBotones.add(botonSumar = new JButton("+"));

        panelBotones.add(botonesNumeros[4]);
        panelBotones.add(botonesNumeros[5]);
        panelBotones.add(botonesNumeros[6]);
        panelBotones.add(botonRestar = new JButton("-"));

        panelBotones.add(botonesNumeros[7]);
        panelBotones.add(botonesNumeros[8]);
        panelBotones.add(botonesNumeros[9]);
        panelBotones.add(botonMultiplicar = new JButton("*"));

        panelBotones.add(botonLimpiar = new JButton("C"));
        panelBotones.add(botonesNumeros[0]);
        panelBotones.add(botonRaizCuadrada = new JButton("√"));
        panelBotones.add(botonDividir = new JButton("/"));

        panelBotones.add(new JLabel("")); // Espacio vacío al no haber botón en esa posición
        panelBotones.add(botonIgual = new JButton("="));
        panelBotones.add(new JLabel("")); // Espacio vacío al no haber botón en esa posición

        // Añadir ActionListeners a los botones de operaciones
        botonSumar.addActionListener(this);
        botonRestar.addActionListener(this);
        botonMultiplicar.addActionListener(this);
        botonDividir.addActionListener(this);
        botonIgual.addActionListener(this);
        botonLimpiar.addActionListener(this);
        botonRaizCuadrada.addActionListener(this);

        // JFrame
        this.setLayout(new BorderLayout());
        this.add(panelPantalla, BorderLayout.NORTH);
        this.add(panelBotones, BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Cierra la aplicación al cerrar la ventana
        this.setVisible(true);   // Hace visible la ventana. Por defecto JFrame no es visible
        this.pack();
    }

    public static void main(String[] args) {
        new CalculadoraGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == botonesNumeros[i]) {
                pantalla.setText(pantalla.getText() + i);
                return;
            }
        }

        if (e.getSource() == botonSumar) {
            num1 = Double.parseDouble(pantalla.getText());
            operador = '+';
            pantalla.setText("");
        } else if (e.getSource() == botonRestar) {
            num1 = Double.parseDouble(pantalla.getText());
            operador = '-';
            pantalla.setText("");
        } else if (e.getSource() == botonMultiplicar) {
            num1 = Double.parseDouble(pantalla.getText());
            operador = '*';
            pantalla.setText("");
        } else if (e.getSource() == botonDividir) {
            num1 = Double.parseDouble(pantalla.getText());
            operador = '/';
            pantalla.setText("");
        } else if (e.getSource() == botonRaizCuadrada) {
            num1 = Double.parseDouble(pantalla.getText());
            resultado = calculadora.raizCuadrada((int) num1);
            pantalla.setText(String.valueOf(resultado));
        } else if (e.getSource() == botonIgual) {
            num2 = Double.parseDouble(pantalla.getText());
            switch (operador) {
                case '+':
                    resultado = calculadora.sumar(num1, num2);
                    break;
                case '-':
                    resultado = calculadora.resta(num1, num2);
                    break;
                case '*':
                    resultado = calculadora.multiplicacion(num1, num2);
                    break;
                case '/':
                    resultado = calculadora.division(num1, num2);
                    break;
            }
            pantalla.setText(String.valueOf(resultado));
        } else if (e.getSource() == botonLimpiar) {
            pantalla.setText("");
        }
    }
}
