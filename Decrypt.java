
public class Decrypt {
	private String DecInput = "";
	private int begina = 97; //begin A in smaller character
	private int endz = 122; 
	private char beginA = 'A'; //capital A
	private char endZ = 'Z'; // capital Z in ASCII
	private char begSpecChar = 32;  // ASCII for space bar 
	private char endSpecChar = 64; //ASCII for ?
	private String decipherText= "";
	
	public Decrypt(String Decword) {
		this.DecInput=Decword;
	}
	
	public String Decrypt(String DecryptedWord) {
		for(int i = 0; i < DecInput.length(); i++) {
			if (DecInput.charAt(i) >= begina && DecInput.charAt(i) <=endz) {
				char newChar = DecInput.charAt(i); //the character to be decrypted
				int diff = endz-newChar;
				char flipChar = (char)(begina + diff); //character before encrypting
				if(flipChar != begina && flipChar != endz) {
					if(flipChar=='y'){
						flipChar='d';
					}
					else if (flipChar =='x') {
						flipChar='c';
					}
					else if(flipChar == 'w') {
						flipChar='b';
					}
					else{
						flipChar+=3;
					}
				}
				decipherText +=flipChar;
			}
			//END lower letter CHARACTER
		//_____________________________________________________________
		
			//START CAPITAL letters
			if (DecInput.charAt(i) >= beginA && DecInput.charAt(i) <=endZ) {
				char newCharCap = DecInput.charAt(i); //the character to be decrypted
				int diffCap = endZ-newCharCap;
				char flipCharCap = (char)(beginA + diffCap);
				if(flipCharCap != beginA && flipCharCap != endZ) {
					if(flipCharCap == 'Y') {
						flipCharCap = 'C';
						}
					else if(flipCharCap == 'X'){
						flipCharCap = 'B';
					}
					else if (flipCharCap == 'W'){
						flipCharCap ='B';
					}
					else {
						flipCharCap +=3;
					}
				}
				decipherText+=flipCharCap;
			}
			if (DecInput.charAt(i) >= begSpecChar && DecInput.charAt(i) <=endSpecChar) {
				char newCharSpec = DecInput.charAt(i); //the character to be decrypted
				int diffSpec = endSpecChar - newCharSpec;
				char flipCharSpec = (char)(begSpecChar + diffSpec);
				if(flipCharSpec != begSpecChar && flipCharSpec != endSpecChar) {
					if(flipCharSpec == '?') {
						flipCharSpec = '!';
					}
					else{
						flipCharSpec +=1;
					}
				}
				decipherText +=flipCharSpec;
			}
		}
		String substringDecipher = decipherText.substring(decipherText.length()/2, decipherText.length()) +
				decipherText.substring(0,decipherText.length()/2);
		return substringDecipher;
	}
	
	
}
