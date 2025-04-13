package formatingTexts;

public class examplePrintf_2 {

	public static void main(String[] args) {

		double price1 = 5702.1245;
		double price2 = 1000.99;
		double price3 = 450.14;
		double price4 = -500.99;
		
		/*
		 * Presicion en la cantidad de flotantes[%.#]
		 * Salida con un + [%+.]
		 * separa por miles [%,]
		 * Pone en () numeros negativos [%(]
		 * Pone un espacio a numeros positivos [% ]
		 * */
		
		//presicion
		System.out.printf("Price %.2f  \n",price1);
		System.out.printf("Price %.3f  \n",price2);
		System.out.printf("Price %.5f  \n",price3);	
		System.out.printf("Price %.3f  \n",price4);

		
		System.out.println("**************************");
		
		//output a plus
		System.out.printf("Price %+.3f  \n",price1);
		System.out.printf("Price %+.2f  \n",price2);
		System.out.printf("Price %+.5f  \n",price3);	
		System.out.printf("Price %+.15f  \n",price4);
		
		
		System.out.println("**************************");

		//Separa por miles
		System.out.printf("Price %,.3f \n", price1);
		System.out.printf("Price %,.3f \n", price2);
		System.out.printf("Price %,.3f \n", price3);
		System.out.printf("Price %,.3f \n", price4);
		
		
		System.out.println("**************************");

		
		//Poner negativos entre parentesis
		System.out.printf("Price %(f \n", price3);
		System.out.printf("Price %(f \n", price4);
		
		
		
		System.out.println("**************************");
		
		//Espacio
		System.out.printf("Price % f \n", price3);
		System.out.printf("Price % f \n", price4);
		
		
	}

}
