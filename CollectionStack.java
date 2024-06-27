import java.util.Stack;
public class CollectionStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("lion");
        animals.push("dog");
        animals.push("cat");
        animals.push("tiger");
        System.out.println(animals);

        System.out.println(animals.peek());

        animals.pop();
        System.out.println(animals);
    }
}

// push() :- it is used to insert element in the stack.

// pop() :- it is used to remove element from the stack. (top element gets removed)

// peek() :- it is used to check the top element of the stack.