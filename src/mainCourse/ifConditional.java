package mainCourse;

import java.util.Scanner;

public class ifConditional {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		/**
		 * Could = podrias should = deberias improve = mejorar
		 * 
		 * anciado señor adulto niño bebe
		 * 
		 */
		
		//RECORDAR SIEMPRE ORGANIZAR LOS GRUPOS CON LAS LLAMADA DE DATOS O SE SALTARA VALIDACIONES
		System.out.print("Inser your name: ");
		String name = scanner.nextLine();
		
		System.out.print("Insert your age: ");
		int age = scanner.nextInt();
		
		System.out.print("Are you a student (True/false): ");
		boolean isStudent = scanner.nextBoolean();
		
	

		
		//Group 1
		if (name.isEmpty()) {
			System.out.println("No ingresaste ningun valor! 🤬");
		}else {
			System.out.println("Hello " + name + "😊");
		}
		
		
		//Group 2
		
		if (age >= 80) {
			System.out.println("Es un anciano");
		} else if (age >= 50) {
			System.out.println("Es un señor");
		} else if (age >= 30) {
			System.out.println("Es un adulto");
		} else if (age >= 18) {
			System.out.println("Es mayor de 18 años!");
		} else if (age >= 15) {
			System.out.println("Aun es un adolecente");
		} else if(age >= 10){
			System.out.println("eres un niño!");
		}else {
			System.out.println("Muy bebe");
		}
		
		
	//Group 3
		
		if (isStudent) {
			System.out.println("You are a Student 🧑‍🎓");
		}else {
			System.out.println("You are NOT a Student 🏢🏢");
		}
		
		
		
		
		
		
		
		
		scanner.close();

	}

}
