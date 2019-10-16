import java.util.Scanner;

/*
 * @author : Adam Graff
 */

public class Lab3 {

	public static void main(String[] args) {

		int userNum;
		String userInput;

		do {
			
			System.out.print("Enter a number between 1 and 100: ");
			Scanner scan = new Scanner(System.in);
			userNum = scan.nextInt();
			System.out.println();
			System.out.print("Output: ");

			if (userNum % 2 == 0 && userNum < 26) {
				System.out.println(userNum + " Even and less than 25.");
			} else if (userNum % 2 == 0 && userNum >= 26 && userNum <= 60) {
				System.out.println(userNum + " Even.");
			} else if (userNum % 2 == 0 && userNum > 60) {
				System.out.println(userNum + " Even.");
			} else if (userNum % 2 != 0 && userNum < 60) {
				System.out.println(userNum + " Odd.");
			} else if (userNum % 2 != 0 && userNum > 60) {
				System.out.println(userNum + " Odd and over 60.");
			}
			System.out.println();
			System.out.print("Continue? (y/n) ");
			userInput = scan.next();
			System.out.println();
			scan.close();

		} while (!userInput.equalsIgnoreCase("N"));
		System.out.println("Goodbye!");
		
	}

}
