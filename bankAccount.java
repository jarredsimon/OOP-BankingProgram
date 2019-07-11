package oop;

public class bankAccount implements IRate{
	
	String accountNum;
	static String routingNum = "34534";
	private String name;
	private String ssn;
	String accountType;
	int balance;
 
	
	//Constructor
	bankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
		
	}
	//over: loading: call same method name w/different arguments
	bankAccount(String accountType){
		System.out.println("NEW ACCOUNT: "+ accountType);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
		
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	//interface
	public void setRate() {
		System.out.println("Setting Rate");
	}
	public void increaseRate() {
		System.out.println("Increasing Rate");
	}
	
	
	
	
	bankAccount(String accountType, double initDeposit){
		System.out.println("NEW ACCOUNT: "+ accountType);
		System.out.println("INITIAL DEPOSIT OF: "+ initDeposit);
	}
	//methods
	void deposit() {
		
	}
	
	void withdraw() {
		
	}
	
	void checkBalance() {
		
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[" +name + ", " +accountNum +", Balance: $"+ balance + "]";
	}
	

}
