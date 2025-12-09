package ejercicios1_1Expresiones;

public class Ejercicio3 {
	
	public void exercise3() {
		
		int x=165698;
		System.out.println(x);
		
		short s=56;
		byte b=(byte)s;
		System.out.println(b);
		
		byte b1=(byte)129;
		System.out.println(b1);
		
		float f=5.89F;
		System.out.println(f);
		
		long l=(long) 8.42;
		System.out.println(l);
		
		char c1='a',c2;
		c2=(char)(c1+7);
		System.out.println(c2);
		
		byte b2;
		short s1=7;
		boolean a=true;
		b2=(byte) (a? s1++ : --s);
		System.out.println(b2);
		
	}

	public static void main(String[] args) {
		
		new Ejercicio3().exercise3();

	}

}
