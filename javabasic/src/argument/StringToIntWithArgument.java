package argument;

public class StringToIntWithArgument {


public static void main(String[]args) {
	
	
int size = args.length;

if(size==2) {
	System.out.println("hello "+ args[0]+" "+args[1]+"How was your day?");
	

	
	
}else {
	for(int i = 0; i<size; i++) {
		System.out.println("False");
		System.out.println(i +" "+ args[0]);
	}
	
}
	
}

}