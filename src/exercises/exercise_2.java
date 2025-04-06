package exercises;
import java.util.Scanner;

public class exercise_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		String adjective1;
		String noun1;
		String adjective2;
		String verb1;
		String adjective3;
		 	
		
		System.out.print("Ingresa un adjetivo (cualidades): ");
		adjective1 = scanner.nextLine();
		System.out.print("Ingresa un sustantivo (persona o animal): ");
		noun1 = scanner.nextLine();
		System.out.print("Ingresa un adjetivo (caracteristicas fisicas): ");
		adjective2 = scanner.nextLine();
		System.out.print("Ingresa un verbo (de estar haciendo): ");
		verb1 = scanner.nextLine();
		System.out.print("Ingresa un adjetivo (estado de animo): ");
		adjective3 = scanner.nextLine();
		 
		
		
		System.out.println("Hoy vi algo " + adjective1 + " en el zoologico." );
		System.out.println("En la excibicion estaba " + noun1);
		System.out.println("El cual esta muy pero muyy " + adjective2);
		System.out.println("mientras " + verb1);
		System.out.println("Yo estaba " + adjective3 + "!");

		
		
		
		
		
		scanner.close();
	}

}

