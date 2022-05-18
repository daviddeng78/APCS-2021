// ruawatrain: Benjamin Belotser, David Deng, Josiah Moltz
// APCS pd6
// HW88 -- BPC Kiddies Do Not Wait In Line Either
// 2022-04-04
// time spent: .8 hrs

/*
DISCO
0. end ---> Q U E U E ---> front referred to CUSTOMER flow, NOT the linkage directions.

QCC
0. The algo for shuffle was cool.
1. Why pirates?
2. Placing _front at the back and _end at the front in the diagram was not conducive to success.
*/

/***
 * class RQueue
 * SKELETON
 * A node-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linkages point opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 **/


public class RQueue<SWASHBUCKLE> implements Queue<SWASHBUCKLE>
{
  //instance variables
  private LLNode<SWASHBUCKLE> _front, _end;
  private int _size;


  // default constructor creates an empty queue
  public RQueue()
  {
    _front = _end = null; // shmancy code that Josiah dislikes
    _size = 0;
  }


  public void enqueue( SWASHBUCKLE enQVal )
  {
    //special case: when enqueuing to an empty list,
    //make _front && _end point to same node
    if ( isEmpty() ) {
      _front = _end = new LLNode<SWASHBUCKLE>( enQVal, null );
    }
    else {
      _end.setNext( new LLNode<SWASHBUCKLE>( enQVal, null ) );
      _end = _end.getNext();
    }
    _size++;
    System.out.println("enqueued " + enQVal);
  }//O(1)


  // remove and return thing at front of queue
  // assume _queue ! empty
  public SWASHBUCKLE dequeue()
  {
    SWASHBUCKLE retVal;
    sample();
    retVal = _front.getCargo();
    _front = _front.getNext();
    _size--;
    return retVal;
  }//O(n) (same as sample())


  public SWASHBUCKLE peekFront()
  {
    return _front.getCargo();
  }//O(1)


  /***
   * void sample() -- a means of "shuffling" the queue
   * Algo:
   *   Pick a random person in line.
   *   Split the line into two sections, the section that before the picked person, and the section after and including the random person.
   *   Swap the order of these two sections, moving the selected person to the front, and the person right before them to the back.
   **/
  public void sample ()
  {
    int rPos = (int) ( Math.random() * _size );
    LLNode<SWASHBUCKLE> prev = _front;  // prev will point to node BEFORE the one we want to move

    for (int i = 0; i < rPos-1; i++) {
      prev = prev.getNext();
    }

    _end.setNext( _front );
    _front = prev.getNext();
    _end = prev;
    prev.setNext(null);
  }//O(n) It AVERAGES to O(n)

  // OLD CODE THAT DIDN'T ACCOUNT FOR size = 1
  // LLNode<SWASHBUCKLE> nFront = prev.getNext();  // nFront is the new front
  // prev.setNext(prev.getNext().getNext()); // skip over nFront in its old position
  // nFront.setNext( _front ); // move nFront to the start of the list
  // _front = nFront;  // move the _front to match the previous line

  public boolean isEmpty()
  {
    return _front == null;
  } //O(1)


  // print each node, separated by spaces
  public String toString()
  {
    LLNode<SWASHBUCKLE> tmp = _front;
    String result = "FRONT --> ";
    for (int i = 0; i < _size; i++){
      result += tmp.getCargo() + " --> ";
      tmp = tmp.getNext();
    }
    result += "END";
    return result;
  }



  //main method for testing
  public static void main( String[] args )
  {

    Queue<String> PirateQueue = new RQueue<String>();

    System.out.println("\nnow enqueuing...");
    PirateQueue.enqueue("Dread");
    PirateQueue.enqueue("Pirate");
    PirateQueue.enqueue("Roberts");
    PirateQueue.enqueue("Blackbeard");
    PirateQueue.enqueue("Peter");
    PirateQueue.enqueue("Stuyvesant");
    PirateQueue.enqueue("Wesley");

    System.out.println("\nnow testing toString()...");
    System.out.println( PirateQueue ); //for testing toString()...

    System.out.println("\nnow dequeuing...");
    System.out.println( PirateQueue.dequeue() );  // for personal examination
    System.out.println( PirateQueue );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue );

    System.out.println("\nnow dequeuing fr empty queue...\n" +
                       "(expect NPE)\n");
    System.out.println( PirateQueue.dequeue() );
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main

}//end class RQueue
