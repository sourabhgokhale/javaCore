package argument;

public class switchArgs {

	public static void main(String[]args) {
		
		int size = args.length;
		
		switch(size) {
		
		case 0: System.out.print("hello");
		break;
		
		case 1 : System.out.print("1. "+ args[0]);
		break;
		
		case 2 : System.out.print("2. "+args[1]);
		break;
		
		case 3: System.out.print("3. "+ args[2]);
		break;
		
		case 4: System.out.print("4. "+args[3]);
		break;
		
		case 5: System.out.print("5. "+args[4]);
		break;
		
		default:
			
		for (int i=0; i<size; i++) {
			System.out.print(" " + args[i]);
		}
		}
		
		
	}
}
