// Ruawatrain: Benjamin Belotser, David Deng, Josiah Moltz
// APCS pd6
// HW85 -- Leon Leonwood Stack
// 2022-03-30
// time spent: 0.5 hrs

import java.util.ArrayList;
public class ALStack<PANCAKE> implements Stack<PANCAKE> {
  ArrayList<PANCAKE> _stack = new ArrayList();

  //Return true if this stack is empty, otherwise false.
  public boolean isEmpty() {
    return _stack.size() == 0;
  }

  //Return top element of stack without popping it.
  public PANCAKE peekTop() {
    return isEmpty() ? null : _stack.get( _stack.size() - 1 );  // David magic
  }

  //Pop and return top element of stack.
  public PANCAKE pop() {
    return isEmpty() ? null : _stack.remove( _stack.size() - 1 );  // David magic
  }

  //Push an element onto top of this stack.
  public void push( PANCAKE x ) {
    _stack.add( x );
  }


}
