package PricipleOfOop;

public class BankAccount {
	
	String username;
	String bankName;
	
	int pin;
	long accno;
	double balance;
	String ifsc;
	
	
	public BankAccount(String userName,  String bankName,long accno, int pin, String ifsc) 
	{
		userName = username;
		this.accno = accno;
		this.ifsc = ifsc;
		this.pin = pin;
		this.bankName = bankName;
	}
	
	public String getUserName()
	{
		return username;
	}
	public String getBankName()
	{
		return bankName;
	}
	public long getAccno()
	{
		return accno;
	}
	public void setPin(long accno, int oldPin, int newPin)
	{
		if (this.accno == accno && pin == oldPin)
		{
			pin = newPin;
			System.out.println("Pin Updated ");
		}
		else
		{
			System.out.println("Invalid credentials ..");
		}
	}
	public String getIfsc()
	{
		return ifsc;
	}
	public double getBalance(long accno,int pin)
	{
		if (this.accno == accno && this.pin==pin) 
		{
			return balance;
		}
		else
		{
			System.out.println("Invali credentials");
			return 0;
		}
	}
	public void credit (long accno, int pin,double amt)
	{
		if (this.accno==accno && this.pin == pin) 
		{
			if (amt>0) 
			{
				balance += amt;
				System.out.println("Amount Credited ..");
			}
			else
			{
				System.out.println("Invalid Amount .. ");
			}
		}
		else
		{
			System.out.println("Inavalid Credentials .. ");
		}
	}
	public void debit(long accno,int pin,double amt)
	{
		if (this.accno == accno && this.pin == pin)
		{
			if (amt>0)
			{
				if (balance-amt>1000)
				{
					balance -= amt;
					System.out.println("amount debited Successfully ..");
				}
				else
				{
					System.out.println("Insuffficient Balance");
				}
			}
			else
			{
				System.out.println("Invalid Amount");
			}
		}
		else
		{
			System.out.println("Inavalid Credentials ..");
		}
	}
}























