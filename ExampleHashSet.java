import java.util.*;
public class ExampleHashSet {
    public static void main(String[] args) {
    HashSet<Integer> hs = new HashSet<>();
    int[] arr = {2,4,3,1,2,7,4};
    for(int i=0; i<arr.length; i++){
        hs.add(arr[i]);
    }
    for(int x : hs){
        System.out.print(x + " ");
    }
}
}
