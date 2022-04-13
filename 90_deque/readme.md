# HEADER
ruawatrain: Benjamin Belotser, David Deng, Josiah Moltz \
APCS pd6 \
HW90 -- Swabbing the Deque \
2022-04-12 \
time spent: 1 hrs \

## ORIGINAL PLAN!!!
* int 	size() \
  Returns the number of elements in this deque.
* void 	addFirst​(E e) \
  Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
* void 	addLast​(E e) \
  Inserts the specified element at the end of this deque if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
* E 	removeFirst() \
  Retrieves and removes the first element of this deque.
* E 	removeLast() \
  Retrieves and removes the last element of this deque.
* E 	peekFirst() \
  Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
* E 	peekLast() \
  Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
* boolean 	remove​(Object o)  SEEMS ANNOYING	\
  Removes the first occurrence of the specified element from this deque.
* boolean 	contains​(Object o)  SEEMS HARDish \
  Returns true if this deque contains the specified element.
* Iterator<E> 	iterator() SEEMS HARDish \
  Returns an iterator over the elements in this deque in proper sequence.
* boolean 	addAll​(Collection<? extends E> c) SEEMS HARDish \
  Adds all of the elements in the specified collection at the end of this deque, as if by calling addLast(E) on each one, in the order that they are returned by the collection's iterator.
* Iterator<E> 	descendingIterator() SEEMS HARD \
  Returns an iterator over the elements in this deque in reverse sequential order.
* boolean 	removeLastOccurrence​(Object o)  SEEMS HARD \
  Removes the last occurrence of the specified element from this deque.

## REVISED PLAN
* We hold these Truths to be self-evident, that all Methods are created equal. Everything is pass-through.

## DESIGN DECISIONS
*
