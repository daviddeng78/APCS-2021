// Ruawatrain: Benjamin Belotser, David Deng, Josiah Moltz
// APCS pd6
// HW77 -- Double Up
// 2022-03-16
// time spent: 2

/*
DISCO
  * Team programming was super helpful here, I probably would have lost my mind without it - JM.
  * We can have a bit of optimization where if the index we want to access is closer to TAIL than to HEAD
    we can iterate from TAIL instead of HEAD. (utilized in get and set)
QCC
  * This is still hard. Theory as to why: Previous stuff was more mathy, this is very memory-y heavy? - JM.
  * Why did we do this? Was it just an exercise?
    It feels much clunkier now, which could mean we just did it wrong (hopefully not).

ALGO ADD
  0. Create tmp, an alias for _head.
  1. Create the newNode which is the node we want to add, with prev and next of null (these will be updated later).
  2. If we are adding the first element, use the add method.
  3. If not, iterate through tmp to the element right before where we want to add.
  4. Set the prev of newNode to tmp, and the next of newNode to the next of tmp.
  5. Set the next of tmp to newNode, and the prev of tmp.getNext() to newNode.
  6. Increment _size by 1

  //check target node's cargo hold
  retVal = tmp.getNext().getCargo();

  //remove target node
  tmp.setNext( tmp.getNext().getNext() );
  tmp.getNext().setPrev( tmp ); // updating backwards pointer

ALGO REM
  0. Create tmp, an alias for _head.
  1. If we are removing the first element, store the value we are removing, and set _head equal to _head.getNext()
  2. If we are removing the last element, store the value we are removing, set _tail.getPrev() to null, and _tail to _tail.getPrev()
  3. If neither of the previous are true, iterate up to the index immediately before the one we want to remove.
  4. Store the value we are removing, set tmp.getNext() to be the node two down from tmp, and then update tmp.getNext().getPrev() to be tmp.
  5. Decrement _size by 1
  6. Return the removed value.
*/
/***
 * class LList
 * Implements a doubly linked list of LLNodes, each containing String data
 **/

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head, _tail;  // WHY TAIL??
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    _head = null; // at birth, a list has no elements
    _tail = null;
    _size = 0;
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    LLNode tmp = new LLNode( newVal, null, _head ); // first element has prev _null
    if (_size == 0)
    {
      _head = tmp;
      _tail = tmp;
    }
    else
    {
      _head.setPrev( tmp ); // update _head to point back
    }
    _head = tmp;
    _size++;
    return true;
  }


  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    String retVal;
    LLNode tmp;

    if ( index > _size / 2 )  // Smells like optimization - JM
    {
      tmp = _tail;
      for( int i = _size-1; i > index; i-- )
        tmp = tmp.getPrev();
    }
    else {
      tmp = _head;
      //walk to desired node
      for( int i=0; i < index; i++ )
        tmp = tmp.getNext();
    }

    //check target node's cargo hold
    retVal = tmp.getCargo();
    return retVal;
  }


  public String set( int index, String newVal )
  {

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

      String oldVal;
      LLNode tmp;

      if ( index > _size / 2 )  // Smells like optimization - JM
      {
        tmp = _tail;
        for( int i = _size-1; i > index; i-- )
          tmp = tmp.getPrev();
      }
      else {
        tmp = _head;
        //walk to desired node
        for( int i=0; i < index; i++ )
          tmp = tmp.getNext();
      }

      //check target node's cargo hold
      oldVal = tmp.getCargo();
      tmp.setCargo( newVal );
      return oldVal;
  }

  public String remove( int index ) {

    if ( index < 0 || index >= size() )
	    throw new IndexOutOfBoundsException();

    String retVal;
    LLNode tmp = _head; //create alias to head

    //if index==0, remove head node
    if ( index == 0 ) {
	    //check target node's cargo hold
	    retVal = _head.getCargo();

	    //remove target node
	    _head = _head.getNext();
    }
    else if ( index == _size - 1) {
      retVal = _tail.getCargo();

      _tail.getPrev().setNext(null);
      _tail = _tail.getPrev();
    }
    else {
	    //walk to node before desired node
	    for( int i=0; i < index-1; i++ )
        tmp = tmp.getNext();

	    //check target node's cargo hold
	    retVal = tmp.getNext().getCargo();

	    //remove target node
	    tmp.setNext( tmp.getNext().getNext() );
      tmp.getNext().setPrev( tmp ); // updating backwards pointer
    }

    //decrement size attribute
    _size--;

    return retVal;
  }

  public void add( int index, String newVal ) {

    if ( index < 0 || index >= size() )
	    throw new IndexOutOfBoundsException();

    LLNode newNode = new LLNode( newVal, null, null );  // will update both nulls later

    //if index==0, insert node before head node
    if ( index == 0 )
	    add( newVal );
    else
    {
	    LLNode tmp = _head; //create alias to head

	    //walk to node before desired node
	    for( int i=0; i < index-1; i++ )
        tmp = tmp.getNext();

	    //insert new node
	    newNode.setNext( tmp.getNext() );
      newNode.setPrev( tmp );
      tmp.getNext().setPrev( newNode );
	    tmp.setNext( newNode );
	    //increment size attribute
	    _size++;
    }
  }


  //return number of nodes in list
  public int size() { return _size; }

  //--------------^  List interface methods  ^--------------


  // override inherited toString
  public String toString()
  {
    String retStr = "HEAD<->";
    LLNode tmp = _head; //init tr
    while( tmp != null ) {
	    retStr += tmp.getCargo() + "<->";
	    tmp = tmp.getNext();
    }
    retStr += "NULL";
    return retStr;
  }

  public String toStringB() // for testing backwards functionality
  {
    String retStr = "TAIL<->";
    LLNode tmp = _tail;
    while( tmp != null ) {
      retStr += tmp.getCargo() + "<->";
      tmp = tmp.getPrev();
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

    james.set( 3, "ops?" );
    System.out.println( "...and now 3rd item is: " + james.set(3,"ops?") );

    System.out.println( james );

    System.out.println(james.remove(3)); //should remove "ops"
    System.out.println(james);

    System.out.println(james.remove(2)); //should remove "a"
    System.out.println(james);

    System.out.println(james.remove(0)); //should remove "I"
    System.out.println(james);

    james.add(0, "I");
    System.out.println(james); //"I", "got", "beat"

    james.add(1, "a");
    System.out.println(james);

    System.out.println(james.toStringB());
  }

}//end class LList
