import java.util.*;

class BankAccount
{
	private String name;
	public long number;
	private long contactNumber;
	private double balance;
	BankAccount(String name,long number,long contactNumber,double balance)
	{
		this.name="no_name";
		this.number=00000000;
		this.contactNumber=0000000000;
		this.balance=0.0;
	}
	public void showBalance()
	{
		System.out.println(this.balance);	
	}
	public void deposite(int amount)
	{
		this.balance+=amount;
	}
	public void withdraw(int amount)
	{
		if((this.balance-amount)>0)
		{
			this.balance-=amount;
			System.out.println( amount +" has been debited from your account. Your balance is " + this.balance );
		}
		else
		{
			System.out.println("Insufficient balance !");
		}
	}

}

class Bank
{
	public static void main(String args[]) {
	BankAccount account1 = new BankAccount("Mrunali Jangam",123123123,9898969632L,21000);
	BankAccount account2 = new BankAccount("Esha Pramanik",123123124,8585853262L,23000);
	BankAccount account3 = new BankAccount("Animesh Wakade",123123125,4556253578L,40000);
	long accountNumber;
	System.out.println("Enter account number");
	Scanner sc = new Scanner(System.in);
	accountNumber=sc.nextLong();
	if(accountNumber==account1.number)
	{
		account1.showBalance();
		account1.withdraw(10000);
		account1.showBalance();
	}

	else if(accountNumber==account2.number)
	{
		account2.showBalance();
		account2.withdraw(100000);
		account2.showBalance();
	}

	
	else if(accountNumber==account3.number)
	{
		account3.showBalance();
		account3.withdraw(15000);
		account3.showBalance();
	}
	}
}