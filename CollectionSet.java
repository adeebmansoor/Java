import java.util.HashSet;
public class CollectionSet {
    public static void main(String[] args) {
    // HashSet<Integer> hs = new HashSet<>();
    // int[] arr = {2,4,3,1,2,7,4};
    // for(int i=0; i<arr.length; i++){
    //     hs.add(arr[i]);
    // }
    // for(int x : hs){
    //     System.out.print(x + " ");
    // }
    // hs.add(23);
    // hs.add(24);
    // hs.add(32);
    // hs.add(11);
    // hs.add(23);
    // hs.add(47);
    // System.out.println(hs);

    // TreeSet<Integer> ts = new TreeSet<>();
    // ts.add(23);
    // ts.add(24);
    // ts.add(32);
    // ts.add(11);
    // ts.add(23);
    // ts.add(47);
    // System.out.println(ts);

    // Convert a Set into an Array?
    HashSet<Integer> set = new HashSet<>();
    int [] arr = {2,4,3,1,2,7,4};
    for(int i=0; i<arr.length; i++){
        set.add(arr[i]);
    }
    for(Object i : set.toArray()){
        System.out.println(i);
    }
}
}
