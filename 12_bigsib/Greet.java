/**
 *David Deng
 *APCS
 *HW12 -- On Elder Individuality and the Elimination of Radio Fuzz / Set Methods, Instance Variables, this.
 *2021-10-05
 *
 *
 *DISCOS
 *Set methods can be used to modify instance variables.
 *this. refers to the instance variable in the current method.
 *
 *QCCs
 *No unresolved questions
 */

public class Greet
{
	public static void main(String[] args)
	{
		String greeting;

		BigSib richard = new BigSib();

    		richard.setHelloMsg("Word up");
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
  	} //end main()
} //end Greet
