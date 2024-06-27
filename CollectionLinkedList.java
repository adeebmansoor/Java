import java.util.LinkedList;
public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(13);
        l1.add(84);
        l1.add(46);
        l1.add(20);
        System.out.println(l1);

        System.out.println(l1.peek());

        l1.addFirst(32);
        System.out.println(l1);

        l1.addLast(54);
        System.out.println(l1);

        l1.poll();
        System.out.println(l1);

        System.out.println(l1.toString());
    }
}

// add() : this method is use to add elements in ArrayList.

// addFirst() : inserts element at first index.

// addLast() : inserts element at last index.

// offer(element) : it inserts element without showing any exception.

// offerFirst(element) : it inserts element at first index without showing any exception.

// offerLast(element) : it inserts element at last index without showing any exception.

// descendingIterator : it prints list in reverse order.

// peek() : it is use to check the top element.

// poll() : it removes element from the list without showing any exceptions.

// pollFirst() : it removes first element from the list without showing any exceptions.

// pollLast() : it removes last element from the list without showing any exceptions.

// get(int index) : this method is use to return element at particular index.

// getFirst() : this method is use to return element at first index.

// getLast() : this method is use to return element at last index.

// indexOf(element) : it retrieves the index of first element.

// lastIndexOf(element) : it retrieves the index of last element.

// remove(int index) : this method removes element at particular index.

// remove(Integer.valueOf(int value)) : this method is use to remove a particular/targeted value from the list.

// clear() : it is used to clear all the elements from the list.

// set(int index: , int value: ) : it is used to change the element at the particular index.

// contains(int value) : it is used to check if the value the is present in the list or not. It only returns true or false.

// size() : this method returns size of ArrayList.

// hasNext() : this method is use to check whether the element is present in the next memory location or not.
// It will return only true or false as the output.

// next() : this method is always attached with hasNext() method. This returns the element in ArrayList, whenever hasNext() is true.

// toArray() : converts list into array.

// toString() : converts list into string.

