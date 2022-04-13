// ruawatrain: Benjamin Belotser, David Deng, Josiah Moltz
// APCS pd6
// HW90 -- Swabbing the Deque
// 2022-04-12
// time spent: 1 hrs

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collection;

public class PolarExpress<T> implements Deque<T>{
  private LinkedList<T> _data;  // LINKED LIST PASS THROUGH FUNCTIONALITY IS BEAUTIFUL

  public PolarExpress() {
    _data = new LinkedList<T>();
  }

  public int size() {
    return _data.size();
  }
  public void addFirst​(T e) {
    _data.addFirst(e);
  }
  public void addLast​(T e) {
    _data.addLast(e);
  }
  public T removeFirst() {
    return _data.removeFirst();
  }
  public T removeLast() {
    return _data.removeLast();
  }
  public T peekFirst() {
    return _data.peekFirst();
  }
  public T peekLast() {
    return _data.peekLast();
  }
  public boolean remove​(Object o) {  // discovered pass through later oops
    Iterator<T> it = iterator();
    while ( it.hasNext() ) {
      if (it.next().equals(o)) {
        it.remove();
        return true;
      }
    }
    return false;
  }
  public boolean contains​(Object o) {
    return _data.contains(o);
  }
  public Iterator<T> iterator() {
    return _data.iterator();
  }
  public boolean addAll​(Collection<T> c) {
    return _data.addAll(c);
  }
  public Iterator<T> descendingIterator() {
    return _data.descendingIterator();
  }
  public boolean removeLastOccurrence​(Object o) {
    return _data.removeLastOccurrence(o);
  }
}
