// Blue Steaks - Max Schneider, Faiyaz Rafee, David Deng
// APCS1 pd7
// HW45 -- Array of Titanium / Expanding SuperArray functionality, interfaces
// 2021-12-09

/***************************
 * class SuperArray version 2.0
 * (SKELETON)
 * Wrapper class for array. Facilitates
 * resizing
 * expansion
 * read/write capability on elements
 * adding an element to end of array
 * adding an element at specified index
 * removing an element at specified index
 Disco:
 *Documentation helps debugging code
 QCCs:
 *What practical applications does an interface have?
 ***************************/

public class SuperArray implements ListInt
{

  private int[] _data;  //underlying ("encapsulated") container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    _data = new int[10];
    _size = 0;
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String foo = "[";
    for( int i = 0; i < _size; i++ ) {
      foo += _data[i] + ",";
    }
    if ( foo.length() > 1 )
      //shave off trailing comma
      foo = foo.substring( 0, foo.length()-1 );
    foo += "]";
    return foo;
  }


  //double capacity of SuperArray
  private void expand()
  {
    int[] temp = new int[ _data.length * 2 ];
    for( int i = 0; i < _data.length; i++ )
      temp[i] = _data[i];
    _data = temp;
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
    return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    int temp = _data[index];
    _data[index] = newVal;
    return temp;
  }


  //adds an item after the last item
  public boolean add( int newVal )
  {
    //checks if current array is large enough
    if (this._size == this._data.length) {
      expand();
    }
    //appends new value to end of subarray of meaningful values
    this._data[this._size]=newVal;
    //increments length of meaningful values
    this._size++;
    return true;
  }


  //inserts an item at index
  public boolean add( int index, int newVal )
  {
    //checks if current array is large enough
    if (this._size >= this._data.length) {
      expand();
    }
    //shifts all values right of index where insertion will happen to the right by 1
    for(int i = this._size; i>index;i--) {
      this._data[i]=this._data[i-1];
    }
    //inserts newVal at allocated index
    this._data[index]=newVal;
    //increments length of meaningful values
    this._size++;
    return true;
  }


  //removes the item at index
  //shifts elements left to fill in newly-empted slot
  public void remove( int index )
  {
    //shifts all values right of index where value will be removed to the left by 1
    for(int i = index; i<this._size-1;i++) {
      this._data[i]=this._data[i+1];
    }
    //sets far right value of previous subarray of meaningful values to 0
    this._data[this._size-1]=0;
    //decrements length of meaningful values
    this._size--;
  }


  //return number of meaningful items in _data
  public int size()
  {
    //sets meaningful items to length of array
    int answer = this._data.length;
    //iterates from the back 
    for (int i = this._data.length-1; this._data[i] == 0; i--) {
      //decrements number of meaningful values
      answer--;
      //accounts for case when there are no meaningful values
      if (i == 0) {
        return answer;
      }
    }
    //returns number of meaningful values should the iteration encounter one
    return answer;
  }



  //main method for testing
  public static void main( String[] args )
  {
      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );

      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }

      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);

      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      System.out.println("new length of underlying array: "
      + curtis._data.length );
      }

      SuperArray mayfield = new SuperArray();
      System.out.println("Printing empty SuperArray mayfield...");
      System.out.println(mayfield);

      mayfield.add(5);
      mayfield.add(4);
      mayfield.add(3);
      mayfield.add(2);
      mayfield.add(1);

      System.out.println("Printing populated SuperArray mayfield...");
      System.out.println(mayfield);

      mayfield.remove(3);
      System.out.println("Printing SuperArray mayfield post-remove...");
      System.out.println(mayfield);
      mayfield.remove(3);
      System.out.println("Printing SuperArray mayfield post-remove...");
      System.out.println(mayfield);

      mayfield.add(3,99);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield);
      mayfield.add(2,88);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield);
      mayfield.add(1,77);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield);
      /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class
