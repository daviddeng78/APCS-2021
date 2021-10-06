/**
 *David Deng
 *APCS
 *HW12 -- On Elder Individuality and the Elimination of Radio Fuzz / Get Methods, Instance Variables, this.
 *2021-10-05
 *
 *
 *DISCOS
 *Set methods can be used to modify instance variables.
 *this. refers to the instance variable in the current method.
 *
 *QCCs
 *No questions were unresolved.
 */

public class BigSib
{
	private String msg;

	public void setHelloMsg(String msg)
	{
		this.msg = msg;
	}

	public String greet(String noun)
	{
		return msg + " " + noun;
	}
}
