import java.util.Scanner;


public class GuyInRoom {
	String name = "";
	int buffness = 0;
	
	
	
	
	public void ChangeName() {
		Scanner stuff = new Scanner(System.in);
		System.out.println("What is the guy's name?");
		String newName = stuff.nextLine();
		System.out.println("The guy's name is " + newName + ", correct?");
	}
	public void Getbuffer(int Buffer) {
		buffness = buffness+Buffer;
		System.out.println(buffness);
	}
	
	
}
