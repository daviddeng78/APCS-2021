/**
 *TNPG: DIY (David Deng, Yat Long Chan)
 *APCS
 *HW24 -- Get It While You Can / While Loops in A Class
 *2021-10-25
 *Time Spent: 0.5 hours
 *
 *
 *DISCOS
 *this(<param(s)>) is used to call the corresponding constructor within the object.
 *
 *QCC
 *No unresolved questions.
 *
 *POST-v0 MODS
 *used this() with overcons
 *simplified defcon to use the method reset()
 *removed extra conditional loops
 *simplfied assignValue() with .equals()
 **/

public class Driver {

	public static void headCount(Coin inst, int max)
	{
		int headsCt = inst.getHeadsCtr();
		int flips = 0;
		while (headsCt < max)
		{
			inst.flip();
			headsCt = inst.getHeadsCtr();
			flips += 1;
		}
		System.out.println("It took " + flips + " flips for " + max + " heads to come up.");
	}

	public static void matchCount(Coin c1, Coin c2, int matches)
	{
		int matchCtr = 0;
		int flips = 0;
		while (matchCtr < matches)
		{
			c1.flip();
			c2.flip();
			if (c1.equals(c2))
			{
				matchCtr += 1;
			}
			flips += 1;
		}
		System.out.println("It took " + flips + " flips for " + matchCtr + " matches to occur.");
	}

	public static void yearMatch(Coin c1, Coin c2, int birthyear)
	{
		int matchCtr = 0;
		int flips = 0;
		while (matchCtr < 65536)
		{
			c1.flip();
			c2.flip();
			if (c1.equals(c2))
			{
				matchCtr += 1;
			}
			flips += 1;
		}

		while (matchCtr % birthyear != 0)
		{
			c1.flip();
			c2.flip();
			if (c1.equals(c2))
			{
				matchCtr += 1;
			}
			flips += 1;
		}
		System.out.println("It took " + flips + " flips for the # of matches to be greater than 65536 and completely divisible by " + birthyear + ".");
	}

	public static void main( String[] args ) {

    		//build Objects from blueprint specified by class Coin


		//test default constructor
		/*===================TOP==========================
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
      		====================BOTTOM======================*/
		Coin coin1 = new Coin("penny", "heads");
		Coin coin2 = new Coin("quarter", "heads");
		headCount(coin1, 10);
		matchCount(coin1, coin2, 10);
		yearMatch(coin1, coin2, 2005);
  	}//end main()

}//end class
