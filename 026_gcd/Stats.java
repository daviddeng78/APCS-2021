/**
 *Princess Peach: Jaylen Zeng, Yuki Feng, Paul Serbanescu, David Deng
 *APCS
 *HW26 -- GCD Three Ways / Solving a Problem Using Recursion, While Loops or Brute Force
 *2021-10-27
 *Time Spent: 0.5 hours
 *
 *
 *DISCO
 *There are multiple ways to approach solving a problem, some of which are more efficient at doing so than others.
 *
 *QCC
 *Is there a built-in method that tracks how long it takes to run a program?
 *
 *ALGO
 *Employs fact that the GCD of two numbers, a and b, is always equal to the GCD of the positive difference between the larger and smaller number and the smaller number.
 *This algorithm is recursive.
 *Base Case: If a is equal to b, returning either one is fine. We preferred a since it is a much better letter.
 *If a > b, invoke the method again, altering the larger number (a) to equal the positive difference (a - b).
 *Only other case is if a < b. The same thing that happened when a > b happens here except the larger number in this case is b. Therefore, we alter b instead to equal the positive difference or (b - a).
 *When we invoke the method again, it checks for equality between a and b first before proceeding to determine which variable is larger and invoking the method with respective arguments again.
 */

public class Stats
{
	public static int gcd(int a, int b)
	{
		int counter = 1;
		int answer = 1;

		while (counter <= a)
		{
			if (a % counter == 0 && b % counter == 0)
			{
				answer = counter;
			}
			counter++;
		}
		return answer;
	}

	public static int gcdER(int a, int b)
	{
		if (a == b)
		{
			return a;
		}
		else if (a < b)
		{
			return gcdER(a, b - a);
		}
		else
		{
			return gcdER(a - b, a);
		}
	}

	public static int gcdEW(int a, int b)
	{
		while (a != b)
		{
			if (a > b)
			{
				a -= b;
			}
			else
			{
				b -= a;
			}
		}
		return a;
	}

	public static void main(String[] args)
	{
		//test gcd()
		System.out.println(gcd(1, 3)); //should print 1
		System.out.println(gcd(3, 3)); //should return 3
		System.out.println(gcd(15, 9)); //should return 3
		System.out.println(gcd(161, 343)); //should return 7

		System.out.println("---");

		//test gcdER()
		System.out.println(gcdER(1, 3));
		System.out.println(gcdER(3, 3));
		System.out.println(gcdER(15, 9));
		System.out.println(gcdER(161, 343));

		System.out.println("---");

		//test gcdEW()
		System.out.println(gcdEW(1, 3));
		System.out.println(gcdEW(3, 3));
		System.out.println(gcdEW(15, 9));
		System.out.println(gcdEW(161, 343));
	}
}
