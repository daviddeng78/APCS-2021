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
