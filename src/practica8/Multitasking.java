package practica8;

import java.util.Scanner;

public class Multitasking {
	public void multitasking() {
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.printf("Introduzca: \n 1- Invertir palabra \n 2- Realizar dibujo \n 3- Hacer cálculo \n");
		int n = keyboard.nextInt();
		
		if (n == 1) {
			
		}
		else if (n == 2) {
			
		}
		else if (n == 3) {
			
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
