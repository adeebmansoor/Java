import java.util.*;
public class CollectionPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(56);
        pq.offer(2);
        pq.offer(43);
        pq.offer(72);
        pq.offer(13);
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());

        // Converting Min Heap to Max Heap
        Queue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        pq2.offer(56);
        pq2.offer(2);
        pq2.offer(43);
        pq2.offer(72);
        pq2.offer(13);
        System.out.println(pq2);
    }
}
// Important: We can easily convert min heap to max heap by passing a comparator in the constructor of priority queue.

// offer() :- it is used to insert element in the queue, without giving any exception. If the queue is full it will return false.

// poll() :- it is used to remove element from the queue (front element gets removed). If the queue is empty it will return Null.

// peek() :- it is used to check the next element of the queue.

