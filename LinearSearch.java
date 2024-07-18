public class LinearSearch {
    // Ques. WAP to find if an element is present in an array or not?
    public static boolean SearchKey(int[] nums, int key){
        for(int i : nums){
            if(i == key){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {5,4,1,7,9,2};
        System.out.println(SearchKey(nums, 4));
    }
}