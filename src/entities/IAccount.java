package entities;

public interface IAccount {

	void withdraw(double amount);
	
	void deposit(double amount);
	
	void tranfer(double amount, IAccount targetAccount);
}
