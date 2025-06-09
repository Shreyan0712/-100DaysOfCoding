import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int [] nums = {-4,-1,0,3,10};
        sortedSquares(nums);
    }
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int pos = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[pos--] = leftSquare;
                left++;
            } else {
                result[pos--] = rightSquare;
                right--;
            }
        }

        return result;
    }

}
