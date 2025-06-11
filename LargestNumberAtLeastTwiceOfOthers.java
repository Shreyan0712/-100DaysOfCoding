public class LargestNumberAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        int [] nums = {3, 6, 1, 0};
        dominantIndex(nums);
    }
    public static int dominantIndex(int[] nums) {
        int maxElement = Integer.MIN_VALUE;
        int maxElementIndex = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > maxElement){
                maxElement = nums[i];
                maxElementIndex = i;
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] * 2 > maxElement && i != maxElementIndex) {
                return -1;
            }
        }
        return  maxElementIndex;
    }
}
