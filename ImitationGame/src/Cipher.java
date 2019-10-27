public class Cipher {
	private String input = "";
	private char begina = 'a'; //the stored field variable lower case a as begina
	private char endz = 'z'; // the stored field variable lower case z as endz
	private char beginA = 'A'; //capital A
	private char endZ = 'Z'; // capital Z in ASCII
	private char begSpecChar = 32;  // ASCII for space bar, and the beginning of special characters
	private char endSpecChar = 64; //ASCII for ?, end of special characters
	private String cipherText = "";
	
	
	
	public Cipher(String word) { //constructor 
		this.input = word;
	}
	
	public String cipher() {   //cipher method 	
		for (int i =0; i< input.length(); i++) {
			if (input.charAt(i)  >= begina && input.charAt(i) <= endz) {  //the bound for lower case letters
				char character = input.charAt(i); //the character at position i of the input is put into a variable character
				
				if(character != begina && character != endz){
					if(character=='d'){
						character='y';
					}
					else if(character=='c'){
						character='x';
					}
					else if(character=='b'){
						character='w';
					}
					else {	
						character-=3;  // shift everything besides b,c,d by 3 in ASCII code
					}
				}
				//beginning of reverse the entire alphabet (and the letters themselves)
				
				int diff = character - (begina);  // takes difference from the letter in ASCII code to the beginning 
				//of lower case letter start, which is a. 
				char newChar = (char)((endz)-diff); //subtracts end lower case ASCII letter (z) by the difference to find the
				// reversed respective letter, then changes to a character stored in newChar
				String newStringChar = Character.toString(newChar);  //newChar is converted to a string
				cipherText += newStringChar; //newStringChar (basically newChar) is added into cipherText
				//END OF LOWER CASE
				//START OF CAPITAL
			}
			if (input.charAt(i) >= beginA && input.charAt(i) <= endZ) { //the bound for capital letters
				char characterCap = input.charAt(i);
				
				
				if (characterCap != beginA && characterCap != endZ )  { // != A and != Z
					if(characterCap=='D'){ // ==68
						characterCap='Y'; //==89
					}
					else if(characterCap =='C') { //67
						characterCap ='X'; //==88
						
					}
					else if (characterCap == 'B') { //66
						characterCap='W';//87	
					}
					else {
						characterCap-=3; //shift everything besides B,C,D by 3 in ASCII code
					}
				}
				int diffCap = characterCap - beginA; //same as above
				char newCharCap = (char)(endZ-diffCap); //same as above
				String newStringCharCap = Character.toString(newCharCap); 
				cipherText+=newStringCharCap;
			} 
			//End of CAPITAL Characters
			
			//Start of special characters
			
			if(input.charAt(i)>= begSpecChar && input.charAt(i) <= endSpecChar ) {
				char specChar = input.charAt(i);
				if(specChar != begSpecChar && specChar != endSpecChar)
				{
					if(specChar == '!') {
						specChar = '?'; //63;    manually changes ! to ?
					}
					else {
						specChar -=1; //shift everything besides ! by 1
					}
				}
				int specDiff= specChar - begSpecChar; //same as above
				char newSpecChar = (char)(endSpecChar-specDiff); //same as above
				String newStringSpecChar = Character.toString(newSpecChar); 
				cipherText+=newStringSpecChar;
			}
			
		}
		String substringCipher = cipherText.substring(cipherText.length()/2,cipherText.length()) +  
				cipherText.substring(0,cipherText.length()/2);  //takes the first half of cipherText and 2nd half
		//and flips them
		return substringCipher;
		//return cipherText;
	}
}
