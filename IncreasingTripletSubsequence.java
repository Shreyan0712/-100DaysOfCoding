public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        int [] nums = {2,4,-2,-3};
        increasingTriplet(nums);

    }
    public static boolean increasingTriplet(int[] nums) {
        int numI = Integer.MAX_VALUE;
        int numJ = Integer.MAX_VALUE;
        int numK = 0;

        for(int i : nums){
            if(i < numI) {
                numI = i;
            } else if(i > numI && i < numJ) {
                numJ = i;
            }
            if(i > numJ){
                System.out.println(" Found Triplet ");
                return true;
            }
        }
        System.out.println(" No Triplet Found ");
        return false;
    }
}
