package practica8;

import java.util.Scanner;

public class Multitasking {
	public void multitasking() {
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.printf("Introduzca: \n 1- Invertir palabra \n 2- Realizar dibujo \n 3- Hacer cálculo \n");
		int n = keyboard.nextInt();
		
		if (n == 1) { //Invertir palabra
			
		}
		else if (n == 2) { //Realizar dibujo
			
		}
		else if (n == 3) { //Hacer cálculo
			System.out.println("Introduzca el primer número para la cuenta: ");
			int num1 = keyboard.nextInt();
			
			System.out.println("Introduzca el segundo número para la cuenta: ");
			int num2 = keyboard.nextInt();
			
			System.out.printf("Seleccione la cuenta a reallizar: \n 1- Suma \n 2- Resta \n 3- Multiplicación \n");
			int selection = keyboard.nextInt();
			
			if (selection == 1) {
				int total = num1 + num2;
				System.out.println("El resultado es " + total);
			}
			else if (selection == 2) {
				int total = num1 - num2;
				System.out.println("El resultado es " + total);
			}
			else if (selection == 3) {
				int total = num1 * num2;
				System.out.println("El resultado es " + total);
			}
			else {
				while (selection > 3) {
					System.out.println("error");
					selection = keyboard.nextInt();
				}
			}
			System.out.println("Cálculo realizado con exito");
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
