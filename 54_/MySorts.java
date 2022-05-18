public class MySorts {
  //bubbleSort traverses the array n - 1 times to the n - pass element every pass. 
  //Compares element to element after it and swaps if former is larger than latter
  public static void bubbleSortV( ArrayList<Comparable> data ) {
    for(int x = 0; x < data.size()-1; x ++) {
      int y = data.size();
      while (y > (x+1)) {
        if (data.get(y-1).compareTo(data.get(y-2)) < 0) {
          Comparable dummy = data.get(y-1);
          data.set(y-1, data.get(y-2));
          data.set(y-2, dummy);
        }
        y--;
      }
    }
  }

  //selectionSort traverses the array n - 1 times starting from the n - pass element every pass.
  //Finds index of maximum value
  //Swaps with index i on the ith pass.
  public static void selectionSortV( ArrayList<Comparable> data ) {
    int maxPos;

    for(int pass = data.size() - 1; pass > 0; pass--) {
      maxPos = pass;

      for(int i = 1; i < pass; i++) {
        if (data.get(i).compareTo(data.get(maxPos)) > 0) {
          maxPos = i;
        }
      }
      Comparable dummy = data.get(pass);
      data.set(pass, data.get(maxPos));
      data.set(maxPos, dummy);
    }
  }

  //Starts with sorted section of length 1 from the left and introduces first element of unsorted section. 
  //If unsorted element is smaller than the element preceding it, swap with it.
  //If greater, sorted section + 1. Move next unsorted element in.
  public static void insertionSortV( ArrayList<Comparable> data )
  {   
    for(int partition = 1; partition < data.size(); partition++) {

      for(int i = partition; i > 0; i--) {
        if (data.get(i).compareTo(data.get(i - 1)) < 0) {
          System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); 
          Comparable dummy = data.get(i); 
          data.set(i, data.get(i - 1));
          data.set(i - 1, dummy); 
        }
        else {
          break;
        }
      }
    }
  }
}
