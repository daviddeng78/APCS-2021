// Ruawatrawain - Mosiah Joltz, David Deng, Benjamin Belotser
// APCS pd6
// HW72 -- So So Fast
// 2022-03-08
// time spent: 1 hrs

/*
ALGO
thoughts
========
we really really want to just mergesort it, since this would be in n*log n time

current algo
============
Guess that the first element in arr is our pivot.
Once we perform partitionator using the first element as the pivot
determine whether that pivot was actually the index we wanted (if the resulting index equals y-1),
whether it was too big (if the resulting index is greater than y-1),
or too small (if the resulting index is less than y-1).
If it was the index we wanted, return the value of the pivot.
If it was too big, shorten arr to include only values less than the value of the pivot.
If it was too small, shorten arr to include only values greater than the value of the pivot.
Repeat the algorithm on the shortened arr.

desired algo
============
If we can some how determine the median effeciently (at most n time)
We can partition on the median, and then take either the median as the value we want
or repeat the process on the upper or lower sections of the array (relative to the median), until we get a value.
This will be O( n*log n ) time, since in the worst case each move we split arr into an array of half its length.
This process must terminate after ~ log n moves, and since each move calls partitionator, our result is n*log n

median algo thoughts
====================
Medians are nice bc they split the data into two sets of equal size, one above the median and one below.
I wonder if we can recursively do something to decide in which direction the median of a list will move when a new element is added.
The issue is we then have to have the "next best medians" on hand to choose when the median does move.

BESTCASE
O( n )
The yth smallest element is at index 0 (!!).
In this case, our first selection for a pivot will result in us having the correct value.
The only code we needed to run to get to this point was partitionator (O( n )) and a couple if statements (O( 1 ))
Thus in total we had O( n ) time.

WORSTCASE
O( n^2 )
The yth smallest element as at the end of the list :(
In this case, since we test the first element as a pivot in each iteration, it will take us a full n checks until we use the yth smallest element as a pivot
Each time we pick a pivot, we have to run partitionator on that pivot, contributing O( n ).
Thus, we get O( n*n ) = O( n^2 )

DISCO
 - This is kinda similar to binary sort, in the way that you take the regions above or below the current value.

QCC
 - Nice algorithm (that we have rn)!
 - HOW DO YOU GET O( log n ) or O( n*log n ) ??
 - How do you find the median efficiently? (at most O(n) time)
*/

public class FastSelect {
    //--------------v  HELPER METHODS  v--------------
    //swap values at indices x, y in array o
    public static void swap( int x, int y, int[] o )
    {
      int tmp = o[x];
      o[x] = o[y];
      o[y] = tmp;
    }
  
    //shuffle elements of input array
    public static void shuffle( int[] d )
    {
      int tmp;
      int swapPos;
      for( int i = 0; i < d.length; i++ ) {
        tmp = d[i];
        swapPos = i + (int)( (d.length - i) * Math.random() );
        swap( i, swapPos, d );
      }
    }
    //--------------^  HELPER METHODS  ^--------------
  
    public static int partitionator( int arr[], int start, int end, int pvtPos )
    {
      int v = arr[pvtPos];
  
      swap( pvtPos, end, arr);
      int s = start;
  
      for( int i = start; i < end; i++ ) {
        if ( arr[i] <= v) {
          swap( i, s, arr );
          s++;}
      }
      swap(s,end,arr);
  
      return s;
    }//end mysterion
  
    public static int FastSelect( int arr[], int y ) {
      return FastSelectH(arr, 0, arr.length-1, y-1);
    }
  
    public static int FastSelectH( int arr[], int start, int end, int y ) { // helper for FastSelect
      int pvt = partitionator( arr, start, end, start );
      if ( y < pvt ) {
        return FastSelectH( arr, start, pvt-1, y);
      }
      else if (y > pvt ) {
        return FastSelectH( arr, pvt+1, end, y);
      }
      else {
        return arr[pvt];
      }
    }
  
    public static void tester( int arr[] ) {
      for (int y = 1; y <= arr.length; y++) {
        System.out.println( FastSelect( arr, y ) );
        shuffle( arr );
      }
    }
  
    public static void main(String[] args) {
      int[] arr1 = {8,21,17,69,343};  // {8,17,21,69,343}
      int[] arr3 = {1,28,33,4982,37}; // {1,28,33,37,4982}
      int[] arr4 = {5,4,17,9000,6}; // {4,5,6,17,9000}
      int[] arr5 = {3,0,16,599,1024}; // {0,3,16,599,1024}
  
      System.out.println("\nTesting arr1!");
      tester(arr1);
  
      System.out.println("\nTesting arr3!");
      tester(arr3);
  
      System.out.println("\nTesting arr4!");
      tester(arr4);
  
      System.out.println("\nTesting arr5!");
      tester(arr5);
    }
  
}