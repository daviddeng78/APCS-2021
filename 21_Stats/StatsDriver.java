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

public class StatsDriver{
  public static void main(String[] args){
    Stats work = new Stats();
    System.out.println("mean with 2int: " + work.mean(2, 33)); //should return 17

    System.out.println("mean with 2double: " + work.mean(2.5, 2.7)); //should return 2.6

    System.out.println("max with 2int: " + work.max(50, 51)); //should return 51
    System.out.println("max with 2 same int: " + work.max(50, 50)); //should return 0

    System.out.println("max with 2double: " + work.max(1.6, 1.9)); //should return 1.9

    System.out.println("geometric mean with 2int: " + work.geoMean(4, 9)); //should return 6
    System.out.println("geometric mean with 2double: " + work.geoMean(4.0, 9.0)); //should return 6.0

    System.out.println("max with 3 same int: " + work.max(45, 45, 45)); //should return 0 'All values are equal to each other'
    System.out.println("max with 3int, a and c same: " + work.max(45, 31, 45)); //should return 0 'a' and 'c' are equally as large
    System.out.println("max with 3int, b and c same " + work.max(43, 45, 45)); //should return 0 'b' and 'c' are equally as large
    System.out.println("max with 3int: " + work.max(45, 31, 28)); //should return 45

    System.out.println("max with 3double: " + work.max(14.8, 44.1, 3.6)); //should return 44.1
    // Should be pretty much the same thing as the int version of max() because they're the same method just with a different returnType and variable datatypes.

    System.out.println("geometric mean with 3int: " + work.geoMean(2, 4, 6)); //should return 3
    System.out.println("geometric mean with 3double: " + work.geoMean(3.5, 3.5, 1)); //should return ~2.3
  }
}
