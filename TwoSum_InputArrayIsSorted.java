public class TwoSum_InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j < numbers.length; j++){
                if(numbers[j-i] + numbers[j] == target){
                    return new int [] {numbers[j-i] + 1, numbers[j] + 1};
                }
            }
        }
        return null;
    }
}
