package entities;

public class Checking_account extends Account {
	
	public Checking_account(int agency, int number, double balance) {
		super(agency, number, balance);
		super.agency = STD_AGENCY;
		super.number = SEQUENTIAL;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tranfer(double amount, IAccount targetAccount) {
		// TODO Auto-generated method stub
		
	}
}
