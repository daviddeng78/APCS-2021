//Clyde Sinclair
//APCS pd0
//HW75 -- Node for a linked list
//2022-03-11f
//time spent: 1.5 hrs

/* DISCO
  We did not need accessors because it was an inner class and we had access to all of the variables.

QCC
 Team is having a civil war over how much to delete from the innerclass. David is an anarchist? Josiah is authority positive? Ben is not sure who is right.

/***
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 **/
 public class NodeQueue<QUASAR> implements Queue<QUASAR> {
   private QNode<QUASAR> _head;
   private int _size;
   public NodeQueue (){
     _head = null;
     _size = 0;
   }
   //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
   //means of removing an element from collection:
 //Dequeues and returns the first element of the queue.
  public QUASAR dequeue(){
    QUASAR tmp = peekFront();

    if (!isEmpty()){
      _head = _head._nextNode;
      _size --;
    }

    return tmp;
  }


  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR x ){
    QNode<QUASAR> tmp = _head;
    if (isEmpty()){
      _head = new QNode(x, null);
    }
    else {
      for (int i = 0; i < _size - 1; i++){
        tmp = tmp._nextNode;
      }
      tmp.setNext(new QNode(x, null));
    }
    _size ++;
  }


  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty() {
    return _size == 0;
  }

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront(){
    if (isEmpty()){
      return null;
    }
    return _head._cargo;
  }
  public String toString(){
    QNode<QUASAR> tmp = _head;
    String result = "SOUPNAZI --> ";
    for (int i = 0; i < _size; i++){
      result += tmp._cargo + " --> ";
      tmp = tmp._nextNode;
    }
    result += "DOOR";
    return result;
  }
  public class QNode<QUASAR>
  {
    //instance vars
    private QUASAR _cargo;
    private QNode<QUASAR> _nextNode;

    // constructor
    public QNode( QUASAR value, QNode<QUASAR> next )
    {
      _cargo = value;
      _nextNode = next;
    }

    //--------------v  MUTATORS  v--------------
    public QUASAR setCargo( QUASAR newCargo )
    {
      QUASAR foo = _cargo;
      _cargo = newCargo;
      return foo;
    }

    public QNode<QUASAR> setNext( QNode<QUASAR> newNext )
    {
      QNode<QUASAR> foo = _nextNode;
      _nextNode = newNext;
      return foo;
    }
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    public String toString()
    {
      return "" + _cargo;
    }
  }

  public static void main(String[] args) {
   NodeQueue<String> soupLine = new NodeQueue();
   System.out.println(soupLine.isEmpty());
   soupLine.dequeue();
   System.out.println(soupLine.peekFront());
   soupLine.enqueue("George");
   System.out.println(soupLine.isEmpty());
   soupLine.enqueue("Jerry");
   System.out.println("current status " + soupLine);
   System.out.println("NO SOUP FOR YOU " + soupLine.dequeue());
   System.out.println("SOUP FOR YOU " + soupLine.peekFront());
   soupLine.dequeue();
   soupLine.enqueue("Elaine");
   System.out.println("current status " + soupLine);
   System.out.println("NO SOUP FOR YOU " + soupLine.dequeue());


  }



}
