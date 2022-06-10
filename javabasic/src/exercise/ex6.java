package exercise;

public class ex6 {
	
	public static void main(String[] args) {
		// febonacci series 1-10 means , 0+1=1 , 1+2=3  , 2+3 =5 , 3+5=8
		
		int a = 0, b=1, c = 0;
		
		for (int i=1 ; i<=10; i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}
	
	}
}