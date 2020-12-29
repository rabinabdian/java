package bankApp;

public class Savings extends Account{

	//props
	
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	public Savings(String name , String sSN , double initDeposit) {
		// TODO Auto-generated constructor stub
		super(name,sSN,initDeposit);
		
		System.out.println("NEW SAVING ACCOUNT");
	}
	
	
}
