public class PowerOfTwo {

    public static void main (String [] args) {
        isPowerOfTwo(536870912);
    }

    public static boolean isPowerOfTwo(int n) {
        return (n > 0 && ((n & (n - 1)) == 0));

    }

    //BELOW PROVIDED CODE IS THE SAME AS ABOVE BUT WITH VISUAL OUTPUT

//    public static boolean isPowerOfTwo(int n) {
//         if(n > 0 && ((n & (n - 1)) == 0)){
//             System.out.print("Yes, n is a power of 2");
//             return true;
//         }else{
//             System.out.print("No, n is not a power of 2");
//             return false;
//         }
//
//    }

}
