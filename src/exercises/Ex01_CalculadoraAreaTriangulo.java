package exercises;

import java.util.Scanner;

public class Ex01_CalculadoraAreaTriangulo {

	public static void main(String[] args) {

		//Crear un programa que calcule  el area de un triangulo
		//Formula Area = Base * Altura
		Scanner scanner = new Scanner(System.in);
		
		double area = 0;
		double base = 0;
		double altura = 0;
		
		
		System.out.print("Ingrese la base: ");
		base = scanner.nextDouble();
		
		System.out.print("Ingrese la altura: ");
		altura = scanner.nextDouble();
		
		area = base * altura;
		
		System.out.println("El area del triangulo es: " + area);
		
		
		
		scanner.close();
	}

}
