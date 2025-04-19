package exercises;

import java.util.Scanner;

public class Ex07_WeightConversion {

	public static void main(String[] args) {
		// WEIGHT CONVERSION PROGRAM

		Scanner scanner = new Scanner(System.in);

		// Declare variables
		double weight;
		double newWeight;
		int choice;

		// Welcome message
		System.out.println("Weight Conversion Program!");
		System.out.println("1: Convert lbs to kgs");
		System.out.println("2: Convert kgs to lbs");

		System.out.print("Choose an option: ");
		choice = scanner.nextInt();

		if (choice == 1) {
			// option 1 convert lbs to kgs
			System.out.print("Enter the weight in lbs: ");
			weight = scanner.nextDouble();
			newWeight = weight * 0.453592;
			System.out.printf("New Weight in KGS is: %.2f", newWeight);
		} 
		else if (choice == 2) {
			// option 2 convert kgs to lbs
			System.out.print("Enter the lbs in kgs: ");
			weight = scanner.nextDouble();
			newWeight = weight * 2.2046;
			System.out.printf("New Weight in lbs is: %.2f", newWeight);
		} 
		else {
			// else print not a valid choice
			System.out.print("Not a valid choice");
		}

		scanner.close();
	}
}
