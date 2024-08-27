import java.util.*;
public class CollectionDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(45);
        adq.offerFirst(23);
        adq.offerFirst(92);
        adq.offerFirst(67);
        adq.offerLast(76);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        adq.poll();
        System.out.println(adq);

        adq.pollFirst();
        System.out.println(adq);

        adq.pollLast();
        System.out.println(adq);
    }
}

// offer() :- it is used to insert element in the queue, without giving any exception. If the queue is full it will return false.

// offerFirst() :- insert element at the front.

// offerLast() :- insert element at the last.

// poll() :- it is used to remove element from the queue (front element gets removed). If the queue is empty it will return Null.

// pollFirst() :- remove element from the front.

// pollLast() :- remove element from the last.

// peek() :- it is used to check the next element of the queue.

// peekFirst() :- check element at the front.

// peekLast() :- check element at the last.
