// Ruawatrain :: Benjamin Belotser, David Deng, Josiah Moltz
// APCS pd6
// HW99 --  Some Are More Equal Than Others, Codified
// 2022-05-13
// time spent: .5 hrs

public interface PriorityQueue {
  void add(Integer x);

  boolean isEmpty();

  Integer peekMin();

  Integer removeMin();
}
