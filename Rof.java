/**
 *David Deng
 *APCS
 *HW27 -- FOR the Love of Strings / Using built-in methods to reverse Strings
 *2021-10-28
 *Time Spent: 0.5 hours
 *
 *
 *DISCO
 *Java essentially marks each letter in a String from 0 to the length of the String minus one, much like an array.
 *String.substring() returns a substring of the original string. Is an overloaded method: startIndex is always required, endIndex is optional.
 *
 *QCC
 *No unresolved questions
 */

public class Rof
{
	public static String fenceF(int posts)
	{
		String fence = "|";
		for (int i = 0; i < posts; i++)
		{
			fence += "--|";
		}
		return fence;
	}

	public static String reverseF(String s)
	{
		String result = "";
		for (int i = 0; i < s.length(); i++)
		{
			result += s.substring(s.length() - i - 1, s.length() - i);
		}
		return result;
	}

	public static String reverseR(String s)
	{
		if (s.length() == 1)
		{
			return s;
		}
		else
		{
			return s.substring(s.length() - 1) + reverseR(s.substring(0, s.length() - 1));
		}
	}

	public static void main(String[] args)
	{
		System.out.println(fenceF(7));
		System.out.println(reverseF("hello"));
		System.out.println(reverseR("hello"));
	}
}
