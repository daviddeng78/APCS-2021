/**
 *QUAD PUFFS: Yat Long Chan, Lindsay Phung, David Deng, Samantha Hua
 *APCS
 *HW29 -- Which Way Do You Roll? / Commafy an int iteratively and recursively
 *2021-11-01
 *Time spent: 0.8 hrs
 *
 *
 *DISCO
 *Wrapper classes have a variety of methods including converting between variable types.
 *FOREACH loops go through every single element in an array, similar to Python's FOR loop.
 *A FOREACH loop can be used in main to take test params directly from the console.
 *
 *QCC
 *Recursive methods are sometimes very unintuitive. e.g. commafyR()
 */

public class Commafier
{
	public static String commafyF(int n)
	{
		String ans = "";
		String strInt = Integer.toString(n);

		if (strInt.length() < 4)
		{
			ans += strInt;
		}
		else
		{
			for (int i = 0; i < strInt.length(); i++)
			{
				if ((strInt.length() - i) % 3 == 0 && i != 0)
				{
					ans += ",";
				}
				ans += strInt.substring(i, i + 1);
			}
		}
		return ans;
	}

	public static String commafyR(int n)
	{
		String strInt = Integer.toString(n);
		if (strInt.length() < 4)
		{
			return strInt;
		}
		int newNum = Integer.parseInt(strInt.substring(0, strInt.length() - 3));
		return commafyR(newNum) + "," + strInt.substring(strInt.length() - 3);
	}

	public static void main(String[] args)
	{
		for (String s : args)
		{
			System.out.println("RECURSIVE TEST: " + commafyR(Integer.parseInt(s)) + "\n");
			System.out.println("ITERATIVE TEST: " + commafyF(Integer.parseInt(s)) + "\n");
		}
	}
}
