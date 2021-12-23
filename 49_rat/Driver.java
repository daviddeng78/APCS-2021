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

public class Driver{
    public static void main(String[] args) {
      Rational test0 = new Rational(2, 3);
      Rational test1 = new Rational(2, 3);
      Rational test2 = new Rational(4, 6);
      String r = "hewbgaugrew";
  
      System.out.println(test0.compareTo(test1));
      System.out.println(test0.compareTo(test2));
      /** 
      System.out.println(test0.compareTo(r)); //should return error
      */

      System.out.println(test0.equals(test1));
      System.out.println(test0.equals(test2));
      System.out.println(test0.equals(r)); //should return error
      
    }
  }