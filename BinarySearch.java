import java.util.Scanner;
public class BinarySearch {
    public static boolean Search(int[] arr, int key){
        int start = arr[0];
        int end = arr.length-1;

        while(start<=end){
            int mid = (start + end)/2;
            if(key == arr[mid]){
                return true;
            }
            else if(key > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Key: ");
        int key = sc.nextInt();
        int[] arr = {13,45,64,12,76,43,12};
        if(Search(arr, key)){
            System.out.println("Present");
        }
        else{
            System.out.println("Not Present");
        }
        sc.close();
    }
}
