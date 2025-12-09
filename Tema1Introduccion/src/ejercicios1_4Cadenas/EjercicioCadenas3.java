package ejercicios1_4Cadenas;

import java.util.Scanner;

public class EjercicioCadenas3 {
	
	public void exercise3() {
		System.out.println("Introduzca una palabra: ");
		Scanner keyboard = new Scanner (System.in);
		String word = keyboard.nextLine();
		
		for (int i = word.length() - 1; i >= 0; i--) {
            word += word.charAt(i);
		}
		System.out.println("Después de invertir: " + word);
	}

	public static void main(String[] args) {
		
		new EjercicioCadenas3().exercise3();

	}

}
