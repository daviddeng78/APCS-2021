// Ruawatrain :: Benjamin Belotser, David Deng, Josiah Moltz
// APCS pd6
// HW99 --  Some Are More Equal Than Others, Codified
// 2022-05-13
// time spent: .5 hrs

import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue {
  ArrayList<Integer> _queue;

  public ArrayPriorityQueue() // constructor
  {
    _queue = new ArrayList<Integer>();
  }

  public boolean isEmpty()
  {
    return _queue.size() == 0;
  }

  public Integer peekMin()
  {
    return _queue.get(0);
  }

  public Integer removeMin()
  {
    return _queue.remove(0);
  }

  public void add(Integer x)
  {
    if (isEmpty()) {  // if there is nothing in the Queue just instantly add it
      _queue.add(x);
      return;
    }
    else {
      int i = _queue.size();  // NOT _queue.size()-1 because we need to account for the case where we are inserting the smallest element, which gets inserted at the back
      while (i > 0 && _queue.get(i-1) > x) {  // start from the back and search for where to insert
        // starting from the back ensures FIFO is preserved for objects of equal priority
        i--;
      }
      _queue.add(i, x);
      return;
    }
  }

  public String toString() {
    return "" + _queue;
  }

  public static void main(String[] args) {
    ArrayPriorityQueue ruawatrain = new ArrayPriorityQueue();
    System.out.println("Is it empty? " + ruawatrain.isEmpty());
    Integer first = new Integer(1);
    Integer second = new Integer(1);
    ruawatrain.add(first);
    ruawatrain.add(second);
    // checks FIFO on objects of the same priority
    System.out.println("Is first first? " + (ruawatrain.peekMin() == first));
    System.out.println("Is second first? " + (ruawatrain.removeMin() == second));
    System.out.println("Is first second? " + (ruawatrain.peekMin() == first));
    System.out.println("Is second second? " + (ruawatrain.removeMin() == second));
    System.out.println("Is it empty? " + ruawatrain.isEmpty());
    // checks that objects are being added in priority order
    ruawatrain.add(42);
    ruawatrain.add(55);
    ruawatrain.add(91);
    ruawatrain.add(93); // PRIME
    ruawatrain.add(1);
    ruawatrain.add(44);
    ruawatrain.add(5);
    ruawatrain.add(88);
    System.out.println(ruawatrain);
  }
}
