package ejercicios1_4Cadenas;

import java.util.Scanner;

public class EjercicioMetodoString9 {
	
	public void ex1() {
	
	System.out.println("Introduzca un texto: ");
	Scanner keyboard = new Scanner (System.in);
	String word = keyboard.nextLine();
	String reverse = "";
	for (int i = word.length() - 1; i >= 0; i--) {
        reverse += word.charAt(i);
	}
	final String RED = "\u001B[31m";
	final String RESET = "\u001B[0m";

	System.out.println("Después de invertir: " + RED + reverse + RESET);
}

	public static void main(String[] args) {
		new EjercicioMetodoString9().ex1();

	}

}
