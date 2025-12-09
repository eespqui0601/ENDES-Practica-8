package ejercicios1_4Cadenas;

import java.util.Scanner;

public class EjercicioMetodoString9 {
	
	public void ex1() {
	
	System.out.println("Introduzca una palabra: ");
	Scanner keyboard = new Scanner (System.in);
	String word = keyboard.nextLine();
	String reverse = "";
	for (int i = word.length() - 1; i >= 0; i--) {
        reverse += word.charAt(i);
	}
	System.out.println("Después de invertir: " + reverse);
}

	public static void main(String[] args) {
		new EjercicioMetodoString9().ex1();

	}

}
