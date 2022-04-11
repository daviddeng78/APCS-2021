// Ruawatrain: Benjamin Belotser, David Deng, Josiah Moltz
// APCS pd6
// HW85 -- Leon Leonwood Stack
// 2022-03-30
// time spent: 0.5 hrs

import java.util.LinkedList;
public class LLStack<PANCAKE> implements Stack<PANCAKE> {
  LinkedList<PANCAKE> _stack = new LinkedList();

  //Return true if this stack is empty, otherwise false.
  public boolean isEmpty() {
    return _stack.size() == 0;
  }

  //Return top element of stack without popping it.
  public PANCAKE peekTop() {
    return isEmpty() ? null : _stack.getLast(); // David magic
  }

  //Pop and return top element of stack.
  public PANCAKE pop() {
    return isEmpty() ? null : _stack.removeLast();  // David magic
  }

  //Push an element onto top of this stack.
  public void push( PANCAKE x ) {
    _stack.addLast(x);
  }

}
