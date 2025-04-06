package exercises;

import java.util.Random;

public class exercise_4 {

	public static void main(String[] args) {

		Random random = new Random();

		boolean stayHard;

		stayHard = random.nextBoolean();

		if (stayHard) {
			System.out.print("Stay fucking HARD!");
		} else {
			System.out.print("you're so mediocre...");
		}
	}

}
