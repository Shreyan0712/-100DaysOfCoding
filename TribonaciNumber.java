public class TribonaciNumber {
    public static void main (String [] args) {
        tribonacci(25);
    }
    public static int tribonacci(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 1;
        }
        int a = 0;
        int b = 1;
        int c = 1;
        for(int i = 3; i <= n; i++){
            int temp = a + b +c;
            a = b;
            b = c;
            c = temp;
        }
        System.out.printf("Tribonacci of F(%d) is: %d",n,c);
        return c;
    }
}
