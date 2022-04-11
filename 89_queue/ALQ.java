import java.util.ArrayList;

public class ALQ<QUASAR> implements Queue<QUASAR> {
  private ArrayList<QUASAR> _data;
  private int _countRemoved;

  public ALQ() {
    _data = new ArrayList<QUASAR>();
    _countRemoved = 0;
  }

  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public QUASAR dequeue() {
    _countRemoved++;
    return _data.remove(_countRemoved - 1);
  }

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR x ) {
    _data.add(x);
  }

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty() {
    return _data.size() - _countRemoved == 0;
  }

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront() {
    return _data.get(_countRemoved);
  }

  public String toString() {
    return "" + _data;
  }

  public static void main(String[] args) {
    ALQ<String> ruawatrain = new ALQ<String>();
    System.out.println(ruawatrain.isEmpty());
    ruawatrain.enqueue("Josiah");
    ruawatrain.enqueue("David");
    ruawatrain.enqueue("Ben");
    System.out.println(ruawatrain);
  }
}
