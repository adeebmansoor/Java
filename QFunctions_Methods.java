public class QFunctions_Methods{

    // Ques1. Print the smallest & largest of the three numbers?
    // static int isLargest(int a, int b, int c){
    //     if(a>=b && a>=c){
    //         return a;
    //     }
    //     else if(b>=c){
    //         return b;
    //     }
    //     else{
    //         return c;
    //     }
    // }
    // static int isSmallest(int a, int b, int c){
    //     if(a<=b && a<=c){
    //         return a;
    //     }
    //     else if(b<=c){
    //         return b;
    //     }
    //     else{
    //         return c;
    //     }
    // }
    // public static void main(String[]args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the Numbers: ");
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int c = sc.nextInt();
    //     int largest = isLargest(a,b,c);
    //     int smallest = isSmallest(a,b,c);
    //     System.out.println("The Largest No. is: " +largest);
    //     System.out.println("The Smallest No. is: " +smallest);
    //     sc.close();
    // }

    // Ques2. Define a program to find out whether a given number is even or odd?
    // static boolean isEven(int n){
    //     if(n%2==0){
    //         return true;
    //     }
    //     return false;
    // }
    // static boolean isOdd(int n){
    //     if(n%2!=0){
    //         return true;
    //     }
    //     return false;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the Number: ");
    //     int n = sc.nextInt();
    //     if(isEven(n)){
    //         System.out.println("The Number is Even");
    //     }
    //     else{
    //         System.out.println("The Number is Odd");
    //     }
    //     sc.close();
    // }

    // Ques3. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote?
    // static boolean isEligible(int n){
    //     if(n>=18){
    //         return true;
    //     }
    //     return false;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the Age: ");
    //     int n = sc.nextInt();
    //     if(isEligible(n)){
    //         System.out.println("Eligible to Vote");
    //     }
    //     else{
    //         System.out.println("Not Eligible to Vote");
    //     }
    //     sc.close();
    // }

    // Ques 4. Write a program to print the sum of two numbers entered by user by defining your own method?
    // static void Addition(int a, int b){
    //     int sum = a + b;
    //     System.out.println(sum);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the First Number: ");
    //     int a = sc.nextInt();
    //     System.out.print("Enter the Second Number: ");
    //     int b = sc.nextInt();
    //     Addition(a,b);
    //     sc.close();
    // }

    // Ques 5. Define a method that returns the product of two numbers entered by user?
    // static void Product(int a, int b){
    //     int prod = a * b;
    //     System.out.println(prod);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the First Number: ");
    //     int a = sc.nextInt();
    //     System.out.print("Enter the Second Number: ");
    //     int b = sc.nextInt();
    //     Product(a,b);
    //     sc.close();
    // }

    // Ques 6. Write a program to print the circumference and area of a circle of radius entered by user by defining your own method?
    // static void circumference(float r){
    //     float circum = 2 * 3.14f * r;
    //     System.out.println("The Circumference of the Circle is: " + circum +" cm");
    // }
    // static void area(float r){
    //     float ar = 3.14f * r * r;
    //     System.out.println("The Arae of the Circle is: " + ar +" cm^2");
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the Radius of the Circle(in cm): ");
    //     float r = sc.nextFloat();
    //     circumference(r);
    //     area(r);
    //     sc.close();
    // }

    // Ques 7. Define a method to find out if a number is prime or not?
    // static boolean isPrime(int n){
    //     if(n<=1){
    //         return false;
    //     }
    //     for(int i=2; i<n-1; i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the Number: ");
    //     int n = sc.nextInt();
    //     if(isPrime(n)){
    //         System.out.println(n + " is a Prime Number");
    //     }
    //     else{
    //         System.out.println(n + " is not a Prime Number");
    //     }
    //     sc.close();
    // }

    // Ques 8. Write a program that will ask the user to enter his/her marks (out of 100).
    // Define a method that will display grades according to the marks entered as below:
    //  Marks        Grade
    // 91-100         AA
    // 81-90          AB
    // 71-80          BB
    // 61-70          BC
    // 51-60          CD
    // 41-50          DD
    // <=40          Fail
    // static void Marks(int n){
    //     if(n>100){
    //         System.out.println("Please re-enter the correct Marks");
    //     }
    //     else if(n>90){
    //         System.out.println("Your Grade is AA");
    //     }
    //     else if(n>80){
    //         System.out.println("Your Grade is AB");
    //     }
    //     else if(n>70){
    //         System.out.println("Your Grade is BB");
    //     }
    //     else if(n>60){
    //         System.out.println("Your Grade is BC");
    //     }
    //     else if(n>50){
    //         System.out.println("Your Grade is CD");
    //     }
    //     else if(n>40){
    //         System.out.println("Your Grade is DD");
    //     }
    //     else if(n<=40){
    //         System.out.println("Sorry you Fail");
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the Marks: ");
    //     int n = sc.nextInt();
    //     Marks(n);
    //     sc.close();
    // }

    // Ques 9. Write a program to print the factorial of a number by defining a method named 'Factorial'?
    // static int Factorial(int n){
    //     int fact = 1;
    //     for(int i=1; i<=n; i++){
    //         fact *= i;
    //     }
    //     return fact;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the Number: ");
    //     int n = sc.nextInt();
    //     int result = Factorial(n);
    //     System.out.printf("The Factorial of %d! is : ", n );
    //     System.out.println();
    //     for(int i=n; i>=1; i--){
    //         System.out.print(i+"* ");
    //     }
    //     System.out.println("= " + result);
    //     sc.close();
    // }

    // Ques 10. Write a function to find if a number is a palindrome or not. Take number as parameter.
    // static boolean isPalindrome(int n){
    //     int reverse = 0;
    //     int temp = n;
    //     while (temp!=0) {
    //         reverse = (reverse * 10) + (temp % 10);
    //         temp /= 10;
    //     }
    //     return (reverse == n);
    // }
    // public static void main(String[] args) {
    //     if(isPalindrome(12321) == true){
    //         System.out.println("Yes it is a Palindrome");
    //     }
    //     else{
    //         System.out.println("No it is not a Palindrome");
    //     }
    // }

    // Ques 11. Write a function to check if a given triplet is a Pythagorean triplet or not?
    // static boolean isTriplet(int ar[], int n){
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<n; j++){
    //             for(int k=0; k<n; k++){
    //                 int x = ar[i] * ar[i];
    //                 int y = ar[j] * ar[j];
    //                 int z = ar[k] * ar[k];

    //                 if((x == y + z) || (y == x + z) || (z == x + y)){
    //                     return true;
    //                 }
    //             }
    //         }
    //     }
    //     return false;
    // }
    // public static void main(String[] args) {
    //     int arr[] = {10,4,6,12,5};
    //     int arr_size = arr.length;
    //     if(isTriplet(arr, arr_size)){
    //         System.out.println("Yes");
    //     }
    //     else{
    //         System.out.println("No");
    //     }
    // }

    // Ques 12. Write a function that returns all prime numbers between two given numbers?
    // static boolean isPrime(int n){
    //     if(n<=1){
    //         return false;
    //     }
    //     for(int i=2; i<n-1; i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the First Number: ");
    //     int lower = sc.nextInt();
    //     System.out.print("Enter the Second Number: ");
    //     int upper = sc.nextInt();
    //     System.out.printf("\nPrime numbers between %d and %d are: ", lower, upper);

    //     for(int i=lower; i<=upper; i++){
    //         if(isPrime(i)){
    //             System.out.print(i +" ");
    //         }
    //     }
    //     sc.close();
    // }

    // Ques 13. Write a function that returns the sum of first n natural numbers?
    static int NaturalNumbers(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.printf("The Sum of %d Natural Numbers is: " + NaturalNumbers(n) , n);
    }
}