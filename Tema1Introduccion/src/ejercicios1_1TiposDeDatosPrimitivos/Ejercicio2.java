package ejercicios1_1TiposDeDatosPrimitivos;

public class Ejercicio2 {
	
	public void exercise2() {
	
		short s=30000;
		byte b= (byte) s;
		System.out.println(b); //El resultado es 48, porque hemos realizado un casting
	}

	public static void main(String[] args) {

		new Ejercicio2() .exercise2();
	}

}
