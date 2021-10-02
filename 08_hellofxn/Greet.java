/**
 *David Deng
 *APCS
 *HW08 -- Refactor Freshie Zero / Creating A Basic Method, Calling Methods
 *2021-9-30
 *
 *
 *DISCOVERIES
 *Method parameters must include the data type of the inputs it will take.
 *
 *UNRESOLVED QUESTIONS
 *No unresolved questions.
 */

public class Greet
{
	public static void main(String[] args)
	{
		System.out.println("No hablo queso");
		greet("David");
		greet("Lea");
		greet("Jacklyn");
	}

	public static void greet(String name)
	{
		System.out.println("Why, hello there, " + name + ". How do you do?");
	}
}
