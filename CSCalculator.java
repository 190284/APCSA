import java.util.Scanner;
public class CSCalculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean Continue = true;
		while (Continue = true) {
			System.out.println("Please type in the first number to use in the calculator.");
			Scanner InputNumOne = new Scanner(System.in);
			Double NumOne = InputNumOne.nextDouble();
			System.out.println("Please type in the second number to use in the calculator.");
			Scanner InputNumTwo = new Scanner(System.in);
			Double NumTwo = InputNumTwo.nextDouble();
			System.out.println("Please type in the sign to use in the calculator. (+, -, *, /");
			Scanner InputSign = new Scanner(System.in);
			String Sign= InputSign.nextLine();
			
			if (Sign.equals("+")) {
				System.out.println(NumOne+NumTwo);
			}
			if (Sign.equals("-")) {
				System.out.println(NumOne-NumTwo);
			}
			if (Sign.equals("*")) {
				System.out.println(NumOne*NumTwo);
			}
			if (Sign.equals("/")) {
				System.out.println(NumOne/NumTwo);
			}
			System.out.println("Do you want to continue using this calculator?");
			Scanner InputContinue = new Scanner(System.in);
			String BooleanContinuer = InputSign.nextLine();
			if (BooleanContinuer.equals("no")) {
				break;
			}
			if (BooleanContinuer.equals("yes")) {
				Continue = true;
			}
		}
	}
}
