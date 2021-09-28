import java.util.Scanner;

public class CtoF 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("what is the temperature in Celsius?");
        double c = s.nextDouble();
        double f = (c * 9 / 5.0 + 32);
        System.out.println(c + " C = " + f + " F");
        s.close();
    }
}
