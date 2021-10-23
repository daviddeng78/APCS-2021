/**
 *TNPG: DIY (David Deng, Yat Long Chan)
 *APCS
 *HW23 -- What Does Equality Look Like? / Comparing Variables from Different Objects
 *2021-10-22
 *Time Spent: 11 minutes
 *
 *DISCOS
 *If a variable in another class is named exactly the same as a variable in your current class, use the Java keyword `this` to refer to the local variable.
 *QCC
 *No unresolved questions.
 **/

public class Driver {

  public static void main( String[] args ) {

    //build Objects from blueprint specified by class Coin


    //test default constructor

      Coin mine = new Coin();

      //test 1st overloaded constructor
      Coin yours = new Coin( "quarter" );

      //test 2nd overloaded constructor
      Coin wayne = new Coin( "dollar", "heads" );

      //test toString() methods of each Coin
      System.out.println("mine: " + mine);
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);

      //test flip() method
      System.out.println("\nAfter flipping...");
      yours.flip();
      wayne.flip();
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);

      //test equals() method
      if ( yours.equals(wayne) ) {
        System.out.println( "Matchee matchee!" );
      }
      else {
        System.out.println( "No match. Firestarter you can not be." );
      }
      /*===================TOP==========================
      ====================BOTTOM======================*/

  }//end main()

}//end class
