import java.util.ArrayList;
import java.util.Iterator;
public class ExampleArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(25);
        System.out.println(al);

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(100);
        al2.add(150);

        al.addAll(al2);
        System.out.println(al);

        System.out.println(al.get(2));

        al.remove(3);
        System.out.println(al);

        al.remove(Integer.valueOf(20));
        System.out.println(al);

        // al.clear();
        // System.out.println(al);

        al.set(1, 50);
        System.out.println(al);

        System.out.println(al.contains(150));

        Iterator<Integer> it = al.iterator();
        while(it.hasNext()){
            System.out.println("Iterator" + it.next());
        }
    }
}

// add() : this method is use to add elements in ArrayList.

// add(index: , element: ) : this method is used to add element at particular index.

// insert(int index, value) : this method insert element at particular index.

// addAll(int index: ) : it is used to return element at particular element.

// get(int index) : this method is use to return element at particular index.

// remove(int index) : this method removes element at particular index.

// remove(Integer.valueOf(int value)) : this method id use to remove a particular/targeted value from the list.

// clear() : it is used to clear all the elements from the list.

// set(int index: , int value: ) : it is used to change the element at the particular index.

// contains(int value) : it is used to check if the value the is present in the list or not. It only returns true or false.

// size() : this method returns size of ArrayList.

// hasNext() : this method is use to check whether the element is present in the next memory location or not.
// It will return only true or false as the output.

// next() : this method is always attached with hasNext() method. This returns the element in ArrayList, whenever hasNext() is true.