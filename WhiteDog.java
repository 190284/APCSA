
public class WhiteDog {
	boolean hungry = true;
	int size = 50;
	String colour = "white";
	String breed = "Dog";
	
	public void GetBigger() 
	{
		size = size + 25;
		hungry = false;
		System.out.println("Wow my nutrition is much better... it's 25 cm BIGGER WOW");
	}
	
	public String setColour() {
		return colour;
	}
	
	public String BreedName() {
		return breed;
	}
}
