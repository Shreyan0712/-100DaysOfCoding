import java.util.Arrays;

public class MaximumProductofTwoElementsinArray {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 2};
        maxProduct(nums);
    }

    public static int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;

        for(int i: nums) {
            if(i > max1) {
                max2 = max1;
                max1 = i;
            }else if(i > max2) {
                max2 = i;
            }
        }
        return(max1 -1) * (max2 -1);
    }
}

