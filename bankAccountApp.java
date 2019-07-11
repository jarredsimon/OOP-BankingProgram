package oop;

public class bankAccountApp {

	public static void main(String[] args) {
		bankAccount acc1 = new bankAccount();
		
		acc1.setName("Roger Hue");
		acc1.setSsn("458745412");
		
		System.out.println("Name: "+acc1.getName() +", SSN: "+acc1.getSsn());
		
		acc1.balance = 1000;
		acc1.accountNum = "892838";
		System.out.println(acc1.toString());
		
		bankAccount acc2 = new bankAccount("Checking Account");
		bankAccount acc3 = new bankAccount("Savings Account", 5000);
		
		acc1.setRate();
		acc1.increaseRate();

	}

}