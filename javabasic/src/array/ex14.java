package array;

public class ex14 {
	public static void main(String[] args) {
		
		// Odd and Even number
		
		int [] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
		int j=0;int k=0;
		for (int i:a) {
			if(i%2==0) {
				j+=i;
			}
			else {
				k+=i;
				System.out.println("even "+j+"odd "+k);
			}
			
			
		}
		
		
		
		
//		if (a%2==0) {
	//		System.out.println("This is Even number");
//		else 
	//		System.out.println(" This is Odd number");
	}//


}
