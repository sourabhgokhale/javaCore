package pract123;

public class operatorsWork {
	public static void main (String[]arg) {
		
		int a = 10;
		int b = 20;
		a=b;
		a++;
		// System.out.println(a);
		// System.out.println(b);
		
		//
		int c =10;
		int d = 20;
		int e=30;
		c=d;
		d=e;
		c=e=d;
		c++;
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		//
		System.out.println("--------Arithmetic Operator ' + , - , * , / , '---------");
		int s= 10;
		int q = 6+s;
		System.out.println(q);
		
		System.out.println("--------assign operator ---------");
		int ab=4;
		int bb = 4*ab;
		System.out.println(bb);
		
		System.out.println("-------Modulo-------- "); // Modulo ==> its return remainder 
		
		int k = 10;
		int j = 2 %k;
		System.out.println(j);
		
		System.out.println("----");
		int y = 9;
		y+=3;
		System.out.println(y);
		
		System.out.println("-------Comparision Operators-----it's Return True or false-----");
		
		int A= 4;
		int B = 20;
		
		System.out.println(A==B);
		System.out.println(A<B);
		
		System.out.println("--------Logical Operator--------");
		
		int p = 10;
		int w = 20;
		System.out.println(p<w && p>w);
		
		System.out.println("--------------");
		int pp = 10;
		int p1= 20;
		int p3=10;
		System.out.println(pp==p3 || p1>pp || p1<pp);
		
		
		
		
		
		
		
		
		
	}

}
