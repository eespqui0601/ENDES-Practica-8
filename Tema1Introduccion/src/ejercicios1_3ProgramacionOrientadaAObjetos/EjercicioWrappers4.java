package ejercicios1_3ProgramacionOrientadaAObjetos;

public class EjercicioWrappers4 {
	
	public void exercise4() {
		System.out.println("Ejercicio 4:");
		/*Declara un booleano, un entero, un carácter y un decimal. Inicialízalas. Luego, transforma todas las variables a variables cadena.
		 Luego, obtener una cadena resultante de concatenar todas las cadenas obtenidas anteriormente. Muestra esta cadena resultante por pantalla.*/
		
		// Primero declaro las variables
		boolean b = true;
		int i = 20;
		char c = 'a';
		double d = 2.54;
		
		// Las transformo en cadena, se refiere a meterlas en un String
		String stringboolean = String.valueOf(b);
		String stringint = String.valueOf(i);
		String stringchar = String.valueOf(c);
		String stringdouble = String.valueOf(d);
		
		// Las concadeno todas en una misma
		String all = stringboolean + stringint + stringchar + stringdouble;
		
		// Lo muestro
		System.out.println(all);
		
	}

	public static void main(String[] args) {

		new EjercicioWrappers4().exercise4();

	}

}
