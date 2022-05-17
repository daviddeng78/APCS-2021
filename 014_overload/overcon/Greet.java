/**
 *Dynamic Duo That Is Actually A Trio: David Deng, Nameless, Jacklyn Chen, Large, Ariel Fuchs, The Duckler
 *APCS
 *HW14 -- Customize Your Creation / Overloaded Constructors
 *2021-10-07
 *
 *
 *DISCOS
 *Constructors can have the same name but must take different parameters (known as overloaded constructors)
 *QCCS
 *No unresolved questions
 */

public class Greet
{
	public static void main(String[] args)
	{
		String greeting;

		BigSib richard = new BigSib();
		BigSib tracy = new BigSib("Salutations");
		BigSib michael = new BigSib("Hey ya");
		BigSib rachel = new BigSib("Sup");

    		greeting = richard.greet("freshman");
    		System.out.println(greeting);

		greeting = tracy.greet("Dr. Spaceman");
		System.out.println(greeting);

		greeting = michael.greet("Kong Fooey");
		System.out.println(greeting);

		greeting = rachel.greet("mom");
		System.out.println(greeting);
  	}
}
