// import java.util.Scanner;

public class StringsMethodsQues {
    // Ques 1. WAP to find the length of a String without using the length function (length())?
    // static int count(String str){
    //     int count = 0;
    //     for(char ch : str.toCharArray()){
    //         count++;
    //     }
    //     return count;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the String: ");
    //     String str = sc.nextLine();
    //     System.out.println(count(str));
    //     sc.close();
    // }

    // Ques 2. WAP to check if both the Strings are equal without using equals function (equals())?
    // static boolean isEqual(String str1, String str2){
    //     if(str1.length() != str2.length()){
    //         return false;
    //     }
    //     for(int i=0; i<=str1.length()-1; i++){
    //         if(str1.charAt(i) != str2.charAt(i)){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the First String: ");
    //     String str1 = sc.nextLine();
    //     System.out.print("Enter the Second String: ");
    //     String str2 = sc.nextLine();
    //     if(isEqual(str1, str2)){
    //         System.out.println("Both the Strings are equal");
    //     }
    //     else{
    //         System.out.println("Both the Strings are not equal");
    //     }
    //     sc.close();
    // }

    // Ques 3. WAP to check if both the Strings are equal ignoring cases & without using equals function (equals())?
    // static boolean isEqual(String str1, String str2){
    //     if(str1.length() != str2.length()){
    //         return false;
    //     }
    //     String str3 = str1.toLowerCase();
    //     String str4 = str2.toLowerCase();
    //     for(int i=0; i<=str3.length()-1; i++){
    //         if(str3.charAt(i) != str4.charAt(i)){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the First String: ");
    //     String str1 = sc.nextLine();
    //     System.out.print("Enter the Second String: ");
    //     String str2 = sc.nextLine();
    //     if(isEqual(str1, str2)){
    //         System.out.println("Both the Strings are equal");
    //     }
    //     else{
    //         System.out.println("Both the Strings are not equal");
    //     }
    //     sc.close();
    // }

    // Ques 4. WAP to convert lowerCase String to upperCase String without using the toUpperCase() Method?
    // static String upper(String str){
    //     String newstr = " ";
    //     for(int i=0; i<=str.length()-1; i++){
    //         if(str.charAt(i)>='a' && str.charAt(i)<='z'){
    //             int ascii = (int) (str.charAt(i));
    //             int newascii = ascii - 32;
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
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the String: ");
    //     String str = sc.nextLine();
    //     System.out.println(upper(str));
    //     sc.close();
    // }

    // Ques 5. WAP to convert lowerCase String to upperCase String excluding numbers & special symbols & also without using the toUpperCase() Method?
    // Hint:- using their ascii values
    // INPUT:- java@754program, OUTPUT:- JAVAPROGRAM
    // static String upper(String str){
    //     String newstr = " ";
    //     for(int i=0; i<=str.length()-1; i++){
    //         if(str.charAt(i)>='a' && str.charAt(i)<='z'){
    //             int ascii = (int) (str.charAt(i));
    //             int newascii = ascii - 32;
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
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the String: ");
    //     String str = sc.nextLine();
    //     String s1 = upper(str);
    //     for(int i=0; i<=s1.length()-1; i++){
    //         if(s1.charAt(i)>='A' && s1.charAt(i)<='Z'){
    //             System.out.print(s1.charAt(i));
    //         }
    //     }
    //     sc.close();
    // }

    // Ques 6. WAP to convert first half of the String into UpperCase & second half into LowerCase?
    // But inserting the space between UpperCase & LowerCase.
    // INPUT:- hello programmers, OUTPUT:- HELLOPR ogrammers
    // static String upper(String str){
    //     String upperString = "";
    //     for(int i=0; i<str.length(); i++){
    //         if(str.charAt(i)>='a' && str.charAt(i)<='z'){
    //             int ascii = (int) (str.charAt(i));
    //             int newascii = ascii - 32;
    //             char ch = (char) (newascii);
    //             upperString = upperString + ch;
    //         }
    //         else{
    //             upperString = upperString + str.charAt(i);
    //         }
    //     }
    //     return upperString;
    // }
    // static String lower(String str){
    //     String lowerString = "";
    //     for(int i=0; i<str.length(); i++){
    //         if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
    //             int ascii = (int) (str.charAt(i));
    //             int newascii = ascii + 32;
    //             char ch = (char) (newascii);
    //             lowerString = lowerString + ch;
    //         }
    //         else{
    //             lowerString = lowerString + str.charAt(i);
    //         }
    //     }
    //     return lowerString;
    // }
    // static String removeSpace(String str){
    //     String newstr = "";
    //     for(int i=0; i<str.length(); i++){
    //         if(str.charAt(i)!=' '){
    //             newstr = newstr + str.charAt(i);
    //         }
    //     }
    //     return newstr;
    // }
    // static String convert(String str){
    //     String firstHalf = "";
    //     String secondHalf = "";
    //     int mid = str.length()/2;
    //     for(int i=0; i<=mid; i++){
    //         firstHalf = firstHalf + str.charAt(i);
    //     }
    //     for(int i=mid+1; i<str.length(); i++){
    //         secondHalf = secondHalf + str.charAt(i);
    //     }
    //     return (upper(removeSpace(firstHalf))+" "+lower(removeSpace(secondHalf)));
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the String: ");
    //     String str = sc.nextLine();
    //     System.out.println(convert(str));
    //     sc.close();
    // }

    // Ques 7. WAP to check valid email address?
    // public static boolean check(String email){
    //     String[] word = email.split("@");
    //     char[] ch = word[0].toCharArray();
    //     for(char c : ch){
    //         if(c >= 'a' && c <= 'z' || c >= '0' && c <= '9' || c == '.' && c == ' '){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the Email: ");
    //     String email = sc.nextLine();
    //     if(check(email) == true){
    //         System.out.println("This Email is valid");
    //     }
    //     else{
    //         System.out.println("This Email is not valid");
    //     }
    // }

    // Ques 8. WAP to replace a word from a given String?
    // Ex:- Input:- Bhopal, is the city of pools.
    //      Output:- Bhopal, is the city of lakes.
    // public static void main(String[]args){
    //     String s1 = "Bhopal, is the city of pools.";
    //     System.out.println(s1.replace("pools","lakes"));
    // }

    // Another Method:-
    // public static String ReplaceWord(String str, String replaceWord, String replace){
    //     String[] word = str.split(" ");
    //     StringBuilder sb = new StringBuilder();
    //     for(int i=0; i<word.length; i++){
    //         if(replaceWord.equals(word[i])){
    //             sb.append(replace);
    //             sb.append(" ");
    //         }
    //         else{
    //             sb.append(word[i]);
    //             sb.append(" ");
    //         }
    //     }
    //     return new String(sb);
    // }
    // public static void main(String[] args) {
    //     String str = "Bhopal, is the city of Pools.";
    //     String replaceWord = "Pools";
    //     String replace = "Lakes";
    //     System.out.println(ReplaceWord(str, replaceWord, replace));
    // }
}
