/***
 * class Latkes
 * v1
 * SKELETON
 * Implements a stack of Strings using an encapsulated array
 **/

/***
    DISCO

    QCC

 **/


public class Latkes
{
  private String [] _stack;
  private int _stackSize;


  //constructor
  public Latkes( int initCapacity )
  {
    _stack = new String[initCapacity];
    _stackSize = 0;
  }// O(1) -- Allocates memory to stack and sets _stackSize.


  //means of insertion
  public void push( String s )
  {
    if (isFull()) {
      System.out.println("Pancake stack will fall over. Aborting...");
    }
    else {
      _stack[_stackSize] = s; //treats end of array as top of current stack of pancakes
      _stackSize++; //increases number of pancakes by 1
    }
  }// O(?)


  //means of removal
  public String pop( )
  {
    if (isEmpty()) {
      System.out.println("You have no pancakes right now :(");
    }
    else {
      String tmp = _stack[_stackSize - 1];
      _stack[_stackSize - 1] = 0;
      _stackSize--;
    }
  }// O(?)


  //chk for emptiness
  public boolean isEmpty()
  {
    return _stackSize == 0;
  }// O(?)


  //chk for fullness
  public boolean isFull()
  {
    return _stackSize == _stack.length;
  }// O(?)


  //main method for testing
  public static void main( String[] args )
  {
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v

    Latkes tastyStack = new Latkes(10);

    tastyStack.push("aoo");
    tastyStack.push("boo");
    tastyStack.push("coo");
    tastyStack.push("doo");
    tastyStack.push("eoo");
    tastyStack.push("foo");
    tastyStack.push("goo");
    tastyStack.push("hoo");
    tastyStack.push("ioo");
    tastyStack.push("joo");
    tastyStack.push("coocoo");
    tastyStack.push("cachoo");

    //cachoo
    System.out.println( tastyStack.pop() );
    //coocoo
    System.out.println( tastyStack.pop() );
    //joo
    System.out.println( tastyStack.pop() );
    //ioo
    System.out.println( tastyStack.pop() );
    //hoo
    System.out.println( tastyStack.pop() );
    //goo
    System.out.println( tastyStack.pop() );
    //foo
    System.out.println( tastyStack.pop() );
    //eoo
    System.out.println( tastyStack.pop() );
    //doo
    System.out.println( tastyStack.pop() );
    //coo
    System.out.println( tastyStack.pop() );
    //boo
    System.out.println( tastyStack.pop() );
    //aoo
    System.out.println( tastyStack.pop() );

    //stack empty by now; SOP(null)
    System.out.println( tastyStack.pop() );
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main()

}//end class Latkes
