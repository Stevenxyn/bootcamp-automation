package exercises;

import java.util.Scanner;

public class Ex06_InteresCompuesto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double principal;
		double rate;
		int timesCompounded;
		int years;
		double amount;
		
		System.out.print("Ingresa tu monto inicial: ");
		principal = scanner.nextDouble();
		
		System.out.print("Ingresa la tasa de interes (en %): ");
		rate = scanner.nextDouble() / 100;
		
		System.out.print("Ingresa la cantidad de tiempo transcurrido: ");
		timesCompounded = scanner.nextInt();
		
		System.out.print("Ingresa la cantidad de años: ");
		years = scanner.nextInt();
		
		amount = principal * Math.pow(1 + + rate / timesCompounded, timesCompounded * years);
		
		System.out.printf("El monto despues de %d años es de $%.3f", years,amount);
		
		
		
		
		
		
		
		scanner.close();
	}

}
