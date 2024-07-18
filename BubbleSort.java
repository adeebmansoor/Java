public class BubbleSort {
    public static int[] sort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return  arr;
    }
    public static void main(String[] args) {
        int[] arr = {5,87,23,23,54,2,87,3};
        for(int i : sort(arr)){
            System.out.print(i + " ");
        }
    }
}