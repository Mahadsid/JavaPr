public class bank
{
	private double balance;
	private double interest;

	public void SavingsAccount()
	{
		balance = 0;
		interest = 0;
	}

    public void SavingsAccount(double initialBalance, double initialInterest)
	{
		balance = initialBalance;
		interest = initialInterest;
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public void withdraw(double amount)
	{
		balance = balance - amount;
	}

	public void addInterest()
	{
		balance = balance + balance * interest;
	}

	public double getBalance()
	{
		return balance;
	}

    public static void main(String[] args)
	{
		bank S = new bank();
		S.withdraw(250);
		S.deposit(400);
		S.addInterest();
		System.out.println(S.getBalance());
		System.out.println("Expected: 1265.0");
		//1000-250=750 => 750+400=1150 => 1150+1150*0.10=1265.0
	}
}

