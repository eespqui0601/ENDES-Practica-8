package ejercicios1_3ProgramacionOrientadaAObjetos;

public class EjercicioStringClass {
	
	public void exercise1() {
		
		String text = "Hello";
        System.out.println("charAt(1) = " + text.charAt(1)); // 'e'
       
        String text1 = "Hello";
        System.out.println("length = " + text1.length()); // 5
        
        String a = "Hello ";
        String b = "World";
        System.out.println(a.concat(b)); // Hello World
       
        String text2 = "programming";
        System.out.println(text2.endsWith("ing")); // true
        System.out.println(text2.endsWith("pro")); // false
        
        String text3 = "banana";
        System.out.println(text3.indexOf('a')); // 1
        
        String text4 = "banana";
        System.out.println(text4.indexOf('a', 2)); // 3
        
        String text5 = "Hello World";
        System.out.println(text5.indexOf("World")); // 6
       
        String text6 = "banana";
        System.out.println(text6.indexOf("na", 3)); // 4
        
        String empty = "";
        String notEmpty = "Hello";
        System.out.println(empty.isEmpty());    // true
        System.out.println(notEmpty.isEmpty()); // false
        
        String text7 = "banana";
        System.out.println(text7.lastIndexOf('a')); // 5
       
        String text8 = "banana";
        System.out.println(text8.lastIndexOf('a', 4)); // 3
        
        String text9 = "hello world world";
        System.out.println(text9.lastIndexOf("world")); // 12
       
        String text10 = "banana";
        System.out.println(text10.lastIndexOf("na", 4)); // 2
        
        String text11 = "banana";
        System.out.println(text11.replace('a', 'o')); // bonono
       
        String text12 = "hello";
        System.out.println(text12.toUpperCase()); // HELLO
        
        String text13 = "   hello world   ";
        System.out.println("Before: [" + text13 + "]");
        System.out.println("After: [" + text13.trim() + "]");
        
        double number = 123.45;
        String str = String.valueOf(number);
        System.out.println("String value = " + str);	
		
	}

	public static void main(String[] args) {
		
		new EjercicioStringClass().exercise1();

	}

}
