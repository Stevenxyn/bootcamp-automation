package exercises;

public class Ex05_FormateoValores {

	public static void main(String[] args) {
		double precioAtun = 7.500;
		double precioArroz = 12.6550;
		
		//Necesito que a los valores que no les sale los 'ceros' los hagas visibles
		
		System.out.println(precioAtun);
		System.out.println(precioArroz);
		
		System.out.println("*********************************");

		
		System.out.printf("Precio Atun ajustado: %.3f \n",precioAtun);
		System.out.printf("Precio Arroz ajustado: %.4f \n",precioArroz);
	}

}
