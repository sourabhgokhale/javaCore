package Password;

import java.util.Random;

public class RandomPassword {

	
	private static int k;



	public static void main(String[] args) {
		
		
		System.out.println(generatePassword(9));
	}
		
		
		
		private static  char [] generatePassword(int length){ 
			
			String capitalCaseLetters= "ABCDEFGHIJKLMNOPQRSTWXYZ";
			String lowerCaseLetters = "abcdefghijklmnopqrstwxyz";
			String spicalCaseLetters = "!@#$%&*";
			String Number = "1234567890";
			
			String Combind = capitalCaseLetters + lowerCaseLetters + spicalCaseLetters + Number;
			
			
			
			Random random = new Random ();
			char[] password = new char[length];
		
	
		password [0]= capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		password [1]= lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		password [2]= spicalCaseLetters.charAt(random.nextInt(spicalCaseLetters.length()));
		password[3]=Number.charAt(random.nextInt(Number.length()));
		
		
		for (int k= 4; k<length; k++){
		
		password[k] = Combind.charAt(random.nextInt(Combind.length()));
		}
		
		return password;
	
		
		
		}
	
	
	
	
	
	
}
