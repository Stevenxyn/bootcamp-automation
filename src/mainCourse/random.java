package mainCourse;

import java.util.Random;

public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();

		int number;

		// Any number -2Billions to 2Billinons
		number = random.nextInt();

		System.out.println("Any Number: " + number);

		// Any number BETWEEN 1 - 10
		number = random.nextInt(1, 11);
		System.out.println("Random number 1 to 10: " + number);

		System.out.println("*************************************");

		double doubleNumber;

		doubleNumber = random.nextDouble();
		System.out.println("Random Double: " + doubleNumber);

		// inicia de 0.5.... hasta 0.7.... pero el 0.8 no saldra
		// Ocurre igual para numeros enteros
		doubleNumber = random.nextDouble(0.5, 0.8);
		System.out.println(doubleNumber);

		System.out.println("*************************************");

		boolean isHeads;

		isHeads = random.nextBoolean();

		if (isHeads) {
			System.out.println("Es cara!");
		} else {
			System.out.println("Es sello!");
		}

	}

}
