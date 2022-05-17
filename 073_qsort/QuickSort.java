// Ruawatrain - Mosiah Joltz, David Deng, Benjamin Belotser
//APCS pd6
//HW72 -- QuickSort
//2022-03-09
//time spent: 1.4 h

// WITCHCRAFT
/***
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 * <br>
 * 1. Summary of QuickSort algorithm: <br>
 * QSort(arr): <br>
 * If an array is already sorted (length 1 or 0), do nothing.
 * Take a random pivot point. Pivot around that point, splitting the array into two arrays, one left of the pivot point, the other right of the pivot point. <br>
 * Repeat the algorithm on each of the shorter arrays. <br>
 * 2a. Worst pivot choice and associated run time:<br>
 * Every single pivot is an extreme (min/max of the array). O( n^2 ) <br>
 * 2b. Best pivot choice and associated run time:<br>
 * Every single pivot is the median of the array. O( n*log n ). <br>
 * 3. Approach to handling duplicate values in array:<br>
 * It worked without us having to handle them separately.
 **/

// NOTE NOTE NOTE
// IT WOULD BE HARD TO INCLUDE TEST CASES DEMONSTRATING 2, SINCE WE CHOOSE RANDOM PIVOTS.

public class QuickSort
{
  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o )
  {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array
  public static void printArr( int[] a )
  {
    for ( int o : a )
      System.out.print( o + " " );
    System.out.println();
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

  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal )
  {
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
      retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }
  //--------------^  HELPER METHODS  ^--------------


  public static int partitionator( int arr[], int loPos, int hiPos/*, int pvtPos*/)
  {
    /* AVERAGE estimation of MEDIAN (ew) - O(n) to find ~median
    we will select pvtPos here as follows
    It would be really nice to select the median as our pivot
    To get a rough estimate of the median, we will instead take the value
    closest to the average (??)
    To find the average, loop through array once to get sum (and thereby average).
    After finding the average, loop through the array again, to find the value closest to average.
    */

    /* RANDOM pvt - O(1) to find random pvt.
    select a random element, dats it.
    */
    int pvtPos = (int) ( (hiPos - loPos + 1) * Math.random() ) + loPos; // +1 ensures we can pick hiPos

    int v = arr[pvtPos];

    swap( pvtPos, hiPos, arr);
    int s = loPos;

    for( int i = loPos; i < hiPos; i++ ) {
      if ( arr[i] <= v) {
        swap( i, s, arr );
        s++;}
    }
    swap(s,hiPos,arr);

    //System.out.println("pvtPos " + pvtPos);
    //printArr( arr );
    return s;
  }//end partition

  /**
   * void qsort(int[])
   * @param d -- array of ints to be sorted in place
   */
  public static void qsort( int[] d )
  {
    qsortH( d, 0, d.length-1 );
  }

  public static void qsortH( int[] d, int loPos, int hiPos )
  {
    if ( hiPos <= loPos ) {
      return;
    }
    int split = partitionator( d, loPos, hiPos );
    qsortH( d, loPos, split - 1 );
    qsortH( d, split + 1, hiPos );
  }
  //you may need a helper method...





  //main method for testing
  public static void main( String[] args )
  {

    //get-it-up-and-running, static test case:
    int [] arr1 = {7,1,5,12,3};
    System.out.println("\narr1 init'd to: " );
    printArr(arr1);

    qsort( arr1 );
    System.out.println("arr1 after qsort: " );
    printArr(arr1);

    // randomly-generated arrays of n distinct vals
    int[] arrN = new int[10];
    for( int i = 0; i < arrN.length; i++ )
    arrN[i] = i;

    System.out.println("\narrN init'd to: " );
    printArr(arrN);

    shuffle(arrN);
    System.out.println("arrN post-shuffle: " );
    printArr(arrN);

    qsort( arrN );
    System.out.println("arrN after sort: " );
    printArr(arrN);

    //get-it-up-and-running, static test case w/ dupes:
    int [] arr2 = {7,1,5,12,3,7};
    System.out.println("\narr2 init'd to: " );
    printArr(arr2);

    qsort( arr2 );
    System.out.println("arr2 after qsort: " );
    printArr(arr2);


    // arrays of randomly generated ints
    int[] arrMatey = new int[20];
    for( int i = 0; i < arrMatey.length; i++ )
    arrMatey[i] = (int)( 48 * Math.random() );

    System.out.println("\narrMatey init'd to: " );
    printArr(arrMatey);

    shuffle(arrMatey);
    System.out.println("arrMatey post-shuffle: " );
    printArr(arrMatey);

    qsort( arrMatey );
    System.out.println("arrMatey after sort: " );
    printArr(arrMatey);

  }//end main

}//end class QuickSort
