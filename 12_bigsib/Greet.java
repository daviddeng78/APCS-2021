/**
 *David Deng
 *APCS
 *HW12 -- On Elder Individuality and the Elimination of Radio Fuzz / Get and Set Methods, Instance Variables, this.
 *2021-10-05
 *
 *
 *DISCOS
 *Get and set methods can be used to retrieve and modify instance variables.
 *this. refers to the object in the instance variable in the current method.
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
