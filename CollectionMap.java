import java.util.HashMap;
public class CollectionMap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(1, 10);
        hm.put(2, 20);
        hm.put(3, 30);
        System.out.println(hm);

        System.out.println(hm.get(1));  // output:- 10

        System.out.println(hm.containsValue(30));
        System.out.println(hm.containsKey(4));

        hm.replace(3, 50);
        System.out.println(hm);

        hm.remove(2);
        System.out.println(hm);
    }
}