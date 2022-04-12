// ruawatrain: Benjamin Belotser, David Deng, Josiah Moltz
// APCS pd6
// HW89 -- Queue Two Ways
// 2022-04-11
// time spent: 0.8 hrs

/*
DISCO
0. You append an ArrayList to an empty String and you get a nice toString.
QCC
0. Which type of List works better for Queues?
*/

import java.util.LinkedList;

public class LLQueue<QUASAR> implements Queue<QUASAR>{

  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public QUASAR dequeue(){
    if (isEmpty()){

      System.out.println("Array is already empty, stupid.");
      throw new IndexOutOfBoundsException();

    }

    return _data.removeFirst();
  }

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR x ){

    _data.addLast(x);
  }



  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty(){
    return _data.size() == 0;

  }


  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront(){
    return  _data.peekFirst();
  }

  private LinkedList<QUASAR> _data;



  public LLQueue(){
    _data = new LinkedList<QUASAR>();

  }

  public String toString(){
    String retVal = "HEAD -> ";
    for (QUASAR thing: _data){
      retVal += thing + " -> ";

    }
    retVal += "TAIL";
    return retVal;
  }

  public static void main(String[] args) {
    LLQueue<String> ruawatrain = new LLQueue<String>();
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
