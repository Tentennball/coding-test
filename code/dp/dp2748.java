package code.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dp2748 {
    static int n;
    static int[] dp = new int[91];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dp[1] = 1;
        dp[2] = 1;
        dpFibo(n, dp);
        System.out.println(dp[n]);
    }

    private static void dpFibo(int n, int[] dp) {
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
    }
}
