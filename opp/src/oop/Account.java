package oop;

public class Account {
	
	private String number;
	private String accountTpye;
	private double balance;
	
	
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	} 
	public String getAccountTpye() {
		return accountTpye;
	}
	public void setAccountTpye(String accountTpye) {
		this.accountTpye = accountTpye;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit (double d) {
		balance = balance+ d;
	}
	public void withdrawl (double w) {

		balance = balance - w;
		
	}
	
	public void fundTransfer(double f) {

		balance = balance - f;
		
		
	}
	
	public void paybill (double p) {
		
		balance = balance - p;
	}
	
}
