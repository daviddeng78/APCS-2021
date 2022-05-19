// Ruawatrain :: Benjamin Belotser, David Deng, Josiah Moltz
// APCS pd6
// HW103 -- Erica's Friends, Hugo, and The One in the Middle
// 2022-05-18
// time spent: 1.5 hrs

/*
DISCO
We should have been more careful/cautious in coding Max/Min heap. It cost us a LOT of time.

QCC
Who came up with this? Its pretty cool!

ALGO
Inserting element
Insert the first element into maxHeap
For inserting newVal
If item newVal > root of maxHeap, insert it into minHeap
If otherwise, insert it into maxHeap
Balance the two trees if necessary (difference of height >= 2)
If number of elements is odd, take root of maxHeap
if not, average min and max

To get the median
If there are an even number of elements, average the two roots
Otherwise, take the root of the tree with the largest number of elements
*/

public class RunMed
{
  // instance vars
  private ALHeapMax lilVals;  // stores values <= median
  private ALHeapMin bigVals;  // stores values > median

  public RunMed() {
    lilVals = new ALHeapMax();
    bigVals = new ALHeapMin();
  }

  public void add(Integer newVal) {
    if ( lilVals.size() == 0 ) {
      lilVals.add(newVal);
      return;
    }
    else {
      if ( newVal > lilVals.peekMax() ) {
        bigVals.add(newVal);
      }
      else {
        lilVals.add(newVal);
      }
    }
    if (lilVals.size() - bigVals.size() > 1) {
      bigVals.add(lilVals.removeMax());
    }
    else if (lilVals.size() - bigVals.size() < -1) {
      lilVals.add(bigVals.removeMin());
    }
    return;
  }

  public double getMedian()
  {
    if ( (lilVals.size() + bigVals.size()) % 2 == 0 )
    {
      return ( (double) lilVals.peekMax() + bigVals.peekMin() )/2;
    }
    else {
      if (lilVals.size() > bigVals.size())
      {
        return (double) lilVals.peekMax();
      }
      else {
        return (double) bigVals.peekMin();
      }
    }
  }
}
