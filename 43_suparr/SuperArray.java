//Blue Steaks: Max Schneider, Faiyaz Rafee, David Deng
//APCS
//HW43 -- Encapsulation (Basic SuperArray functionality)
//2021-12-06

/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 Disco:
 * importance of this
 * it is helpful to have the size instance variable
 * Size needs to be reset every time the length is changed
 QCC:
 *Possible Limitations
 *Does this work for Strings?
    *Can we have this work for arrays of multiple types?
 * Waht is the potential of For loop
 ***************************/

public class SuperArray {

    private int[] _data; //underlying container
    private int _size; //number of elements in this SuperArray

    //default constructor - intializes 10-item array
    public SuperArray() 
    {
        this._data = new int[10];
        this._size = this._data.length;
    }

    public String toString()
    {
        String outVal = "[";
        for (int i = 0; i < this._size; i++) {
            if (i == this._size - 1) {
                outVal += this._data[i];
            }
            else {
                outVal += this._data[i] + ", ";
            }
        }
        return outVal + "]";
    }

    //double capacity of SuperArray
    private void expand()
    {
        int[] newArray = new int[this._size * 2];
        for (int i = 0; i < this._size; i++) {
            newArray[i] = this._data[i];
          }
          this._data = newArray;
          this._size *= 2;
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
        int answer = get(index);
        _data[index] = newVal;
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
      for( int b = 0; b < curtis._size; b++ ) {
      curtis.set( b, (int)(Math.random()*100) );
      }
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      }

  }//end main()
}//end class