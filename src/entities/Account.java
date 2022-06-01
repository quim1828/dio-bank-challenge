package entities;

public abstract class Account implements IAccount {
	
	protected int agency;
	protected int number;
	protected double balance;
	
	protected static int SEQUENTIAL = 0;
	protected static int STD_AGENCY = 1;
	

	public Account(int agency, int number, double balance) {
		this.agency = agency;
		this.number = number;
		this.balance = balance;
	}

	public int getAgency() {
		return agency;
	}

	public void setAgency(int agency) {
		this.agency = agency;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public double getBalance() {
		return balance;
	}
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	public void deposit(double amount) {
		this.balance += amount;
	}
	public void tranfer(double amount, Account target) {
		this.balance -= amount;
		target.balance += amount;
	}
}
