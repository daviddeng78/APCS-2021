/**
 *David Deng
 *APCS
 *HW13 -- Where do Big Sibs Come From? / Constructors
 *2021-10-06
 *
 *
 *DISCOS
 *Constructors should be public in order for other files to utilize them.
 *
 *QCCs
 *No questions were unresolved.
 */


public class Greet
{
	public static void main(String[] args)
	{
		String greeting;

		BigSib richard = new BigSib();

    		greeting = richard.greet("freshman");
    		System.out.println(greeting);

		richard.setHelloMsg("Salutations");
		greeting = richard.greet("Dr. Spaceman");
		System.out.println(greeting);

		richard.setHelloMsg("Hey ya");
		greeting = richard.greet("Kong Fooey");
		System.out.println(greeting);

		richard.setHelloMsg("Sup");
		greeting = richard.greet("mom");
		System.out.println(greeting);
  	}
}
