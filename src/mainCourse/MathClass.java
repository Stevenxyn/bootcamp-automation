package mainCourse;

public class MathClass {
	public static void main(String[] args) {

		// Valores constantes
		System.out.println(Math.E);
		System.out.println(Math.PI);

		System.out.println("********************************");

		double resultPow;
		double resultAbs;
		double resultSqrt;
		double resultRound;
		double resultCeil;
		double resultFloor;
		double resultMax;
		double resultMin;

		// (Base,exponente)
		// resultPow = Math.pow(12, 3); || 12 * 12 * 12 = 1728
		// resultPow = Math.pow(15, 3); || 15 * 15 * 15 = 3375
		resultPow = Math.pow(15, 3);
		System.out.println(resultPow);

		// Lo que hace ABS es devolver el valor absoluto negativo a positivo
		// y el 0 devuelve 0
		resultAbs = Math.abs(923 - 758.54);
		System.out.println(resultAbs);

		// Devuelve la raiz cuadrada del numero que le enviemos
		// recibe positivos y cero, no negativos
		resultSqrt = Math.sqrt(45);
		System.out.println(resultSqrt);

		// Redondea hacia arriba si el decimal es mayor a .5
		// Mantiene el numero si es menor o igual a .4
		resultRound = Math.round(16548.4);
		System.out.println(resultRound);

		// Lo que hace es que asi se tenga un .1 reondea hacia arriba
		// sin importar el 0.1, 0.9 ya suma al siguiente numero
		resultCeil = Math.ceil(5.001);
		System.out.println(resultCeil);

		// A diferencia de Ceil que redondea asi sea 0.1 hacia arriba, floor redondea
		// hacia abajo
		// Entiendo realmente no tiene en cuenta el decimal y lo redondea siempre a
		// abajo
		resultFloor = Math.floor(78.9);
		System.out.println(resultFloor);

		//Devuelve el valor mayor de dos numeros
		resultMax = Math.max(9.54, 99.12);
		
		//Para contar valores de un string si toca usar length()
		String texto1 = "Hola es to es un texto de prueba";
		String texto2 = "Hola es to es un texto";
		int resultStrings = texto1.length();

		System.out.println(resultMax);
		System.out.println(resultStrings);
		
		
		//Esto devuelve el menor de dos numeros
		resultMin = Math.min(45.5, 45.9);
		System.out.println(resultMin);
		
		
		

	}
}
