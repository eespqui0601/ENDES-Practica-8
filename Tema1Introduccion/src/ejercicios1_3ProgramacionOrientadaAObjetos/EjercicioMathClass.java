package ejercicios1_3ProgramacionOrientadaAObjetos;

public class EjercicioMathClass {
	
	public void exercise1() {
		
				float x=-5.7f;
		System.out.println("Math.abs("+ x +") = " + Math.abs(x));
		
				double a=2;
		System.out.println("Math.exp("+ a +") = " + Math.exp(a));
		
				double base = 3, exponent = 4;
		System.out.println("Math.pow("+ base +", " + exponent +") = " + Math.pow(base, exponent));		
		
				double c=7.5, b=3.2;
		System.out.println("Math.max("+ c +", "+ b +") = " + Math.max(c, b));
		
				int e=15, d=20;
		System.out.println("Math.min("+ e +", "+ d +") = " + Math.min(e, d));
		
				double positive = 4.3, negative = -4.3;
		System.out.println("Math.ceil("+ positive +") = " + Math.ceil(positive));
		System.out.println("Math.ceil("+ negative +") = " + Math.ceil(negative));
		
				double plus = 4.7, rest = -4.7;
		System.out.println("Math.floor("+ plus +") = " + Math.floor(plus));
		System.out.println("Math.floor("+ rest +") = " + Math.floor(rest));
		
	}

	public static void main(String[] args) {
		
		new EjercicioMathClass().exercise1();
		
	}

}
