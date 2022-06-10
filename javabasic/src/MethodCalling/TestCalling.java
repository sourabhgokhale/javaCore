package MethodCalling;

public class TestCalling {
	public static int add() {
	int a =10;
	int b =20;
	int c =a+b;
	return c;
	
	
	}
	
	public void sou() {
	int q= 2;
	int w=3;
	int r=2+3;
	
	}



public static void main (String[] args) {
	


	int d = add();
	System.out.println(d);
	
	TestCalling t = new TestCalling();
	t.sou();
	

}

}