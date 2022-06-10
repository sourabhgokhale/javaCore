package oop;

public class accountMethods {
	
	public static void main(String[] args) {
		
		Account a = new Account();
		a.setNumber("35626478955");
		a.setAccountTpye("Savings");
		a.setBalance(5000);
		a.deposit(2000);
		a.fundTransfer(1500);
		a.paybill(500);
		a.withdrawl(1200);
		
		System.out.println(a.getNumber());
		
		System.out.println(a.getAccountTpye());
		
		System.out.println(a.getBalance());
		
		
		
		
		
	}

}
