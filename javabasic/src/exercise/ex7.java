package exercise;

public class ex7 {
	public static void main(String[] args) {
	
													// i =100 <200 i%7 means , jab tak i me 7 se dev.(/) karne par remender 00 nahi aata
		int i ; int a=0;
		for (i=100; i<=200; i++) {
			if (i%7==0) {
				System.out.println(i);
				
				a=i+a;
		System.out.println(a);
		}
		}
		
	}

}
