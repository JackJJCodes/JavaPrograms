import java.util.Scanner;

class BankAccount {
	@SuppressWarnings("unused")
	private int acno;
	private double bal=0;
	Scanner get = new Scanner(System.in);
	BankAccount()
	{
		System.out.println("Enter the account number: \n");
		acno = get.nextInt();
		System.out.println("Enter initial balance: \n");
		bal = get.nextFloat();
	}
	BankAccount(int x, double y)
	{
		acno = x;
		bal = y;
	}
	void deposit()
	{
		float amount;
		System.out.println("Enter Amount to be deposited: \n");
		amount = get.nextFloat();
		bal = bal + amount;
		System.out.println("Deposited! Account Balance is " + bal);
	}
	void withdraw()
	{
		float amount;
		System.out.println("Enter amount to be withdrawn: \n");
		amount = get.nextFloat();
		if(amount < bal)
		{
			bal = bal - amount;
			System.out.println("Amount withdrawn! Avaliable balance is " + bal);
		}
		else
			System.out.println("Insufficient Funds, G");
	}
	
}
//Driver code:
public class Bank
{
	public static void main(String args[])
	{
		BankAccount obj = new BankAccount();
		obj.deposit();
		obj.withdraw();
	}
}
