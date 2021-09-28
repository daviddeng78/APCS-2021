import java.util.*;

public class Array 
{
    public static void main(String[] args)
    {
        System.out.println(sieve(21));
    }

    public static String powArray(double[] a)
    {
        double[] squaredValues = new double[a.length];
        for (int i = 0; i < a.length; i++)
        {
            squaredValues[i] = a[i] * a[i]; 
        }
        return Arrays.toString(squaredValues);
    }

    public static String powArrayGeneralized(double[] a, int power)
    {
        double[] powerValues = new double[a.length];
        for (int i = 0; i < a.length; i++)
        {
            powerValues[i] = Math.pow(a[i], power);
        }
        return Arrays.toString(powerValues);
    }

    public static String histogram(int[] a)
    {
        int[] counts = new int[100];
        for (int score: a)
        {
            counts[score]++;
        }
        return Arrays.toString(counts);
    }

    public static String histogramGeneralized(int[] a, int counters)
    {
        int[] counts = new int[counters];
        for (int score: a)
        {
            int section = Math.floorDiv(score, counters);
            counts[section]++;
        }
        return Arrays.toString(counts);
    }

    public static int indexofMax(int[] a)
    {
        int currentMax = a[0];
        int currentMaxIndex = 0;

        for (int i = 1; i < a.length; i++)
        {
            if (a[i] > currentMax)
            {
                currentMax = a[i];
                currentMaxIndex = i;
            }
        }
        return currentMaxIndex;
    }
    //We cannot write this method using an enhanced for loop because we are performing a search, which involve array indices.

    public static String sieve(int n)
    {
        boolean[] primes = new boolean[n];

        //Turns all array values into true
        for (int i = 0; i < primes.length; i++)
        {
            primes[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (primes[i] == true)
            {
                for (int j = i * i; j <= n - 1; j += i)
                {
                    primes[j] = false;
                }
            }
        }
        return Arrays.toString(primes);
    }
}
