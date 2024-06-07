public class MethodsEven_Odd{

    // Ques: Check whether the number is Even or Odd?
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
    //     if (isEven(n)){
    //         System.out.println("The Number is Even");
    //     } else{
    //         System.out.println("The Number is Odd");
    //     }
    // }

    // Ques: WAP to print Even Numbers between 1 to 100 & Odd Numbers between 20 to 35?
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
    //     for(int i=1; i<=100; i++){
    //         if(isEven(i)){
    //             System.out.println(i);
    //         }
    //     }
    //     for(int j=20; j<=35; j++){
    //         if(isOdd(j)){
    //             System.out.println(j);
    //         }
    //     }
    // }

    // WAP tp print alternate Even Numbers from 1 to 100 & Odd Numbers from 1 to 100?
    static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    static boolean isOdd(int n){
        if(n%2!=0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        for(int i=2; i<=100; i++){
            if(isEven(i)){
                System.out.println(i);
                i=i+2;
            }
        }
        for(int j=1; j<=100; j++){
            if(isOdd(j)){
                System.out.println(j);
                j=j+2;
            }
        }
    }
}