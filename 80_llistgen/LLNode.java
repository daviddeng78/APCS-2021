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
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 **/

public class LLNode
{
  //instance vars
  private String _cargo;
  private LLNode _prevNode;
  private LLNode _nextNode;

  // constructor
  public LLNode( String value, LLNode prev, LLNode next )
  {
    _cargo = value;
    _prevNode = prev;
    _nextNode = next;
  }


  //--------------v  ACCESSORS  v--------------
  public String getCargo()
  {
    return _cargo;
  }

  public LLNode getNext()
  {
    return _nextNode;
  }

  public LLNode getPrev()
  {
    return _prevNode;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public String setCargo( String newCargo )
  {
    String foo = getCargo();
    _cargo = newCargo;
    return foo;
  }

  public LLNode setNext( LLNode newNext )
  {
    LLNode foo = getNext();
    _nextNode = newNext;
    return foo;
  }

  public LLNode setPrev( LLNode newPrev )
  {
    LLNode foo = getPrev();
    _prevNode = newPrev;
    return foo;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString()
  {
    return _cargo;
  }


  //main method for testing
  public static void main( String[] args )
  {

    //Below is an exercise in creating a linked list...

    //Create a node
    LLNode first = new LLNode( "cat", null, null );

    //Create a new node after the first
    first.setNext( new LLNode( "dog", first, null ) );

    //Create a third node after the second
    first.getNext().setNext( new LLNode( "cow", first.getNext(), null ) );

    while( first.getNext() != null )  // iterate "down" tree
    {
      System.out.println( first );
      first = first.getNext();
    }

    System.out.println( first );
    first = first.getPrev();

    while( first != null )  // iterate "up" tree
    {
      System.out.println( first );
      first = first.getPrev();
    }

  }//end main

}//end class LLNode
