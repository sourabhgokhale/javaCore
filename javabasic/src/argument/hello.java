package argument;

public class hello {
	public static void main(String[] args) {
		 System.out.println("hello " );
		for(String s:args) {
		 System.out.print(s+" ");
		}
		System.out.println(args.length);
		if (args.length==11) {
			System.out.println("true");
			
		}else {
			System.out.println("error");
		}
			
		
	}

}
