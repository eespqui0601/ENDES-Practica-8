package ejercicios1_1Expresiones;

public class Ejercicio2 {
	
	public void exercise2() {
		
		boolean a=true,b=false,c=true, result1, result2, result3, result4;
		
		result1=a && b  || a && c;
		result2=(a || ! b) && (! a || c);
		result3=a || b && c;
		result4=! (a || b) && c;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}

	public static void main(String[] args) {
		
		new Ejercicio2().exercise2();
	}

}
