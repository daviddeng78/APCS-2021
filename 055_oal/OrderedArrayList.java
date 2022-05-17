// GreyLeche: Faiyaz Rafee, May Qiu, David Deng
// APCS pd7
// 2022-01-11
// Time Spent: 0.5 hrs

// DISCO: 
//
//
// QCC:
//
//
public class OrderedArrayList{
  private int[] _data;  //underlying ("encapsulated") container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public OrderedArrayList()
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


  //Best-Case: Same as worst case.
  //Worst-Case: Point is moot because it doesn't matter what index is specified, it will always find the element in the same time. Time is O(1).
  public int get( int index )
  {
    return _data[index];
  }
  
  //Best Case: Point is moot because it doesn't matter what index is specified, it will always find the element in the same time
  //Worst-Case: Same as best case.
  //Time is O(1)
  public int set( int index, int newVal )
  {
    int temp = _data[index];
    _data[index] = newVal;
    return temp;
  }


  //Best Case: O(1) since it just adds the element at index 'size'.
  //Worst Case: O(n) since if the underlying container is not large enough to hold all the elements, it will need to expand the array, which requires copying all previous elements into this new one.
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


  //Best Case: O(n) since it requires a shift of all elements to the right.
  //Worst Case: O(n) since it requires a copy of all elements from existing to new array.
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


  //Best Case: Moot point.
  //Worst Case: O(n) since it requires a shift of all elements right of the removed element to the left.
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

  //Best-Case: Same as worst case.
  //Worst-Case: O(1) since it just returns the internal variable '_size'.
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
}
