import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {

		Scanner entry = new Scanner(System.in);
		System.out.println("Let's see if your are approved, type your first grade");
		Integer grade1 = entry.nextInt();
		System.out.println("Now your second grade:");
		Integer grade2 = entry.nextInt();
		System.out.println("And to finish your third grade");
		Integer grade3 = entry.nextInt();

		Integer finalGrade = (grade1 + grade2 + grade3) / 3;

		if (finalGrade >= 8) {
			System.out.println("You are approved!");
		} else if ((finalGrade > 4) && (finalGrade < 8)) {
			System.out.println("You have to do the recuperation test but what is your first test grade?");
			Integer firstGradeCheck = entry.nextInt();
			if (firstGradeCheck >= 5) {
				System.out.println("So you are approved!");
			} else {
				System.out.println("Sorry you still have to do the recuperation test...");
			}

		} else {
			System.out.println("You failed :(");
		}

	}

}
