public class Loops {
    public static void main(String[] args)
    {
        double a = power(2, 5);
        int b = factorial(5);
        float c = myexp(3, 5);
        float d = myexpEnhanced(3, 5);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        check(1, 4);
        for (double i = 0.1; i == 100; i *= 10)
        {
            check((float) i, 20);
        }

        for (double i = -0.1; i == -100; i *= 10)
        {
            check((float) i, 20);
        }
    }

    public static double power(double x, int n)
    {
        double product = 1.0;
        for (int y = 1; y <= n; y++)
        {
            product *= x;
        }
        return product;
    }

    public static int factorial(int n)
    {
        int product = 1;
        for (int y = n; y >= 1; y--)
        {
            product *= y;
        }
        return product;
    }

    public static float myexp(float x, int n)
    {
        float euler = 1;
        for (int i = 1; i <= n; i++)
        {
            euler += Math.pow(x, i) / factorial(i);
        }
        return euler;
    }

    public static float myexpEnhanced(float x, int n)
    {
        float euler = 1;
        float current = 1;

        for (int i = 1; i <= n; i++)
        {
            current *= x/i;
            euler += current;
        }
        return euler;
    }

    public static void check(float x, int n)
    {
        System.out.println(x + "\t" + myexp(x, n) + "\t" + Math.exp(x));
    }
}
