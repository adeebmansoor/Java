import java.util.LinkedList;
import java.util.Queue;
public class CollectionQueue {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();

        q1.offer(21);
        q1.offer(45);
        q1.offer(76);
        System.out.println(q1);

        System.out.println(q1.peek());

        q1.poll();
        System.out.println(q1);
    }
}

// offer() :- it is used to insert element in the queue, without giving any exception. If the queue is full it will return false.

// poll() :- it is used to remove element from the queue (front element gets removed). If the queue is empty it will return Null.

// peek() :- it is used to check the next element of the queue.
