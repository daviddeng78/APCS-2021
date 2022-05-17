/***

// Ruawatrain - Mosiah Joltz, David Deng, Benjamin Belotser
// APCS pd6
// HW7 75-- Nodal Recall
// 2022-03-13
// time spent: 0.
 **/

public class LLNode
{
  //instance variables
  private String cargo;
  private LLNode cdrgo;


  // constructor
  public LLNode( String value, LLNode next )
  {
    cargo = value;
    cdrgo = next;

  }


  //--------------v  ACCESSORS  v--------------
  public String getCargo()
  {
    return cargo;
  }

  public LLNode getNext()
  {
    return cdrgo;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public String setCargo( String newCargo )
  {
    cargo = newCargo;
    return newCargo;
  }

  public LLNode setNext( LLNode newNext )
  {
    cdrgo = newNext;
    return newNext;

  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString()
  {
    return ("(" + cargo   + "," + cdrgo + ")");
  }


  //main method for testing
  public static void main( String[] args )
  {

    //Below is an exercise in creating a linked list...

    //Create a node
    LLNode first = new LLNode( "cat", null );

    //Create a new node after the first
    first.setNext( new LLNode( "dog", null ) );

    //Create a third node after the second
    first.getNext().setNext( new LLNode( "cow", null ) );

  //   A naive list traversal, has side effects.... ??
       while( first != null ) {
       System.out.println( first );
       first = first.getNext();
       }


    //Q: when head ptr moves to next node in list, what happens to the node it just left?
      // A: LinkedList cannot go back from a node, so the node behind the one the ptr becomes unreadable.
    //...so better: LinkedList would add a cdr on the left side of each car, thus making it possible to go backwards from a node.
    // or add a driver file, keeping track of position relative to first node, so if we need to go back it can just restart
    // the operation.
    // 
    //
    //
    //

  }//end main

}//end class LLNode
