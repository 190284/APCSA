import java.util.Scanner;
public class LogicGateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean Gate1,Gate2;
		int gateOperator;
		boolean result = false;
		String StringGateOperator = "";
		//LogicGateMain s = new LogicGateMain(); //nOT SURE WHAT IT DOES
		System.out.println("Boolean functions may be practically implemented by using electronic gates. The following points are important to understand.");
		System.out.println("ogic is about how we combine the values true and false to produce another value, \n that is also true or false. You can also use one and zero in place of true or false. There are three basic logical operations - "
				+ "AND, OR and NOT -\n from which all others can be derived.");
		System.out.println("This symbol is the AND logic symbol: \n &&");
		System.out.println("This symbol is the OR logic symbol: \n ||");
		Scanner input = new Scanner(System.in);
		do { 
			System.out.println("Which gate operator do you want to use? \n input the number \n 1) AND 2) OR 3) NOT AND 4) NOR 5) EXOR 6) EXNOR");
			gateOperator = input.nextInt();
		} while (gateOperator > 6 || gateOperator < 1 );
		System.out.println("Enter the first gate boolean value");
		Gate1 = input.nextBoolean();
		System.out.println("Enter the second gate boolean value");
		Gate2 = input.nextBoolean();
		//System.out.println(Gate1);
		//System.out.println(Gate2);
		switch(gateOperator) {
		case 1 : 
			//AND
			StringGateOperator = "AND";
			result = Gate1 && Gate2;
			break;
		case 2 : 
			//Or
			StringGateOperator = "OR";

			result = Gate1 || Gate2;
			break;
		case 3 : 
			//NotAnd
			StringGateOperator = "NAND";
			result = !(Gate1 && Gate2);
			break;
		case 4 : 
			//NOR
			StringGateOperator = "NOR";
			result = !(Gate1 || Gate2);
			break;
		case 5 : 
			//EXOR, either true, but not both
			StringGateOperator = "EXOR";
			result = !(Gate1 && Gate2) && (Gate1 || Gate2) ;
			break;
		case 6 : 
			//EXNOR
			StringGateOperator = "EXNOR";
			result = !(!(Gate1 && Gate2) && (Gate1 || Gate2));
			break;
		}
		String StringGate1 = String.valueOf(Gate1);
		String StringGate2 = String.valueOf(Gate2);
		String StringResult = String.valueOf(result);
		System.out.println(StringGate1 + " " + StringGateOperator + " " + StringGate2 + " = " + result); 
		
	}
}
		
		
