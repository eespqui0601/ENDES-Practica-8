package ejercicios1_3ProgramacionOrientadaAObjetos;

import java.util.Random;

public class EjercicioNumerosAleatorios {

	public void exercise1() {
		
		Random random = new Random();
		
		/*Sacar aleatoriamente lo siguiente:*/ 

		//La cara de una moneda.
		String uno = random.nextBoolean()?"cara":"cruz";
		System.out.println("Ha salido: " + uno);
		
		//El lanzamiento de un dado.
		int dos = random.nextInt(6)+1;
		System.out.println("El valor del dado es de: " + dos);
		
		//Un número entre 34 y 68 ambos incluidos.
		int tres = random.nextInt(68-34+1)+34;
		System.out.println("El numero aleatorio entre 34 y 68 ambos incluidos es: " + tres);
		
		//Un número decimal.
		float cuatro = random.nextFloat();
		System.out.println("Un numero decimal aleatorio es: " + cuatro);
		
		//Un día de la semana y mostrar si es fin de semana o no.
		int cinco = random.nextInt(7);
		String dias = "LMXJVSD".charAt(cinco) == 'L'? "Lunes":"LMXJVSD".charAt(cinco) == 'M'? "Martes":"LMXJVSD".charAt(cinco) == 'X'? "Miercoles":"LMXJVSD".charAt(cinco) == 'J'? "Jueves":"LMXJVSD".charAt(cinco) == 'V'? "Viernes":"LMXJVSD".charAt(cinco) == 'S'? "Sabado": "Domingo";
		String finde = cinco <= 4? "no":"si";
		System.out.println("El día de la semana es: " + dias + " y " + finde + " es finde semana.");
		
		//Un mes del año y mostrar si es verano o no (entenderemos como verano los meses de julio y agosto).
		int seis = random.nextInt(12)+1;
		String mes = seis == 1?"Enero": seis == 2?"Febrero":seis == 3?"Marzo":seis == 4?"Abril":seis == 5?"Mayo":seis == 6?"Junio":seis == 7?"Julio":seis == 8?"Agosto":seis == 9?"Septiembre":seis == 10?"Octubre":seis == 11?"Noviembre":"Diciembre";
		String verano = seis <=6? "no" : seis < 9? "si":"no"; 
		System.out.println("El mes del año es: " + mes + " y " + verano + " es verano.");
		
		//Un día de la semana y mostrar qué día de la semana es.
		int siete = random.nextInt(7);
		String diassiete = "LMXJVSD".charAt(siete) == 'L'? "Lunes":"LMXJVSD".charAt(siete) == 'M'? "Martes":"LMXJVSD".charAt(siete) == 'X'? "Miercoles":"LMXJVSD".charAt(siete) == 'J'? "Jueves":"LMXJVSD".charAt(siete) == 'V'? "Viernes":"LMXJVSD".charAt(siete) == 'S'? "Sabado": "Domingo";
		System.out.println("El día de la semana es: " + diassiete + ".");
		
		//Un mes del año y mostrar qué mes del año es.
		int ocho = random.nextInt(12)+1;
		String mesocho = ocho == 1?"Enero": ocho == 2?"Febrero":ocho == 3?"Marzo":ocho == 4?"Abril":ocho == 5?"Mayo":ocho == 6?"Junio":ocho == 7?"Julio":ocho == 8?"Agosto":ocho == 9?"Septiembre":ocho == 10?"Octubre":ocho == 11?"Noviembre":"Diciembre";
		System.out.println("El mes del año es: " + mesocho + ".");
		
	}
	public static void main(String[] args) {

		new EjercicioNumerosAleatorios().exercise1();
	}

}
