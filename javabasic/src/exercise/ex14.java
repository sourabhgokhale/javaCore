
package exercise;

import java.util.Scanner;

public class ex14 {
	
	public static void main (String[] args) {
		
		// Prime number jo 1 se ya it self se devied ho jaye
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		
				
		int number = sc.nextInt()  ,rem = 0;
		
	
	
		for (int i=2; i<=number-1; i++) {
			if (number%i==0) {
				rem=rem+1;
			}
		}if (rem>0) {
			System.out.println(number +" is not prime");
		}else
			System.out.println(number+" Prime Number");
		
			
		
	}

}
