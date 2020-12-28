package bankApp;

public abstract class Account implements IRate {

	// props
	String name;
	String sSN;
	double balance;
	String accountNumber;
	double rate;

	public Account(String name) {

		System.out.println("Name: " + name);
		System.out.println("NEW ACCOUNT: ");

	}

}
