import java.util.Iterator;
import java.util.Collection;

public interface Deque<T> {
  public int size();
  public void addFirst​(T e);
  public void addLast​(T e);
  public T removeFirst();
  public T removeLast();
  public T peekFirst();
  public T peekLast();
  public boolean remove​(Object o);
  public boolean contains​(Object o);
  public Iterator<T> iterator();
  public boolean addAll​(Collection<T> c);
  public Iterator<T> descendingIterator();
  public boolean removeLastOccurrence​(Object o);
}
