import java.util.ArrayList;
public class ALQueue<QUASAR> implements Queue<QUASAR> {

  private ArrayList<QUASAR> _data;
  private int _removed;

  public ALQueue() {
    _data = new ArrayList<QUASAR>();
    _removed = 0;
  }
  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public QUASAR dequeue() {
    if (isEmpty()){

      System.out.println("Array is already empty, stupid.");
      throw new IndexOutOfBoundsException();

    }
    _removed++;
    return _data.set(_removed - 1, null);
  }

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR x ) {
    _data.add(x);
  }

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty() {
    return _data.size() - _removed == 0;
  }

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront() {
    return _data.get(_removed);
  }

  public String toString() {
    return "" + _data;
  }

  public static void main(String[] args) {

    ALQueue<String> ruawatrain = new ALQueue<String>();
    System.out.println(ruawatrain.isEmpty());
    ruawatrain.enqueue("Josiah");
    ruawatrain.enqueue("David");
    ruawatrain.enqueue("Ben");
    System.out.println(ruawatrain);
    System.out.println(ruawatrain.isEmpty());
    ruawatrain.dequeue();
    ruawatrain.dequeue();
    ruawatrain.dequeue();
    System.out.println(ruawatrain);
    System.out.println(ruawatrain.isEmpty());
    ruawatrain.dequeue();

  }

}
