package entities;

public class Savings extends Account {
	
	public Savings(int agency, int number, double balance) {
		super(agency, number, balance);
		super.agency = 1;
		super.number = SEQUENTIAL++;
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
