package ejercicios1_2Funciones;

public class Ejercicio1 {
	
	public void exercise1() {
		
		int a = 2, b = 1; 
		boolean c = true; 
		System.out.println(operation(6, 9, true)); 
		System.out.println(operation(6, 9, false)); 
		System.out.println(operation(a, b, c)); 
		System.out.println(operation(1 + 2, 1 - 2, 1 > 8));
		
	}
	public int operation(int num1, int num2, boolean b) {
		return b ? num1 + num2 : num1 - num2;
	}


	public static void main(String[] args) {
		
		new Ejercicio1().exercise1();
		
	}

}
