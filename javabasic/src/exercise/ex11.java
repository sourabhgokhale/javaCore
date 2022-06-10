package exercise;

public class ex11 {
	
	
	// esa number jo khud se ya 1 se divibl ho called prime number 
	
	public static void main(String[] args) {
		
	

	
	int n=10;	int c=n;
	boolean flag =false;
	for (int i = 2; i<=n/2;i++) {
		if (n%i==0) {
		  flag=true  ;
		  
		}
	}
	if (!flag) {
		System.out.println(n+" it is a prime number ");
	}else 
		System.out.println(n+" Not prime number ");
	

}
}