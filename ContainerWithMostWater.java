public class ContainerWithMostWater {
    public static void main(String[] args) {
        int [] nums = {1,8,6,2,5,4,8,3,7};
        maxArea(nums);
    }
    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxArea = 0;
        while(i < j) {
            int width = j - i;
            int minHeigth = Math.min(height[i], height[j]);
            int Area = width * minHeigth;
            maxArea = Math.max(Area, maxArea);

            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        System.out.println(maxArea);
        return maxArea;
    }
}
