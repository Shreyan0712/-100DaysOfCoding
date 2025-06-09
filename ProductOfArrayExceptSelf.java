import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int [] nums = {-1,1,0,-3,3};
        productExceptSelf(nums);
    }
    public static int[] productExceptSelf(int[] nums) {
        int [] output = new int [nums.length];
        output[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            output[i] = output[i-1] * nums[i-1];
        }
        int postfixProduct = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            output[i] *= postfixProduct;
            postfixProduct *= nums[i];
        }
        System.out.println(Arrays.toString(output));
        return output;
    }

}
