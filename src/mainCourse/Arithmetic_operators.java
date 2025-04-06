package mainCourse;

public class Arithmetic_operators {

	public static void main(String[] args) {

		int x = 10;
		int y = 5;
		int z;
		int p = 0;
		int f = 0;

		
		z = x + y;
		z = x - y;
		z = x * y;
		z = x / y;
		z = x % y; //resto de la division
		System.out.println("Operaciones basicas: " + z);
		
	
		//Assigment operators es igual que hacer  z = x + y
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		System.out.println("Assigment operator: " + x);
		
		
		//+1 o -1 se usa en bucles mas que todo
		p++;
		f--;
		
		System.out.println(p);
		System.out.println(f);
		
		// Orden de las operaciones [ P - E - M - D - A - S]
		/*
		 * P: Parentesis
		 * E: Exponentes
		 * M: Multiplicaciones
		 * D: Divisiones
		 * A: Sumas/adicion
		 * S: Substraction/restas
		 * 
		 * */

		
		double result = 15 + 10 * 5 - (5 * 15) / 6;
		System.out.println("Result is: " + result);
		
	}

}
