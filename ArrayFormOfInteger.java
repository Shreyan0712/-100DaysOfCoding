import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayFormOfInteger {
    public static void main(String[] args) {
         int [] arr = {9,9,9,9,9,9,9,9,9,9};
        addToArrayForm(arr,1);
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> myList = new ArrayList<>();
        int i = num.length- 1;
        while(i >= 0|| k > 0){
            if(i >= 0){
                k += num[i];
            }
            myList.add(k%10);
            k /= 10;
            i--;
        }
        Collections.reverse(myList);
        return myList;
    }
}
