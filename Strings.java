public class Strings{
    public static void main(String[]args){
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String("Java");
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));
        // System.identityHashCode() is basically used for returning the value where the String are stored.
        // here s1 & s2 will show the address because they both having the same String values.
        // whereas s3 & s4 will show different address because of the use of 'new' keyword.
    }
}