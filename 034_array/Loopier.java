/*
Team Blue Steaks - Max Schneider, David Deng, Faiyaz Rafee
APCS
HW34 -- A Pirate's Life For Me/Working with Integer Arrays/Began explorng integer array by writing methods to populate, write, and search arrays
time spent:
2

Disco:
Basic ideas with integer arrays such as
	array.length
	array[index]
	for loops to make new arrays
	how new is used to allocate memory and hance how to initialize arrays
QCCS:
Is there a way to write LinSearchR without referencing freq?
Can you refer back to an earlier array in a recursive function

*/


public class Loopier
{
	public static void populateArray(int[] x) {
		for (int i = 0; i < x.length; i ++)
 		{
			int e =(int)(Math.random()* 100);
			x[i] = e;
		}
	}

	public static String arrayToString(int[] x)
	{
		String t = "{";
		for (int i = 0; i < x.length;i ++)
		{
			t += x[i];
			if (i-x.length != -1)
			{
				t += ", ";
			}
		}
		t+="}";
		return t;
	}

	public static int linSearch(int[] a,int target)
	{
		for (int i = 0;i < a.length;i++)
		{
			if (a[i]==target)
			{
				return i;
			}
		}
		return -1;
	}

	public static int linSearchR(int[] a, int target)
	{
        	if (freqRec(a,target)==0)
		{
            		return -1;
        	}
		else
		{
            		if (a[0] == target)
			{
                		return 0;
            		}
			else
			{
                		int[] copy = new int[a.length - 1];
                		for (int i = 1; i < a.length; i++)
				{
                    			copy[i - 1] = a[i];
            			}
                		return 1 + linSearchR(copy, target);
			}
        	}
    	}

	public static int freq(int[] a, int target)
	{
		int counter = 0;
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] == target)
			{
				counter++;
			}
		}
		return counter;
	}

	public static int freqRec(int[] a, int target) {
		if (a.length == 0)
		{
			return 0;
		}
		int[] newArray = new int[a.length-1];
		for (int i = 0; i < newArray.length;i++)
		{
			newArray[i]=a[i+1];
		}
		if (a[0] == target)
		{
			return 1 + freqRec(newArray,target);
		}
		else
		{
			return 0+freqRec(newArray,target);
		}
	}

	public static void main(String[] args) {
		int[] r = new int[150];
		populateArray(r);
		int random = (int)(Math.random() * 100);
		System.out.println(random);
		System.out.println(arrayToString(r));
		System.out.println(linSearch(r,random));
		System.out.println(linSearchR(r,random));
		System.out.println(freq(r,random));
		System.out.println(freqRec(r,random));
	}
}
