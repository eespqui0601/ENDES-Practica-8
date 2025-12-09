package ejercicios1_4Cadenas;

public class EjercicioCadenas1 {
	
	public void exercise1() {
		System.out.println("Ejercicio 1:");
		/*Usa la interfaz CharSequence para acceder a una subcadena de una cadena y mostrarla por consola.*/
		
		CharSequence text = "Estoy aprendiendo a programar";
		CharSequence subtext = text.subSequence(4, 12);
		
		System.out.println("Cadena completa: " + text);
		System.out.println("Subcadena: " + subtext);
	}
	
	public static void main(String[] args) {
		
		new EjercicioCadenas1().exercise1();
	}

}
