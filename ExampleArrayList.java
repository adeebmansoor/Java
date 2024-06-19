import java.util.ArrayList;
import java.util.Iterator;
public class ExampleArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(25);
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

// add() : this method is use to add elements in ArrayList.

// hasNext() : this method is use to check whether the element is present in the next memory location or not.
// It will return only true or false as the output.

// next() : this method is always attached with hasNext() method. This returns the element in ArrayList, whenever hasNext() is true.

// size() : this method returns size of ArrayList.

// get(int index) : this method is use to return element at particular index.

// remove(int index) : this method removes element at particular index.

// insert(int index, value) : this method insert element at particular index.