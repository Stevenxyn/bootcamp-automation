package formatingTexts;

public class examplePrintf {

	public static void main(String[] args) {

		String name = "Spongebob";
		char firstLetter = 'S';
		int age = 30;
		int money = 100;
		double height = 1.75;
		boolean isEmployed = true;

		// \n con esto hacemos espaciado

		// con strings
		System.out.printf("Hello %s\n", name);

		// con char's
		System.out.printf("Your name starts with a: %c\n", firstLetter);

		// con integer dos variables el orden de llamada entre "" se debe tener en
		// cuenta en las varianes
		System.out.printf("Your are %d years old and you have %d money\n", money, age);
		System.out.printf("Your are %d years old and you have %d money\n", age, money);
		
		//con double
		System.out.printf("Tu tienes %f de altura\n", height);
		
		//con booleanos
		System.out.printf("Employed: %b", isEmployed);
		

	}

}
