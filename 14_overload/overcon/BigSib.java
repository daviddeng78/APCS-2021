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

public class BigSib
{
	private String msg;

	public BigSib()
	{
		this.msg = "Word up";
	}

	public BigSib(String msg)
	{
		this.msg = msg;
	}

	public String greet(String noun)
	{
		return msg + " " + noun;
	}
}
