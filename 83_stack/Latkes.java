// Ruawatrain: Benjamin Belotser, David Deng, Josiah Moltz
// APCS pd6
// HW83 -- Stacks on Stacks
// 2022-03-28
// time spent: 0.5 hrs

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
        String[] newStack = new String[_stack.length + 10];
        for (int i = 0; i < _stack.length; i++) {
            newStack[i] = _stack[i];
        }
        _stack = newStack;
        push(s);
    }
    else {
      _stack[_stackSize] = s; //treats end of array as top of current stack of pancakes
      _stackSize++; //increases number of pancakes by 1
    }
  }// Amortized: O(1) because it only requires adding element `s` at index `_stackSize`. 
   //If the underlying array is full, the time complexity is O(n) because it requires creating a new array with a greater length
   //and performing a deep copy on the previous array


  //means of removal
  public String pop( )
  {
    if (isEmpty()) {
        return null;
    }
    else {
        String tmp = _stack[_stackSize - 1];
        _stack[_stackSize - 1] = null;
        _stackSize--;
        return tmp;
    }
  }// O(1) because it just sets the element at index `_stackSize` to null.


  //chk for emptiness
  public boolean isEmpty()
  {
    return _stackSize == 0;
  }// O(1) because it compares the instance var `_stackSize` to 0.


  //chk for fullness
  public boolean isFull()
  {
    return _stackSize == _stack.length;
  }// O(1) because it compares the instance var `_stackSize` to the length of the underlying array


  //main method for testing
  public static void main( String[] args )
  {

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
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main()

}//end class Latkes
