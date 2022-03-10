// Ruawatrain - Mosiah Joltz, David Deng, Benjamin Belotser
// APCS pd6
// HW71 -- Reading for intent, tracing for VICTORY
// 2022-03-07
// time spent: 1.4 hrs

// WITCHCRAFT
/***
 * class partition (née Mysterion)
 *
 * <h1>MYSTERION is partitionator</h1>
 * The Mysterion method ... partitionatorator
 * <p>
 * <b>Note:</b> Named in honor of Dr. Doof.
 * @author  Ben Belotser, David Deng, Josiah Moltz
 * @version 1
 * @since   2022-03-09
 * <br>
 * algo as pseudocode:  <br>
 * ------------------------------ <br>
 * &emsp;     v = arr[c] <br>
 * &emsp;     swap arr[c], arr[b]  <br>
 * &emsp;     s = a  <br>
 * &emsp;     for i in [a..b-1]  <br>
 * &emsp; &emsp;         if arr[i] &lt; v  <br>
 * &emsp; &emsp; &emsp;             swap arr[s], arr[i]  <br>
 * &emsp; &emsp; &emsp;             s+=1 <br>
 * &emsp;     swap arr[b], arr[s]  <br>
 **/


public class Partition
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

  // WITCHCRAFT
  /**
   * int partitionator(int[],int,int,int)
   * DESCRIP
   * partitionator will return an array where
     all elements before arr[pvtPos] are less than arr[pvtPos],
     and all elements after arr[pvtPos] are greater than arr[pvtPos].
   * @param arr input array of ints
   * @param loPos the minimum index of the array we touch
   * @param hiPos the maximum index of the array we touch
   * @param pvtPos the index of the chosen pivot
   * @return int position of the pivot in the final array
   *
   */
  public static int partitionator( int arr[], int loPos, int hiPos, int pvtPos)
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
    int v = arr[pvtPos];

    swap( pvtPos, hiPos, arr);
    int s = loPos;

    for( int i = loPos; i < hiPos; i++ ) {
      if ( arr[i] <= v) {
        swap( i, s, arr );
        s++;}
    }
    swap(s,hiPos,arr);

    return s;
  }//end partitionator


  //main method for testing
  public static void main( String[] args )
  {

    //init test arrays of magic numbers
    int[] arr1 = {8,21,17,69,343};
    int[] arr3 = {1,28,33,4982,37};
    int[] arr4 = {5,4,17,9000,6};
    int[] arr5 = {3,0,16,599,1024};


    // run partitionator on each array,
    // holding loPos & hiPos fixed, varying pvtPos...
    for( int testPIVOT = 0; testPIVOT < 5; testPIVOT++ ) {
      System.out.println("arr1: ");
      printArr(arr1);
      partitionator(arr1,0,4,testPIVOT);
      System.out.println("after partitionator w/ loPos=0, hiPos=4, pvtPos="
                         + testPIVOT +"...");
      printArr(arr1);
      System.out.println("-----------------------");

      System.out.println("arr3:");
      printArr(arr3);
      partitionator(arr3,0,4,testPIVOT);
      System.out.println("after partitionator w/ loPos=0, hiPos=4, pvtPos="
                         + testPIVOT +"...");
      printArr(arr3);
      System.out.println("-----------------------");

      System.out.println("arr4:");
      printArr(arr4);
      partitionator(arr4,0,4,testPIVOT);
      System.out.println("after partitionator w/ loPos=0, hiPos=4, pvtPos="
                         + testPIVOT +"...");
      printArr(arr4);
      System.out.println("-----------------------");

      System.out.println("arr5:");
      printArr(arr5);
      partitionator(arr5,0,4,testPIVOT);
      System.out.println("after partitionator w/ loPos=0, hiPos=4, pvtPos="
                         + testPIVOT +"...");
      printArr(arr5);
      System.out.println("-----------------------");
      /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }
  }//end main

}//end class partitionator
