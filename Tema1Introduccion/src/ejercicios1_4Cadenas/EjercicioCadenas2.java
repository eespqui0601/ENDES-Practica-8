package ejercicios1_4Cadenas;

public class EjercicioCadenas2 {
	
	public void exercise2() {
		System.out.println("Ejercicio 2:");
		/*Une varias palabras en una sola usando el método join. Usa el delimitador coma y espacio para separar las palabras.*/
		String text = String.join(", ", "Rojo", "Azul", "Amarillo", "Verde", "Negro", "Blanco");
		
		System.out.println(text);
	}
	
	public static void main(String[] args) {
		
		new EjercicioCadenas2().exercise2();
	}

}
