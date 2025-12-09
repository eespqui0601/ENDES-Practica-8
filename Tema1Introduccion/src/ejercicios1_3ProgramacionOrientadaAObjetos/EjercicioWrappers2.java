package ejercicios1_3ProgramacionOrientadaAObjetos;

public class EjercicioWrappers2 {
	
	public void exercise2() {
		System.out.println("Ejercicio 2:");
		/*Investiga en la API de Java para qué sirven los siguientes métodos de la clase Integer. Haz en el Eclipse un ejemplo de utilización para cada uno:*/
		Integer number = 8;

		// 1. byte byteValue()
		byte number2 = number.byteValue();
		System.out.println("Apartado 1: " + number2);
		System.out.println("byteValue --> Devuelve el valor del Integer como un byte \n");
		
		// 2. int intValue()
		int number3 = number.intValue();
		System.out.println("Apartado 2: " + number3);
		System.out.println("intValue --> Devuelve el valor del Integer como int \n");
		
		// 3. double doubleValue()
		double number4 = number.doubleValue();
		System.out.println("Apartado 3: " + number4);
		System.out.println("doubleValue --> Devuelve el valor del Integer como double \n");
		
		// 4. static String toHexString(int i)
		String hex = Integer.toHexString(10);
		System.out.println("Apartado 4: " + hex);
		System.out.println("toHexString --> Convierte un número int en su representación hexadecimal como String \n");
		
		// 5. static int parseInt(String s)
		int number5 = Integer.parseInt("123");
		System.out.println("Apartado 5: " + number5);
		System.out.println("parseInt --> Convierte un String con valores numéricos en un int \n");
		
		// 6. static Integer valueOf(int i)
		int number7 = 10;
		Integer number6 = Integer.valueOf(number7);
		System.out.println("Apartado 6: " + number6);
		System.out.println("valueOf(int) --> Devuelvo un valor objeto Integer en un int \n");
		
		// 7. static Integer valueOf(String s)
		String text = "10";
		Integer number8 = Integer.valueOf(text);
		System.out.println("Apartado 7: " + number8);
		System.out.println("valueOf(string) --> Convierte un String con valores numéricos en un objeto Integer \n");
	}

	public static void main(String[] args) {
		
		new EjercicioWrappers2().exercise2();
		
	}

}
