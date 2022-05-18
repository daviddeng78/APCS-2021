// Ruawatrain: Benjamin Belotser, David Deng, Josiah Moltz
// APCS pd6
// HW76 -- implement linked list
// 2022-03-15
// time spent:  .8 hrs

/*
DISCO
* We can think of a linked list as *linking* a bunch of different objects.
  These objects can be created at any point. All that happens is we reorrient the pointers in a linked list.
  - DD

QCC
* Is there a method for creating a copy of an Object that occupies a different memory register?
* Memory is very confusing - MJ
*/


/***
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 **/

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    _head = null; //at birth, a list has no elements
    _size = 0;
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    LLNode tmp = new LLNode( newVal, _head );
    _head = tmp;
    _size++;
    return true;
  }


  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    String retVal;
    LLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //check target node's cargo hold
    retVal = tmp.getCargo();
    return retVal;
  }


  public String set( int index, String newVal )
  {

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    LLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //store target node's cargo
    String oldVal = tmp.getCargo();

    //modify target node's cargo
    tmp.setCargo( newVal );

    return oldVal;
  }

  public String remove( int index ) {
      LLNode temp = _head;
      String oldVal;
      if ( index == 0 ) {
        oldVal = temp.getCargo();
        temp = temp.getNext();
        _head = temp;
        _size--;
        return oldVal;
      }
      for (int i = 0; i < index - 1; i++) {
          temp = temp.getNext();
      }
      oldVal = temp.getNext().getCargo();
      temp.setNext( temp.getNext().getNext() );
      _size--;
      return oldVal;
  }

  public void add(int index, String newVal) {
    LLNode temp = _head;
    if (index == 0) {
        _head = new LLNode(newVal, _head);
        _size++;
    }
    else {
        for (int i = 0; i < index - 1; i++) {
            temp = temp.getNext();
        }
        temp.setNext(new LLNode(newVal, temp.getNext()));
        _size++;
    }
  }


  //return number of nodes in list
  public int size() { return _size; }

  //--------------^  List interface methods  ^--------------


  // override inherited toString
  public String toString()
  {
    String retStr = "HEAD->";
    LLNode tmp = _head; //init tr
    while( tmp != null ) {
	    retStr += tmp.getCargo() + "->";
	    tmp = tmp.getNext();
    }
    retStr += "NULL";
    return retStr;
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


    System.out.println(james.remove(2)); //should remove "a"
    System.out.println(james);

    System.out.println(james.remove(0)); //should remove "I"
    System.out.println(james);

    james.add(0, "I");
    System.out.println(james); //"I", "got", "beat"

    james.add(2, "a");
    System.out.println(james);
  }

}//end class LList
