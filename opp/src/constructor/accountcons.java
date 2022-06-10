package constructor;

public class accountcons {
	
	private String number;
	private String acType;
	private double balance;
	
	
	
	public accountcons(String number, String acType, double balance) {
		super();
		this.number = number;
		this.acType = acType;
		this.balance = balance;
	}
	public String getNumber() {
		return number;
	}
	public String getAcType() {
		return acType;
	}
	public double getBalance() {
		return balance;
	}
	
	public void depo(double d) {
		 balance= balance +d;
	}
	
}


