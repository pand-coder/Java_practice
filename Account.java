import java.util.Scanner;
class Account{
	int accountNumber;
	String accountHolderName;
	double balance;

	Account(int acc_no,string ac_holder,double bal)
	{
		accountNumber=acc_no;
		accountHolderName=ac_holder;
		balance=bal;
	}

public void deposit(double amount)
	{
		if(amount>0)
		{
			balance += amount;
		}
		else
		{
			System.out.println("Invalid Amount");	
		}
	}

public void withdraw(double amount)
	{
		if(amount>0 && amount<=balance)
		{
			balance -= amount;
		}
		else
		{
			System.out.println("Amount can't be withdrawn");
		}
	}
public void displayAccountInfo()
{
System.out.println("Account Number:"+accountNumber);
System.out.println("Account Number:"+accountHoldername);
System.out.println("Balance:"+balance);	
}
 
