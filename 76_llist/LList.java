// Ruawatrain - Mosiah Joltz, David Deng, Benjamin Belotser
// APCS pd6
// HW7 76-- We Got a Little Ol' Convoy
// 2022-03-14
// time spent: 1
// 1 KtS

/***
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 **/

/*
DISCO
 - We all live close to eachother!
 - Our Stuy bucket lists are pretty similar
 - Just a better understanding of Objects being equal to eachother
 - null is not "dotable", you can't call a method from it

QCC
 - Is there a way to avoid checking for null at every turn?
*/

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    // YOUR CODE HERE
    _head = null;
    _size = 0;
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    // YOUR CODE HERE
    LLNode temp = _head;  // Weird weird weird object memory, I sort of understand?? - JM

    if ( _size == 0 )
    {
      _head = new LLNode( newVal, null);
    }
    else
    {
      while ( temp.getNext() != null)
      {
        temp = temp.getNext();
      }

      temp = temp.setNext( new LLNode( newVal, null ) );
    }

    _size++;
    return true;
  }


  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    // YOUR CODE HERE
    LLNode temp = _head;
    int iter = 0;

    if ( _size == 0 )
    {
      return null;
    }
    else
    {
      while ( iter < index )
      {
        temp = temp.getNext();
        iter++;
      }
    }
    return temp.getCargo();
  }


  public String set( int index, String newVal )
  {

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    // YOUR CODE HERE
    LLNode temp = _head;
    int iter = 0;
    String oldVal;

    if ( _size == 0 )
    {
      _head = new LLNode( newVal, null);
      return null;
    }
    else
    {
      while ( iter < index )
      {
        temp = temp.getNext();
        iter++;
      }
      oldVal = temp.getCargo();
      temp.setCargo( newVal );
      return oldVal;
    }
  }


  //return number of nodes in list
  public int size()
  {
    // YOUR CODE HERE
    return _size;
  }

  //--------------^  List interface methods  ^--------------



  // override inherited toString
  public String toString()
  {
    // YOUR CODE HERE
    return "" + _head;
  }


  //main method for testing
  public static void main( String[] args )
  {
    LList james = new LList();

    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("beat");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("a");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("need");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("I");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    System.out.println( "2nd item is: " + james.get(1) );

    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );

    System.out.println( james );
            /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }

}//end class LList
