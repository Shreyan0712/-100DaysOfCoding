public class FibonaciNumber {
    public static void main(String[] args) {
        fib(7);
    }

    private static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.printf("F(%d) is: %d", n, b);
        return b;
    }
}
