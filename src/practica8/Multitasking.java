package practica8;

import java.util.Random;
import java.util.Scanner;

public class Multitasking {

    // ===== COLORES PARA EL ÁRBOL =====
    public static final String ROJO = "\u001B[31m";
    public static final String AZUL = "\u001B[34m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String RESET = "\u001B[0m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO_FONDO = "\u001B[43m"; 

    // ===== MÉTODO QUE DIBUJA EL ÁRBOL =====
    public static void dibujarArbol(int altura) {
        Random rand = new Random();

        // Dibuja la copa del árbol
        for (int i = 1; i <= altura; i++) {

            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {

                if (i % 2 != 0 && j % 2 != 0) {
                    int color = rand.nextInt(3);
                    switch (color) {
                        case 0:
                            System.out.print(ROJO + "* " + RESET);
                            break;
                        case 1:
                            System.out.print(AZUL + "* " + RESET);
                            break;
                        case 2:
                            System.out.print(AMARILLO + "* " + RESET);
                            break;
                    }
                } else {
                    System.out.print(VERDE + "* " + RESET);
                }
            }
            System.out.println();
        }

        // Dibuja el tronco
        int alturaTronco = altura / 2;
        for (int i = 0; i < alturaTronco; i++) {

            for (int j = 0; j < altura - 2; j++) {
                System.out.print(" ");
            }

            System.out.print(AMARILLO_FONDO + "   " + RESET);
            System.out.println();
        }
    }

    // ===== PROGRAMA PRINCIPAL DEL MULTITASKING =====
    public void multitasking() {

        Scanner keyboard = new Scanner(System.in);

        System.out.printf("Introduzca: \n 1- Invertir palabra \n 2- Realizar dibujo \n 3- Hacer cálculo \n");
        int n = keyboard.nextInt();

        if (n == 1) {
            // Aquí iría el trabajo de otro compañero
        }

        else if (n == 2) {
            // === TU PARTE ===

            int altura;
            do {
                System.out.print("Introduce la altura del árbol (mínimo 4): ");
                altura = keyboard.nextInt();
            } while (altura < 4);

            dibujarArbol(altura);  
        }

        else if (n == 3) {
            // Aquí iría el trabajo de un tercero
        }

        else {
            while (n > 3) {
                System.out.println("error");
                n = keyboard.nextInt();
            }
        }

    }

    public static void main (String [] args) {
        new Multitasking().multitasking();
    }

}
