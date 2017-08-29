import java.util.Scanner;
import java.text.DecimalFormat;
public class CSCalculator {
	public static void main(String[] args) {
		
		double savedVariable = 0.0;
		
		// TODO Auto-generated method stub
		Boolean Continue = true;
		while (Continue = true) {
			System.out.println("This is your last variable: " + savedVariable);
			System.out.println("Do you want to continue using this calculator with the same number? If yes, type yes.");
			Scanner InputContinuer = new Scanner(System.in);
			String LoopContinuer = InputContinuer.nextLine();
			if (LoopContinuer.equals("yes")) {
				System.out.println("What number do you want to use for your new integer, " + savedVariable + "?");
				Scanner NewNumInput = new Scanner(System.in);
				double NewNum= NewNumInput.nextDouble();
				System.out.println("What sign do you want to use?");
				Scanner NewSignInput = new Scanner(System.in);
				String NewSign=NewSignInput.nextLine();
				if (NewSign.equals("+")) {
					savedVariable += NewNum;
					System.out.println("Your new variable is this: " + savedVariable);
				}
				if (NewSign.equals("-")) {
					savedVariable -= NewNum;
					System.out.println("Your new variable is this: " + savedVariable);
				}
				
				if (NewSign.equals("*")) {
					savedVariable *= NewNum;
					System.out.println("Your new variable is this: " + savedVariable);
				}
				
				if (NewSign.equals("/")) {
						savedVariable /= NewNum;
						System.out.println("Your new variable is this: " + savedVariable);
				}
			}
			
			else {
				System.out.println("Please type in the first number to use in the calculator.");
				Scanner InputNumOne = new Scanner(System.in);
				Double NumOne = InputNumOne.nextDouble();
				System.out.println("Please type in the second number to use in the calculator.");
				Scanner InputNumTwo = new Scanner(System.in);
				Double NumTwo = InputNumTwo.nextDouble();
				System.out.println("Please type in the sign to use in the calculator. (+, -, *, /)");
				Scanner InputSign = new Scanner(System.in);
				String Sign= InputSign.nextLine();

			
				if (Sign.equals("+")) {
					double Number = NumOne+NumTwo;
					 DecimalFormat f = new DecimalFormat("##.000000");
				     System.out.println(f.format(Number));
				     savedVariable = Number;
				}
				if (Sign.equals("-")) {
					double Number = NumOne-NumTwo;
					 DecimalFormat f = new DecimalFormat("##.000000");
				     System.out.println(f.format(Number));
				     savedVariable = Number;
					//System.out.println(NumOne-NumTwo);
				}
				if (Sign.equals("*")) {
					double Number = NumOne*NumTwo;
					 DecimalFormat f = new DecimalFormat("##.000000");
				     System.out.println(f.format(Number));
				     savedVariable = Number;
				}
				if (Sign.equals("/")) {
					double Number = NumOne/NumTwo;
					DecimalFormat f = new DecimalFormat("##.000000");
				    System.out.println(f.format(Number));
				    savedVariable = Number;
				}
				System.out.println("Do you want to continue using this calculator? If yes, type continue.");
				Scanner InputContinue = new Scanner(System.in);
				String BooleanContinuer = InputContinue.nextLine();
				if (BooleanContinuer.equals("no")) {
					break;
				}
				if (BooleanContinuer.equals("continue")) {
					Continue = true;
				}	
			}  
		}	
	}
}
