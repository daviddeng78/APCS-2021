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

public class BigSib
{
	private String msg;

	public BigSib()
	{
		this.msg = "Word up";
	}

	public void setHelloMsg(String msg)
	{
		this.msg = msg;
	}

	public String greet(String noun)
	{
		return msg + " " + noun;
	}
}
