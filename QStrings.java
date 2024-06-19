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
    // static String lower(String str){
    //     String newstr = "";
    //     for(int i=0; i<=str.length()-1; i++){
    //         if(str.charAt(i)>= 65 && str.charAt(i)<= 90){
    //             int ascii = (int) (str.charAt(i));
    //             int newascii = ascii + 32;
    //             char ch = (char) (newascii);
    //             newstr = newstr + ch;
    //         }
    //         else{
    //             newstr = newstr + str.charAt(i);
    //         }
    //     }
    //     return newstr;
    // }
    // public static void main(String[] args) {
    //     String str = "LOVELY";
    //     System.out.println(lower(str));
    // }

    // Ques 8. Determine if string halves are alike?

    // Ques 9. Decrypt String from Alphabet to Integer Mapping?
    
    // Ques. Valid Palindrome?
    // public static boolean isPalindrome(String s) {
    //     String s1 = s.toLowerCase();
    //     String s2 = "";
    //     for(int i=0; i<s1.length(); i++){
    //         if((s1.charAt(i)>='a' && s1.charAt(i)<='z') || (s1.charAt(i)>='0' && s1.charAt(i)<='9')){
    //             s2 = s2 + s1.charAt(i);
    //         }
    //     }
    //     String reverse = "";
    //     for(int i=s2.length()-1; i>=0; i--){
    //         reverse = reverse + s2.charAt(i);
    //     }
    //     if(reverse.equals(s2)){
    //         return true;
    //     }
    //     return false;
    // }
    // public static void main(String[] args) {
    //     String s = "0P";
    //     if(isPalindrome(s)){
    //         System.out.println("true");
    //     }
    //     else{
    //         System.out.println("false");
    //     }

    // Ques. Merge Strings Alternately?

    // Ques. Length of last word?
    static int lengthOfLastWord(String s) {
        int x = s.length()-1;
        while(s.charAt(x)== ' '){
            x--;
        }
        int count = 0;
        while(x>=0 && s.charAt(x)!= ' '){
            count++;
            x--;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "Hello World  ";
        System.out.println(lengthOfLastWord(s));
    }
}