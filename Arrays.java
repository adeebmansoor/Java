import java.util.Scanner;
public class Arrays{
//     public static void main(String[] args) {
//         // This is Static Initialization of Array
//         int [] arr = {1,2,4,6,8};
//         for(int x : arr){
//             System.out.println(x);
//         }
//     }
// }

// Ques. Printing default values of respective data types?
    // public static void main(String[]args){
    //     // Declare of array
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the size of array: ");
    //     int size = sc.nextInt();
    //     // Creation of array
    //     int[] arr= new int[size];
    //     // Display of array
    //     for(int x : arr){
    //         System.out.println(x);
    //     }
    //     sc.close();
    // }

    // Ques. Printing values of arrays taken from user?
    // public static void main(String[]args){
    //     // Declare of array
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the size of array: ");
    //     int size = sc.nextInt();
    //     // Creation of array
    //     int[] arr= new int[size];
    //     // Take user input in array
    //     System.out.print("Enter the values of array: ");
    //     for(int i=0; i<size; i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     // Display the array
    //     for (int x : arr) {
    //         System.out.println(x);
    //     }
    //     sc.close();
    // }

    // Ques: WAP to reverse an array without creating new array?
    // static int[] reverseArray(int [] arr){
    //     int i = 0;
    //     int j = arr.length-1;
    //     while(i<=j){
    //         int temp = arr[i];
    //         arr[i] = arr [j];
    //         arr[j] = temp;
    //         i++;
    //         j--;
    //     }
    //     return arr;
    // }
    // public static void main(String[] args) {
    //     int[] arr = {10,5,2,7,11};
    //     for(int x : reverseArray(arr)){
    //         System.out.print(x + " ");
    //     }
    // }

    // Ques. WAP to find the sum of elements of array?
    // static int findSum(int[] arr){
    //     int sum = 0;
    //     for(int i=0; i<arr.length; i++){
    //         sum = sum + arr[i];
    //     }
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     int[] arr = {10, 2, 5, 6, 1};
    //     System.out.println("The total sum of the elements of Array is: " + findSum(arr));
    // }

    // Ques. WAP to count the number of even & odd elements in an array?
    // public static void count(int[] arr){
    //     int even = 0 , odd = 0;
    //     for(int x : arr){
    //         if(x%2==0){
    //             even++;
    //         }
    //         else{
    //             odd++;
    //         }
    //     }
    //     System.out.println("Even Numbers are: " + even);
    //     System.out.println("Odd Numbers are: " + odd);
    // }
    // public static void main(String[] args) {
    //     int [] arr = {2,13,11,1,6,8,10,15};
    //     count(arr);
    // }

    // Ques. Inserting & Displaying the elements in 2D array?
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     // Take row & col as input:
    //     System.out.print("Enter the value of rows: ");
    //     int row = sc.nextInt();
    //     System.out.print("Enter the value of cols: ");
    //     int col = sc.nextInt();

    //     // Defining of 2D array with row & col
    //     int[][] arr = new int[row][col];

    //     // Inserting elements in array
    //     System.out.print("Enter the elements of array: ");
    //     for(int i=0; i<row; i++){
    //         for(int j=0; j<col; j++){
    //             arr[i][j] = sc.nextInt();
    //         }
    //     }

    //     // Display of array
    //     for(int i=0; i<row; i++){
    //         for(int j=0; j<col; j++){
    //             System.out.print(arr[i][j]+ " ");
    //         }
    //         System.out.println();
    //     }
    //     sc.close();
    // }

    // Ques. WAP to find the addition of two matrices?
    static void sumMatrix(int[][] arr1, int[][] arr2, int row1, int row2, int col1, int col2){
        // Creation of 3rd array matrix
        int[][] sumArray = new int[row1][col1]; // rows & cols of sumArray will also be equal to arr1 & arr2
        if(row1==row2 && col1==col2){
            for(int i=0; i<row1; i++){
                for(int j=0; j<col2; j++){
                    sumArray[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
        }
        // Display of sumArray
        for(int i=0; i<row1; i++){
            for(int j=0; j<col2; j++){
                System.out.print(sumArray[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creation of 1st array matrix
        System.out.print("Enter the value of row of first matrix: ");
        int row1 = sc.nextInt();
        System.out.print("Enter the value of col of first matrix: ");
        int col1 = sc.nextInt();
        int[][] arr1 = new int[row1][col1];
        for(int i=0; i<row1; i++){
            for(int j=0; j<col1; j++){
                System.out.print("Enter the elements of 1st array: ");
                arr1[i][j] = sc.nextInt();
            }
        }
        // Creation of 2nd array matrix
        System.out.print("Enter the value of row of second matrix: ");
        int row2 = sc.nextInt();
        System.out.print("Enter the value of col of second matrix: ");
        int col2 = sc.nextInt();
        int[][] arr2 = new int[row2][col2];
        for(int i=0; i<row2; i++){
            for(int j=0; j<col2; j++){
                System.out.print("Enter the elements of 1st array: ");
                arr2[i][j] = sc.nextInt();
            }
        }
        sumMatrix(arr1, arr2, row1, row2, col1, col2);
        sc.close();
    }
}