package ejercicios1_4Cadenas;

public class EjercicioIntroduccion2 {
	
	public void exercise2() {
		
		String text1= "Coding";
		String text2= new String("Coding");
		System.out.println(text1==text2);//no tienen la misma direccion de memoria
		System.out.println(text1.equals(text2));//tienen el mismo contenido
		
	}

	public static void main(String[] args) {
		
		new EjercicioIntroduccion2().exercise2();
		
	}

}
