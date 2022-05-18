/*
   Quad Puffs -- David Deng / Yat long Chan / Samantha Hua / Lindsay Phung
   APCS
   HW21 -- STAtisTically Speaking...
   2021-10-20

   DISCO
   - Java automatically floor divides when dividing two ints. i.e. 3/2 -> 1
   QCC
   - We didn't see a way to calculate geoMean() without using the class Math. 
   - We also didn't know how to convert the roots needed in geoMean() into ints without typecasting.
   - How would you convert the sqrt into an int?
 */

public class Stats {

  public static int mean(int a, int b) {
    return (a+b)/2; 
  }

  public static double mean(double a, double b) {
    return (a+b)/2;
  }

  public static int max(int a, int b) {
    if (a > b) {
      return a;
    } 
    else if (a < b) {
      return b;
    } 
    else {
      System.out.println("The two values are equal");
      return 0;
    }
  }

  public static double max(double a, double b) {
    if (a > b) {
      return a;
    } 
    else if (a < b) {
      return b;
    } 
    else {
      System.out.println("The two values are equal");
      return 0; 
    }
  }

  public static int geoMean(int a, int b) {
    double product = a * b;
    return (int) Math.sqrt(product); 
  }

  public static double geoMean(double a, double b) {
    return Math.sqrt(a * b);
  }

  public static int max(int a, int b, int c) {
    if (a == b && a == c) {
      System.out.println("All values are equal to each other");
      return 0;
    }

    else if (a > b) {
      if (a > c) {
        return a;
      }
      else if (a == c) {
        System.out.println("'a' and 'c' are equally as large");
        return 0;
      }
      else {
        return c;
      }
    }

    else if (b > c) {
        if (a == b) {
          System.out.println("'a' and 'b' are equally as large");
          return 0;
        }
        else {
          return b;
      }
    }
    else if (b == c) {
        System.out.println("'b' and 'c' are equally as large");
        return 0;
      }
      
    else {
        return c;
    }
  }
  

  public static double max(double a, double b, double c) {
    if (a == b && a == c) {
      System.out.println("All values are equal to each other");
      return 0;
    }

    else if (a > b) {
      if (a > c) {
        return a;
      }
      else if (a == c) {
        System.out.println("'a' and 'c' are equally as large");
        return 0;
      }
      else {
        return c;
      }
    }

    else if (b > c) {
        if (a == b) {
          System.out.println("'a' and 'b' are equally as large");
          return 0;
        }
        else {
          return b;
      }
    }
    else if (b == c) {
        System.out.println("'b' and 'c' are equally as large");
        return 0;
      }
      
    else {
        return c;
    }
  }

  public static int geoMean(int a, int b, int c) {
    int product = a * b * c;
    return (int) Math.pow(product, 1.0/3.0);

  }

  public static double geoMean(double a, double b, double c) {
    double product = a * b * c;
    return Math.pow(product, 1.0/3.0);

  }
}
