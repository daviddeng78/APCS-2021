/**
 *Jelly: David Deng, Lea Kwok, Jacklyn Chen, Nameless, Gunter
 *APCS
 *HW10 -- Refactor Big Sib One / Utilizing Methods To Return A Certain Output
 *2021-10-04
 *
 *
 *DISCOVERIES
 *If a certain Java file requires another Java file in order for it to execute, the required Java file will automatically compile.
 *
 *UNRESOLVED QUESTIONS
 *No questions were unresolved.
 */

public class Greet
{
	public static void main(String[] args)
	{
		System.out.println(BigSib.greet("Mr. Mykolyk"));
		System.out.println(BigSib.greet("Lea"));
		System.out.println(BigSib.greet("Jacklyn"));
	}
}
