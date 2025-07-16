public class Fib {
    public static int memofib(int n) {
        int[] dp = new int[n + 1];
        int result;
        if (dp[n] == 0) {
            if (n <= 1)
                result = n;
            else
                result = memofib(n - 1) + memofib(n - 2);
            dp[n] = result;
        }
        return dp[n];
    }

    public static void main(String args[]) {
        int n = 10;
        System.out.println("Fib of " + n + " is : " + memofib(n));
    }
}
