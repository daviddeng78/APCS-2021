/*
Quad Puffs -- David Deng / Yat long Chan / Samantha Hua / Lindsay Phung
APCS
HW20 -- External Audit/ Test other group's BankAccount in a different class
2021-10-19

DISCO
- You can only access private variables and methods within the class they are created in.
  - One way around this issue is to create public methods that call upon the private variables/methods

QCC
  ON TARGET TRIO CODE: 
  - toString() or method to print/return account info is needed.

  - We aren't able to check account info because there is no toString() or print/return info method that we can run to avoid calling the instance variables directly. Instance vars are private so we can't access them in this class.

  - Authenticate method only tests to see whether the values inputted match the instance of BankAccount named myCopyDuck instead of the account information provided for each individual instance. People wouldn't be able to authenticate themselves if they don't know the info of myCopyDuck and if they DO know the info of myCopyDuck, they can authenticate themselves into any instance and mess stuff up.

  - The return type for WithdrawMoney() should be boolean and not void.

  - Suggestive edit: There should also be a mutator for each individual variable instead of setting all the variables in one method. This makes it so that you don't have to set each inst var everytime you want to change a specific var.
*/
 
/*
TARGET TRIO FILE:
Trio number int x (Orion Roven(Von Geburt), May Qiu(Perry Jr.), Lawrence Joa(Steve, John))
APCS
HW19 -- Mo Money Mo Problems ...MORE AWESOME
10/18/21
DISCO:
|| is used in boolean statements to represent the word "or"
e.g. if(x||y){//do stuff} means that the conditional will only happen if x is true or y is true.
if we try to compare the parameters of authenticate() to the values in myDuck in the authenticate() method, then we get a static error because myDuck is not defined in the authenticate() method
a solution to this is for authenticate(), we can create a copy of myDuck called myCopyDuck, and test myCopyDuck against the parameters of authenticate()
QCC:
our withdraw method and the one in the library repo are void (meaning that it doesn't return anything), so how can we return True or False if the method doesn't have a boolean return type?
*/

public class BankAccount {
    private String acctHolder;
    private String password;
    private int pin;
    private int accountNum;
    private double bal;

    public void SetAcctInfo(String name, String pw, int PinInput, int acctNum, double startBal){
        acctHolder=name;
        password=pw;
        pin=PinInput;
        accountNum=acctNum;
        bal=startBal;
        if(accountNum<100000000 || accountNum>999999998){
   		     accountNum = 999999999;
   		     System.out.println("Must be 9 digit account number");
        }
        if(pin<1000 || pin>9998){
          pin=9999;
          System.out.println("Must be 4 digit pin");
        }
    }

    public void DepositMoney(double paycheck){
        bal= bal + paycheck;
    }

    public void WithdrawMoney(double moneySpent){
        if (bal<moneySpent){
          System.out.println("you are broke");
        } else {
          bal= bal - moneySpent;
        }
    }

    public static boolean authenticate(int maybeAcctNum, String maybePw){
        BankAccount myCopyDuck = new BankAccount();

        myCopyDuck.SetAcctInfo("Von Geburt","nunyazbizniz",3217,448922391,1);//set myCopyDuck to the same as myDuck

        if (maybeAcctNum==myCopyDuck.accountNum && maybePw==myCopyDuck.password){
          return true;
        } else {
          return false;
        }
    }

    public static void main(String[] args){
      BankAccount myDuck = new BankAccount();

      myDuck.SetAcctInfo("Von Geburt","nunyazbizniz",3217,448922391,1);
      myDuck.DepositMoney(.05);
      myDuck.WithdrawMoney(.5);
      System.out.println("account holder: "+myDuck.acctHolder);
      System.out.println("password: "+myDuck.password);
      System.out.println("pin: "+myDuck.pin);
      System.out.println("account number: " +myDuck.accountNum);
      if (myDuck.bal==1) {
          System.out.println("balance: "+myDuck.bal+" dollar");
      } else {
          System.out.println("balance: "+myDuck.bal+ " dollars");
      }
      System.out.println(authenticate(448922391,"nunyazbizniz"));
    }
}

