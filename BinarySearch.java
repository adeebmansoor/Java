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
        int[] arr = {13,45,64,12,76,43,12};
        System.out.println(Search(arr, 45));
    }
}
