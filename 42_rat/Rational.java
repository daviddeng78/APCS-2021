/**
 * Blue Steaks - Max Schneider, Faiyaz Rafee, David Deng
 * APCS
 * HW41 -- Be Rational
 * 2021-11-30
 * time spent: 0
 * 
 * DISCO:
  Something in our plan was bad, but we got lucky and it didn't translate to the code
  Keep-Change-Flip remains top-tier
 * QCC:
  Is "this" important?
 */

public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    public Rational(int a, int b) {
        numerator = a;
        denominator = b;
    }

    public String toString() {
        return ("(" + numerator + ", " + denominator + ")");
    }

    public float floatValue() {
        return (float) numerator / denominator;
    }

    public void multiply(Rational r) {
        this.numerator *= r.numerator;
        this.denominator *= r.denominator;
    }

    public void divide(Rational r) {
        this.numerator *= r.denominator;
        this.denominator *= r.numerator;
    }

    public void add(Rational r) {
        this.numerator = (this.numerator * r.denominator) + (r.numerator * this.denominator);
        this.denominator *= r.denominator;
    }

    public void subtract(Rational r) {
        this.numerator = (this.numerator * r.denominator) - (r.numerator * this.denominator);
        this.denominator *= r.denominator;
    }

    public int gcd() {
        int n = this.numerator;
        int d = this.denominator;

        while (n != d) {
            if (n > d) {
                n -= d;
            }
            else {
                d -= n;
            }
        }
        return d;
    }

    public void reduce() {
        int gcd = this.gcd();
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    public int compareTo(Rational r) {
        Rational dummy = new Rational(this.numerator, this.denominator);
        dummy.subtract(r);
        return dummy.numerator;
    }
    public static void main(String[] args) {
        Rational r1 = new Rational(1,2);
        Rational r2 = new Rational(3,2);

        r1.add(r2);
        System.out.println("1/2 + 3/2 = 8/4: " + r1);

        System.out.println("GCD of 8 and 4 = 4: "+ r1.gcd());

        r1.reduce();
        System.out.println("8/4 = 2/1: "+ r1);

        r1.subtract(r2);
        System.out.println("2/1 - 3/2 = 1/2: " + r1);

        Rational r3 = new Rational(1,4);
        Rational r4 = new Rational(2,4);
        Rational r5 = new Rational(3,4);

        System.out.println("1/2 > 1/4 yields 2: " + r1.compareTo(r3));
        System.out.println("1/2 = 2/4 yields 0: " + r1.compareTo(r4));
        System.out.println("1/2 < 3/4 yields -2: " + r1.compareTo(r5));
    }
}