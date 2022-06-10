package exercise;

public class ex13 {
	
	public static void main(String[] args) {
		
		int i = 1;
		int num=5;
		double result = 0.00;
		
				
		
		while (i<=num) {
			System.out.println("1/"+ i + " = " + result);
			result = result+(double)1/i;
			i++;
			
		}
		System.out.println("\n\nsum of Harmonic Series is " + result);
	}
}