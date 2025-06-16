import java.util.HashMap;

public class FindLuckyIntegerInAnArray {
    public static void main(String[] args) {
        int [] arr = {2,2,3,4};

    }
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Step 1: Count frequencies
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxLucky = -1;

        // Step 2: Find the largest lucky integer
        for (int key : freqMap.keySet()) {
            if (key == freqMap.get(key)) {
                maxLucky = Math.max(maxLucky, key);
            }
        }

        return maxLucky;
    }
}
