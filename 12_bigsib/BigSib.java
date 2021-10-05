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


public class BigSib
{
	public String msg;

	public void setHelloMsg(String msg)
	{
		this.msg = msg;
	}

	public String getMsg()
	{
		return msg;
	}

	public String greet(String noun)
	{
		return getMsg() + " " + noun;
	}
}
