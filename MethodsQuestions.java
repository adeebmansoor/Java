public class MethodsQuestions{

    //Question 1: WAP to print Natural Numbers upto n? (Natural no. - 1 to +infinity)
    // static void disp(int n){
    //     for(int i=1; i<=n; i++){
    //         System.out.println(i);
    //     }
    // }
    // public static void main(String[] args) {
    //     int n = 10;
    //     disp(n);
    // }

    // (Using Scanner Object)
    // static void disp(int n){
    //     for(int i=1; i<=n; i++){
    //         System.out.println(i);
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the Number: ");
    //     int n = sc.nextInt();
    //     disp(n);
    // }

    //Question 2: WAP to print Whole Numbers upto 10th term? (Whole no. - 0 to +infinity)
    static void disp(int n){
        for(int i=0; i<n; i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        disp(10);
    }
}