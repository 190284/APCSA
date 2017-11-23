import java.util.Scanner;


public class CipherTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputWord = new Scanner(System.in);
		String wordToEnc = inputWord.nextLine();
		Cipher encryption = new Cipher(wordToEnc);
		String ciphered = encryption.cipher();
		System.out.println(ciphered);
		Decrypt decryption = new Decrypt(ciphered);
		
		System.out.println(decryption.Decrypt(ciphered));
		
	}

}
