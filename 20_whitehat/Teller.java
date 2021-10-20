/*
Quad Puffs -- David Deng / Yat long Chan / Samantha Hua / Lindsay Phung
APCS
HW20 -- External Audit/ Test other group's BankAccount in a different class
2021-10-19

TARGET TRIO: Trio number int x (Orion Roven(Von Geburt), May Qiu(Perry Jr.), Lawrence Joa(Steve, John))

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

public class Teller{
  public static void main(String [] args){
    BankAccount sketchy = new BankAccount();

    sketchy.SetAcctInfo("my mom","nunyazbiz",4295,379572759,100);
    sketchy.SetAcctInfo("my mom","nunyazbiz",1,2,100); // Out of bounds PIN and account number
    sketchy.DepositMoney(34.08);
    System.out.println(sketchy.authenticate(379572759, "nunyazbiz"));
    System.out.println(sketchy.authenticate(462627485,"heyya")); //incorrect account info. 

    /* Tests that gives errors

    System.out.println(sketchy.WithdrawMoney(3624));
    System.out.println(sketchy.WithdrawMoney(1));
    System.out.println("account holder: "+sketchy.acctHolder);
    System.out.println("password: "+sketchy.password);
    System.out.println("pin: "+sketchy.pin);
    System.out.println("account number: " +sketchy.accountNum);
    if (sketchy.bal==1) {
     System.out.println("balance: "+sketchy.bal+" dollar");
    } else {
     System.out.println("balance: "+sketchy.bal+ " dollars");
    }*/

      
    }
  }
