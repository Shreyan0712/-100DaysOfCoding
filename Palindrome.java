import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(long x){
        long Number = x;
        long numOfDigits;
        long result = 0;

        System.out.println("Given Number: " + x);

        numOfDigits = (long)Math.log10(x) + 1;
        System.out.println("Number of digits = " + numOfDigits);

        for(long i = numOfDigits; i > 0; i--) {
            result += (long) ((Number % 10)*(Math.pow(10, i-1)));
            Number =  (Number/10);
            if(i == 1) {
                result += (Number);
                Number = (Number/10);
            }
        }

        System.out.println("After reversing: " + result);

        if(Number < 0) {
            System.out.println("No, " + x + " is not a Palindrome" );
            return false;
        } else if(result == x){
            System.out.println("Yes, " + x + " is a Palindrome" );
            return true;
        }else {
            System.out.println("No, " + x + " is not a Palindrome" );
            return false;
        }
    }

    public static void main (String[] args) {
        isPalindrome(2_147_483_648L);
    }

}
