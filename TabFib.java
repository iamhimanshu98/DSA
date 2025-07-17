public class TabFib {
    public static int tabfib(int n) {
        int[] m = new int[n + 1];
        m[0] = 0;
        m[1] = 1;
        for (int i = 2; i <= n; i++) {
            m[i] = m[i - 1] + m[i - 2];
        }
        return m[n];
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println("The value of fib " + n + " is : " + tabfib(n));
    }
}
