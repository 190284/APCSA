import java.util.Scanner;
public class CLassObjectFormative {
	//dog
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stuff = new Scanner(System.in);
		WhiteDog dog1 = new WhiteDog();
		WhiteDog dog2 = new WhiteDog();
		GuyInRoom guy1 = new GuyInRoom();
		System.out.println("Your dog is 50 cm big now. I'm going to feed him. How much bigger will he get in his lifetime?");
		int big = stuff.nextInt();
		dog1.size = dog1.size + big;
		dog1.GetBigger();
		
		System.out.println("The dog is hungry: " + dog1.hungry);
		System.out.println("Its size is " + dog1.size + "cm long");
		
		guy1.ChangeName();
		System.out.println("HOW BUFF IS HE? IM GOING TO TRAIN HIM");
		guy1.Getbuffer(10);
	}

}
