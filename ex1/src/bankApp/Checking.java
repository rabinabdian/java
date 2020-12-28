package bankApp;

public class Checking extends Account{

	
	// props check
	
	int debitCardNumber;
	int debitCardPIN;
	
	public Checking(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		System.out.println("NEW CHECKING ACCOUNT");
	}
	
}
