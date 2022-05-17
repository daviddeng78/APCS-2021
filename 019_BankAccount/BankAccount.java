/*
Quad Puffs -- David Deng / Yat long Chan / Samantha Hua / Lindsay Phung
APCS
HW19 -- Mo Money Mo Problems ...MORE AWESOME / add conditionals to BankAccount
2021-10-18
DISCO
- Java automatically sets whole numbers as an int, so you must typecast the number when using short as a param. 
Type Casting Format: (<DESIREDDATATYPE>) <NUMBER>
This is required when the data type you want to convert to holds less information than the previous data type. This conversion must be forced so Java knows not to bring up a loss of data error during complilation.
QCC
- PIN is currently not being used, what will it be used for?
*/

public class BankAccount {
  private String holderName;
  private String password;
  private short PIN;
  private int accNum;
  private double balance;

  public String setName(String name) {
    String oldName = holderName; 
    holderName = name;
    return oldName;
  }

  public String setPass(String pass) {
    String oldPass = password; 
    password = pass;
    return oldPass;
  }
  
  public short setPIN(short p) {
    short oldPin = PIN;
    if (p >= 1000 && p <= 9998) {
      PIN = p;
    } else {
      PIN = 9999;
      System.out.println("Your PIN is invalid. Please enter a 4 digit number less than 9999");
    }
    return oldPin;
  }
  
  public int setAccNum(int num) {
    int oldAccNum = accNum;
    if (num >= 100000000 && num <= 999999998) {
      accNum = num;
    } else {
      accNum = 999999999;
      System.out.println("Your account number is invalid. Please enter a 9 digit number less than 999999999");
    }
    return oldAccNum;
  }
  
  public double setBalance(double bal) {
    double oldBal = balance;
    balance = bal;
    return oldBal;
  }

  public String toString() {
    String infoStr = "\nAccount info:\n=======================";
    infoStr = infoStr + "\nName: " + holderName;
    infoStr = infoStr + "\nPassword: " + password;
    infoStr = infoStr + "\nPIN: " + PIN;
    infoStr = infoStr + "\nAccount Number: " + accNum;
    infoStr = infoStr + "\nBalance: " + balance;
    infoStr = infoStr + "\n=======================";
    return infoStr;
  }
  
  public void deposit(double deposit) {
    balance += deposit;
    System.out.println("Your deposit was successful!");
    System.out.println("Your new balance is: $" + balance);
  }

  public boolean withdraw(double withdrawal) {
    if (withdrawal > balance) {
      return false;
    } else {
      balance -= withdrawal;
      System.out.println("Your withdrawal was successful!");
      System.out.println("Your new balance is: $" + balance);
      return true;
    }
  }

  public boolean authenticate(int authAccNum, String authPass) {
    if (authAccNum == accNum && authPass == password){
      return true;
    } else {
      return false;
    }
  }
  public static void main(String[] args) {
    BankAccount outOfBounds = new BankAccount();
    outOfBounds.setName("Out Bounds");
    outOfBounds.setPass("uh oh");
    outOfBounds.setAccNum(100); // out of bounds accNum
    outOfBounds.setPIN((short) 1); //out of bounds PIN
    outOfBounds.setBalance(10.00);
    System.out.println(outOfBounds.toString()); // check if PIN and accNum set properly
  
    BankAccount joseph = new BankAccount();
    joseph.setName("Joseph");
    joseph.setPass("password");
    joseph.setAccNum(123456789); 
    joseph.setPIN((short) 1234);
    joseph.setBalance(1000000);
    System.out.println(joseph.toString());
    System.out.println("withdrawTest, over balance (ret false): " + joseph.withdraw(1000001)); // over balance - should print false
    System.out.println(joseph.withdraw(1)); //within balance - should print statement and true
    joseph.deposit(1000000);
    System.out.println("authTest, incorrect pass and accNum (ret false): " + joseph.authenticate(123456780, "pass")); // incorrect pass and accNum - should print false
    System.out.println("authTest, incorrect accNum (ret false): " + joseph.authenticate(123456780, "password")); // incorrect accNum, correct pass - should print false
    System.out.println("authTest, incorrect pass (ret false) " + joseph.authenticate(123456789, "pass")); // incorrect pass, correct accNum - should print false
    System.out.println("authTest, correct pass and accNum (ret true): " + joseph.authenticate(123456789, "password")); // both correct - should print true
  }

}
