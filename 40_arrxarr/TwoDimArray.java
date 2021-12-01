// Blue Steaks - Max Schneider, Faiyaz Rafee, David Deng
// APCS pd7
// HW40 -- 2D arrays
// 2021-11-30
/**
Disco:
  For each loops are very efficient for getting through 2D arrays. Only problem is the fact that you have to use a counter in order to determine the correct time to end a list.
  Writing a print method (or overwriting toString) is essential to writing this code because you need to be able present it.
  Arrays that are not assigned values default to zero
QCC:
  None
time spent: .1
**/

public class TwoDimArray
{
  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOR loop
  public static void print1( int[][] a )
  {
    for (int i = 0; i < a.length; i++) {
      for (int w = 0; w < a[i].length;w++) {
        if (w == a[i].length -1) {
          System.out.println(a[i][w]);
        } else {
          System.out.print(a[i][w]);
          System.out.print(", ");
        }
      }
    }
  }


  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOREACH loop
  public static void print2( int[][] a )
  {
    for(int[] r:a) {
      int i = 0;
      for (int p:r) {
        i++;
        if (i == r.length) {
          System.out.println(p);
        } else {
          System.out.print(p + ", ");
        }
      }
    }
  }


  //postcond: returns sum of all items in 2D int array a
  public static int sum1( int[][] a )
  {
    int counter = 0;
    for(int[] r:a) {
      for (int p:r) {
        counter+=p;
      }
    }
    return counter;
  }


  //postcond: returns sum of all items in 2D int array a
  //          * uses helper fxn sumRow
  public static int sum2( int [][] m )
  {
    int counter = 0;
    for (int i = 0; i < m.length; i++) {
      counter += sumRow(i,m);

    }
    return counter;
  }

  public static int sum3( int [][] m )
  {
    int counter = 0;
    for (int i = 0; i < m.length; i++) {
      counter += sumRow2(i, m);
    }
    return counter;
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOR loop
  public static int sumRow( int r, int[][] a )
  {
    int counter = 0;
    for (int i = 0;i < a[r].length;i++) {
      counter +=a[r][i];
    }
    return counter;
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOREACH loop
  public static int sumRow2(int r, int[][] m)
  {
    // *** YOUR IMPLEMENTATION HERE ***
    int summer = 0;
    for (int b : m[r]) {
      summer += b;
    }
    return summer;
  }


  public static void main( String [] args )
  {

      int [][] m1 = new int[4][2];
      int [][] m2 = { {2,4,6}, {3,5,7} };
      int [][] m3 = { {2}, {4,6}, {1,3,5} };
      print1(m1);
      print1(m2);
      print1(m3);

      print2(m1);
      print2(m2);
      print2(m3);

      System.out.print("testing sum1...\n");
      System.out.println("sum m1 : " + sum1(m1));
      System.out.println("sum m2 : " + sum1(m2));
      System.out.println("sum m3 : " + sum1(m3));
      System.out.print("testing sum2...\n");
      System.out.println("sum m1 : " + sum2(m1));
      System.out.println("sum m2 : " + sum2(m2));
      System.out.println("sum m3 : " + sum2(m3));

      System.out.print("testing sum3...\n");
      System.out.println("sum m1 : " + sum3(m1));
      System.out.println("sum m2 : " + sum3(m2));
      System.out.println("sum m3 : " + sum3(m3));

    // your own custom test cases welcomed and encouraged
  }

}//end class TwoDimArray