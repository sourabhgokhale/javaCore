package exercise;

public class ex15 {

	// find max number in array
	
	public static void main(String[] args) {
		
		int []a = {1,2,5,4,7,8,9,12,50,54545,55,125,44,77,56,-5,-456,456,41,987};
		int max = a[0];
		
		for (int i = 1; i<a.length; i++) {
			if (max<a[i]) {
				max = a[i];
			}
		}System.out.println(max);
		
		
		
		
	}
	
	
	
}
