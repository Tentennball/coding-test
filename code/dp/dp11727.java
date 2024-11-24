package code.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dp11727 {
    static int n;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dp = new int[n+1];
        int ans = calculate(dp, n);
        System.out.println(ans);
    }

    private static int calculate(int[] dp, int n) {
        if(n == 1) return 1;
        if(n == 2) return 3;
        dp[1] = 1;
        dp[2] = 3;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2] + dp[i-2])%10007;
        }
        return dp[n];
    }
}