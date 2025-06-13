    public static void main(String[] args) {
        int [] nums = {2,4,-2,-3};
        increasingTriplet(nums);

    }
    public static boolean increasingTriplet(int[] nums) {
        int numI = Integer.MAX_VALUE;
        int numJ = Integer.MAX_VALUE;
        for(int i : nums){
            if(i <= numI) {
                numI = i;
            } else if(i > numI && i <= numJ) {
                numJ = i;
            }
            if(i > numJ){
                return true;
            }
        }
        return false;
    }
}
