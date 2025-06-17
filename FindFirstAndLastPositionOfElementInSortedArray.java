import com.sun.source.doctree.SystemPropertyTree;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int [] nums = {};
        searchRange(nums,0);
    }

    public static int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid = low + (high - low)/2;
        int []result = {-1,-1};
        //Finds first occurrence
        while(low <= high) {
            mid = low + (high - low)/2;
            if(nums[mid] == target){
                result[0] = mid;
                high = mid - 1;
            }else if(target > nums[mid]){
                low = mid + 1;

            } else if (target < nums[mid]){
                high = mid - 1;
            }
        }
        low = 0;
        high = nums.length - 1;
        //Finds Second Occurrence
        while(low <= high) {
            mid = low + (high - low)/2;
            if(nums[mid] == target){
                result[1] = mid;
                low = mid + 1;
            }else if(target > nums[mid]){
                low = mid + 1;

            } else if (target < nums[mid]){
                high = mid - 1;
            }
        }
        System.out.println((Arrays.toString(result)));
        return result;
    }
}

