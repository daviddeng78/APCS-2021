/**
 *Quad Puffs: Yat Long Chan, David Deng, Samantha Hua, Lindsay Phung
 *APCS
 *HW18 -- CPA-One / Transferring UML Diagrams Into Code and Reinforcing Past Concepts
 *2021-10-14
 *
 *
 *DISCOS
 *UML diagrams are very useful.
 *
 *QCCs
 *Unclear about what purpose "static" serves.
 *
 *Team Quad Puffs' Latest and Greatest Q2 Response: We know that Java provides a default constructor because when we initialized variables without explicitly stating a constructor, the program still ran without error.
 *Team Quad Puffs' Latest and Greatest Q3 Response: Create a method that returns said object and expects String. If there is no error, it means Java converted the object to a String.
 */

public class BankAccount
{
	private String holderName;
	private String password;
	private short PIN;
	private int accNum;
	private float balance;

	public BankAccount(String n, String p, short pin, int accNumber, float b)
	{
		setName(n);
		setPass(p);
		setPIN(pin);
		setAccNum(accNumber);
		setBalance(b);

	}

	private void setName (String name)
	{
		holderName = name;
	}

	private void setPass (String pass)
	{
		password = pass;
	}

	private void setPIN (short p)
	{
		PIN = p;
	}

	private void setAccNum (int num)
	{
		accNum = num;
	}

	private void setBalance (float bal)
	{
		balance = bal;
	}

	public void printInfo() {
		System.out.println("Full name: " + holderName);
		System.out.println("Account Number: " + accNum);
		System.out.println("Your PIN: " + PIN);
		System.out.println("Password: " + password);
		System.out.println("Balance: " + balance);
	}

	public void deposit(float deposit) {
		balance += deposit;
		System.out.println("Your deposit was successful!");
		System.out.println("Your new balance is: $" + balance);
	}

	public void withdraw(float withdrawal) {
		balance -= withdrawal;
		System.out.println("Your withdrawal was successful!");
		System.out.println("Your new balance is: $" + balance);
	}

	public static void main(String[] args) {
		BankAccount joseph = new BankAccount("joseph", "password", (short) 1234, 123456789, 1000000);
		joseph.printInfo();
		joseph.deposit(1000000);
		joseph.withdraw(1);
	}

}
