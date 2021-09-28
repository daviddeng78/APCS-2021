public class Methods
{
    /**
     * Input variable values for certain method. Delete methods you don't need.
     * @param args
     */
    public static void main(String[] args) 
    {
        //int x isDivisible(n, m); 
        //int y = isTriangle(a, b, c);
        //int z = ack(m, n);
        //System.out.println(x);
        //System.out.println(y);
        //System.out.println(z);
    }

    public static boolean isDivisible(int n, int m)
    {
        return (n % m == 0);
    }

    public static boolean isTriangle(int a, int b, int c)
    {
        return (a + b > c && a + c > b && b + c > a); 
    }
    
    public static int ack(int m, int n)
    {
        if (m < 0 || n < 0)
        {
            System.out.println("Both integers must be positive");
        }
        else if (m > 0)
        {
            if (n > 0)
            {
                ack(m - 1, ack(m, n - 1));
            }

            else if (n == 0)
            {
                ack(m - 1, 1);
            }
        }
        return n + 1;
    }
}