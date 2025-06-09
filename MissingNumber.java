public class MissingNumber {
    public static void main(String[] args) {
        int [] nums = {3,0,1};
        missingNumber(nums);
    }

    public static int missingNumber(int[] nums) {
        int sum = 0;
        quickSort(nums,0,nums.length-1);
        for(int i :nums){
            if(i != sum){
                return sum;
            }else {
                sum += 1;
            }
        }
        return sum;
    }

    public static int binarySearch(int nums[]){
        int target = 0;
        int start = 0;
        int end = nums.length-1;
        int mid = (start + end)/2;

        while(start <= end) {
            mid = (start + (end - start) / 2);

            if (target > mid) {
                start = mid + 1; // 2nd Half
            } else if(target < mid) {
                end = mid - 1; // 1st Half
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

}
