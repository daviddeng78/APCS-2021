/**
 * Blue Steaks: Max Schneider, Faiyaz Rafee, David Deng
 * APCS
 * HW49 -- Rational Standards Compliance / Implementing interfaces and compareTo() and equals() methods into Rational class
 * 2021-12-22
 * 
 * DISCO:
 * Typecasting classes works as long as it is on the same branch in the polymorphism tree.
 * Throwing an error immediately exits the method.
 * 
 * QCC:
 * More about errors and it's relationship with try/catch
 */

public class Rational implements Comparable{
    private int numerator;
    private int denominator;
  
    public Rational (){
      numerator = 0;
      denominator = 1;
    }
    public Rational (int a, int b) {
      numerator=a;
      denominator=b;
    }
  
    public String toString() {
      return ("(" + numerator + " / " + denominator + ")");
    }
  
    public void add (Rational r) {
      Rational dummy2 = new Rational(r.numerator,r.denominator);
      Rational dummy = new Rational(this.numerator,this.denominator);
      this.numerator*=r.denominator;
      this.denominator*=r.denominator;
      dummy2.numerator*=dummy.denominator;
      dummy2.denominator*=dummy.denominator;
      this.numerator+=dummy2.numerator;
    }
  
  
    public void subtract (Rational r) {
      Rational dummy2 = new Rational(r.numerator,r.denominator);
      Rational dummy = new Rational(this.numerator,this.denominator);
      this.numerator*=r.denominator;
      this.denominator*=r.denominator;
      dummy2.numerator*=dummy.denominator;
      dummy2.denominator*=dummy.denominator;
      this.numerator-=dummy2.numerator;
    }
  
    public int GCD () {
      int a = this.numerator;
      int b = this.denominator;
      int c = 1;
      int answer = 0;
      while (c <= a) {
        if (a%c==0 && b%c==0) {
          answer=c;
          }
        c++;
        }
      return answer;
    }
  
    public void reduce () {
      int divisor = this.GCD();
      this.numerator /= divisor;
      this.denominator /= divisor;
    }
    
    //Compares instance of Rational to ANY object
    public int compareTo (Object r) {
      //if object is not instance of class Rational, throw error
      if (!( r instanceof Rational)) {
        throw new Error();
      }
      //if object is of Rational r, initialize separate instance of Rational with same attributes as this instance for comparing purposes
      Rational dummy = new Rational(this.numerator, this.denominator);
      //subtract dummy from arg instance (typecast to fit arg type of method)
      dummy.subtract((Rational)r);
      return dummy.numerator;
    }
    
    //tells whether two instances of Rational are equal if difference between them is 0 or not
    public boolean equals(Object r) {
      return (compareTo(r) == 0);
    }
  
}