package ejercicios1_4Cadenas;

public class EjercicioCadenas4 {
	
	public void exercise4() {
		System.out.println("Ejercicio 4:");
		/*Dada la cadena "      Bienvenidos al módulo de PROGRAMACIÓN      ";
		Utiliza anidación de métodos para realizar las siguientes acciones en una sola línea:
			Eliminar los espacios en blanco al inicio y al final.
			Convertir toda la cadena a minúsculas.
			Sustituir la palabra "programación" por "Java".
			Mostrar el resultado por consola.
		Ejemplo de salida esperada:
		bienvenidos al módulo de java*/
		
		String text = "      Bienvenidos al módulo de PROGRAMACIÓN     ";
		
		// Esto es anidar métodos	
		System.out.println(text.trim().toLowerCase().replace("programación", "java"));
	}

	public static void main(String[] args) {

		new EjercicioCadenas4().exercise4();

	}

}
