package ejercicios1_3ProgramacionOrientadaAObjetos;

public class EjercicioWrappers1 {
	
	public void exercise1() {
			
			Character character = 'a';
		
			// Returns the value of this Character object.
			char c = character.charValue();
			System.out.println("charValue(): " + c); // -> 'a'
		
			// Determines if the specified character is a digit.
			System.out.println("isDigit('a'): " + Character.isDigit(character)); // -> false
			System.out.println("isDigit('5'): " + Character.isDigit('5')); // -> true
		
			// Determines if the specified character is an uppercase character.
			System.out.println("isUpperCase('a'): " + Character.isUpperCase('a')); // -> false
			System.out.println("isUpperCase('A'): " + Character.isUpperCase('A')); // -> true
		
			// Converts the character argument to lowercase using case mapping information
			// from the UnicodeData file.
			System.out.println("toLowerCase('A'): " + Character.toLowerCase('A')); // -> 'a'
		
			// Converts the character argument to uppercase using case mapping information
			// from the UnicodeData file.
			System.out.println("toUpperCase('a'): " + Character.toUpperCase('a')); // -> 'A'
		
			// Returns a Character instance representing the specified char value.
			char c2 = 'z';
			Character character2 = Character.valueOf(c2);
			System.out.println("valueOf('z'): " + character2); // -> 'z'
		}

	
	
	public static void main(String[] args) {
		
		new EjercicioWrappers1().exercise1();

	}

}
