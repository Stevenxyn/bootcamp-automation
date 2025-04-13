package exercises;

import java.util.Scanner;
public class Ex03_AutoservicioCajero {

	public static void main (String args[]) {
		
		Scanner scanner = new Scanner (System.in);
		
		String product;
		double price;;
		int quantity;
		double totalPrice;
		
		System.out.print("¿Que te gustaria comprar?: ");
		product = scanner.nextLine();
		
		System.out.print("¿Cual es el precio de la unidad?: ");
		price = scanner.nextDouble();
		
		System.out.print("¿Cuantas quiere comprar?: ");
		quantity = scanner.nextInt();
		
		totalPrice = price * quantity;
		
		System.out.println("\n Compraste: " + product + 
						   "\n Costo unidad: $" + price +
						   "\n Total a pagar: $" + totalPrice +
						   "\n Total productos comprados:  " + quantity );
		
		scanner.close();
		

	}
	
	
}
