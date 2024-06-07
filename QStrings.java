public class QStrings {
    // Ques 1. Defanging an IP address?
    // Ex:- In:- address = "1.1.1.1"
    //      Out:- "1[.]1[.]1[.]1"
    // static void defangIPaddr(String address) {
    //     System.out.println(address.replace(".","[.]"));
    // }
    // public static void main(String[] args) {
    //     String address = "1.1.1.1";
    //     defangIPaddr(address);
    // }

    // Ques 2. Shuffle String?

    // Ques 3. Goal parser interpretation?

    // Ques 4. Count Items Matching a rule?

    // Ques 5. Sorting the Sentence?

    // Ques 6. Check if two strings are equivalent?

    // Ques 7. To Lower Case?
    static String lower(String str){
        String newstr = "";
        for(int i=0; i<=str.length()-1; i++){
            if(str.charAt(i)>= 65 && str.charAt(i)<= 90){
                int ascii = (int) (str.charAt(i));
                int newascii = ascii + 32;
                char ch = (char) (newascii);
                newstr = newstr + ch;
            }
            else{
                newstr = newstr + str.charAt(i);
            }
        }
        return newstr;
    }
    public static void main(String[] args) {
        String str = "LOVELY";
        System.out.println(lower(str));
    }
}

