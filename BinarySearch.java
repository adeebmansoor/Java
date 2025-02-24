import java.util.Arrays;
public class BinarySearch {
    static boolean Search(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            int mid = start + (end - start)/2;
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
        int[] arr = {13,45,64,12,76,43,12};
        Arrays.sort(arr);
        System.out.println(Search(arr, 86));
    }
}
