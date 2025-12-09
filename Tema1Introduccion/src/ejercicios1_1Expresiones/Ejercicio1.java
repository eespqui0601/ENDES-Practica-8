package ejercicios1_1Expresiones;

public class Ejercicio1 {
	
	public void exercise1() {
		
		int result1, result2;
		boolean result3, result4, result5;
		
		result1=3 * 5 - 4 / 2;
		result2=7 - 4 * 2 - 5 * 2;
		result3=5 + 4 < 7 + 8;
		result4=4 < 5 * 4 / 2 - 7;
		result5=!(4 > 6);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
	}

	public static void main(String[] args) {
		
		new Ejercicio1() .exercise1();

	}

}
