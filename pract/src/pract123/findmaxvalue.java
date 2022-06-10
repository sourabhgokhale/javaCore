package pract123;

public class findmaxvalue {

	public static void main(String[] args) {
		
		int[]a = {4,5,0,3,6,55,14,20};
		int max = a[0];
		int temp=0;
		for (int i =1 ; i<a.length;i++) {
			if (max<a[i]){
				
				temp= max;
				max=a[i];
			}
		}
		System.out.println("max number is = " + temp);
		
		
		int []b = {2,5,4,7,3,6,8,9,2,-2,0,-10};
		int min = b[0];
		
		for (int j = 1; j<b.length;j++) {
			if (min>b[j]) {
				min =b[j];
				
			}
		}
		System.out.println("minum number = "+min);
		
		
	}
	
	
	
}
