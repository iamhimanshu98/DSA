import java.util.Scanner;

public class CoinDenomination {
    public static int countWays(int[] coins, int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int j = coin; j <= n; j++) {
                dp[j] += dp[j - coin];
            }
        }
        return dp[n];
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of coin denominations: ");
            int m = sc.nextInt();
            int[] coins = new int[m];
            
            System.out.println("Enter the coin denominations:");
            for (int i = 0; i < m; i++) {
                coins[i] = sc.nextInt();
            }
            
            System.out.print("Enter the amount: ");
            int n = sc.nextInt();
            
            System.out.println("Number of ways: " + countWays(coins, n));
        }
    }
}
