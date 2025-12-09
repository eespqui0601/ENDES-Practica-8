package ejercicios1_1Expresiones;

public class Ejercicio4 {
	
	public void exercise4() {
		
		//De las siguientes asignaciones ¿Cuáles son válidas? ¿Cuál es el efecto de su ejecución? ¿De qué tipo deben ser las variables?:
		
		//1.	 z = 2 < 1  	
				boolean z=2<1;
				System.out.println("Apartado 1: Es válida. A Z se le asigna false. Z debe ser de tipo booleana ");
				
				//2.	 a = a + 1  	
				int a = 1; 
				a = a + 1;	
				System.out.println("Apartado 2: Es válida. Que a se incrementa en uno. a debe ser tipo numérica o tipo char ");
				
				//3.	 ‘x’ = ‘y’  	
				System.out.println("Apartado 3: No es válida. No ejecuta");	
				
				//4.	 x = ‘y’  	
				char x = 'y';
				System.out.println("Apartado 4: Es válida. x se le asigna el carácter y. x es tipo char ");	
				
				
				//5.	 a = b  
				System.out.println("Apartado 5: Es válida. a obtiene el valor de b. Deben de ser las dos variables iguales o compatibles");	
				
				//6.	 precio = precio – precio*(30/100)  
				double precio = 10;
				precio = precio - precio*(30/100);  
				System.out.println("Apartado 6: Es válida. El resultado de ejecución es el mismo valor, no cambia el valor. Si queremos que funcione debemos convertir el 30 o el 100 en double " + precio);	
				
				//7.	 a = a<b?5+1:7-3*2
				System.out.println("Apartado 7: Es válida. a obtiene el valor correspondiente. a y b deben de ser mismo tipo");	
				
				
				//8.	 a = b / 0 
				System.out.println("Apartado 8: Dependiendo del tipo de los valores es válida o no. Si se divide con un número \n"
						+ "entero (int,long,short,byte) da error, mientras si es con uno decimal (float,double) da infinito");	

				
				//9.	 i=++j
				int j1 = 1;
				int i = ++j1;
				System.out.println("Apartado 9: Es válida. La ejecución incrementa el valor de j1 y luego se lo asigna a i: " + i + ". Debe ser tipo númerico o char");	
				
				
				//10.	 i=j++
				int j2 = 1;
				int i2 = j2++;
				System.out.println("Apartado 10: Es válida. La ejecución asigna el valor a i: " + i2 + " y luego lo incrementa. Debe ser tipo númerico o char");	
				
				//11.	 c='''	
				char c1 = '\'';
				System.out.println("Apartado 11: No es válida. Da un error, para que se vea la comilla debe llevar una barra antes, es decir, se debe de escapar. Tipo char. " + c1);	
				
				//12.	 c='”'		
				char c2 = '"';
				System.out.println("Apartado 12: Es válida. A la variable c2 se le asigna el literal comillas dobles. Tipo char " + c2);	
				
				//13.	 c='c'		
				char c3 = 'c';
				System.out.println("Apartado 13: Es válida. A la variable c3 se le asigna el literal c. Tipo char ");	
				
				//14.	 s=”'”
				String s1 = "\'";
				System.out.println("Apartado 14: Es válida. A la variable s1 se le asigna el literal ' . Tipo string. "+ s1);	
				
				//15.	 s=”””	
				String s2 = "\"";
				System.out.println("Apartado 15: No es válida. Da un error, para que se vea la comilla debe llevar una barra antes, es decir, se debe de escapar. Tipo string " + s2);	
				
				
				//16.	 c='\u0041'
				char c4 = '\u0041';
				System.out.println("Apartado 16: Es válida. Su ejecución devuelve el valor: " + c4 + ". Tipo char");	
				
				
				//17.	 c=65
				char c5 = 65;
				System.out.println("Apartado 17: Es válida. Su ejecución devuelve el valor: " + c5 + ". Tipo char");	
				
				
				//18.	 x = (a>b?5.4*3:65.1/8)
				System.out.println("Apartado 18: Es válida. Su ejecución es la asignación del valor de x. x debe ser tipo double por los decimales");
				
				//19.	 a == a>b?3+6:9-4
				System.out.println("Apartado 19: No es válida porque a>b da una variable booleana, luego se compara con a: int == boolean como son de distintos tipos no se pueden comparar y da error \n"
						+ " a == (a>b) --> int == booleana --> error");
				
				//20.	 d = !a?c++:--c
				System.out.println("Apartado 20: Es válida. Su ejecución asigna el valor de d. a debe ser tipo booleana. c y d deben ser tipo númerico o char");
		
		
		
		
	}

	public static void main(String[] args) {
		
		new Ejercicio4().exercise4();

	}

}
