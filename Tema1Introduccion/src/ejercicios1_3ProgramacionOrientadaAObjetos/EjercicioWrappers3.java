package ejercicios1_3ProgramacionOrientadaAObjetos;

public class EjercicioWrappers3 {
	
	public void exercise3() {
		System.out.println("Ejercicio 3:");
		/*Investiga en la API de Java para qué sirven los siguientes métodos de la clase Double. Haz en el Eclipse un ejemplo de utilización para cada uno:*/
		Double d = 2.005;
		// 1. float floatValue()
		float number1 = d.floatValue();
		System.out.println("Apartado 1: " + number1);
		System.out.println("floatValue --> Devuelve el valor Double introducido como float (primitivo) \n");
		
		// 2. double doubleValue()
		double number = d.doubleValue();
		System.out.println("Apartado 2: " + number);
		System.out.println("doubleValue --> Devuelve el valor Double introducido como double (primitivo) \n");
		
		// 3. boolean isInfinite()
		System.out.println("Apartado 3: " + d.isInfinite());
		System.out.println("isInfinite --> Devuelve true si es infinito, false si no es infinito \n");
		
		// 4. static boolean isInfinite(double v)
		System.out.println("Apartado 4: " + Double.isInfinite(10.0/0.0) + " o " + Double.isInfinite(15.0));
		System.out.println("isInfinite --> Devuelve true si es infinito, false si no es infinito \n");
		
		// 5. boolean isNaN()
		System.out.println("Apartado 5: " + d.isNaN());
		System.out.println("isNaN --> Devuelve true si el valor no es un número y false si es un número \n");
		
		// 6. static double min(double a, double b)
		System.out.println("Apartado 6: " + Double.min(15.56, 85.65));
		System.out.println("min --> Devuelve el menor de los dos números \n");
			
		// 7. static double parseDouble(String s)
		double number2 = Double.parseDouble("5.652");
		System.out.println("Apartado 7: " + number2);
		System.out.println("parseDouble --> Convierte un String en un valor double(primitivo) \n");
		
		// 8. static Double valueOf(double d)
		Double number3 = Double.valueOf(5.5);
		System.out.println("Apartado 8: " + number3);
		System.out.println("valueOf(double) --> Devuelve el valor introducido en un double a un Double \n");
		
		// 9. static Double valueOf(String s)
		Double number4 = Double.valueOf("748.6254");
		System.out.println("Apartado 9: " + number4);
		System.out.println("valueOf(string) --> Convierte un String en un valor Double \n");	
	}

	public static void main(String[] args) {
		
		new EjercicioWrappers3().exercise3();

	}

}
