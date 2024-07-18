public class QArrays {

    // Ques. Given an array nums. Find out how many numbers in an array smaller than it?
    public static void CountLarge(int[] nums, int arr[]){
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            arr[i] = count;
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int nums[] = {8,1,2,2,3};
        int arr[] = new int[nums.length];
        CountLarge(nums, arr);
    }
}
