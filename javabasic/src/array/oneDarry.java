package array;

public class oneDarry {
	
	
	public static void main(String [] args) {
	
		// First method (array)
		
		int[]table ;
		table = new int[5];
		table[0]= 45;
		table [1]= 20;
		table[2]=50;
		
		for(int n =0; n<table.length; n++)
		System.out.println(n + " " + table[n]);
		
		
		//  Second method of 1D array
		
		int[] tab = {1,2,3,4,5,6,};
		
		for(int num=0; num<tab.length;num++)
		//System.out.println(tab[num]);
	
		
	
	// 2D array
		
		int[][] twod = {{1,5,7,6,7,8},{55,6,5,6,5,4}, {15,6,5,4,6,7}};
		
		for (int i=0; i<6;i++) {
			
			for (int j =0; j<6;j++)
			System.out.println(twod[i][j]+" ");
		}
		
	
		
		
				
}
	
	
}