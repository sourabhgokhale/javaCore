package constructor;

public class acTest {

	public static void main(String[] args) {
		
		accountcons a = new accountcons("6262626626", "saving", 5000);
		a.depo(1000);
		System.out.println(a.getNumber() + " "+a.getAcType()+a.getBalance());
	}
	
	
	
	
	
}
