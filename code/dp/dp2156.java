package code.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dp2156 {
    static int[][] drinkCase;
    static int[] wine;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        wine = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            wine[i] = Integer.parseInt(br.readLine());
        }
        drinkCase = new int[3][n+1];

        int ans = calculateMax(wine, drinkCase, n);
        System.out.println(ans);
    }

    private static int calculateMax(int[] wine, int[][] drinkCase, int n) {
        if(n == 1) return wine[1];
        if(n == 2) return wine[1] + wine[2];
        drinkCase[0][2] = wine[1];
        drinkCase[1][2] = wine[2];
        drinkCase[2][2] = wine[1] + wine[2];
        for (int i = 3; i <= n; i++) {
            drinkCase[0][i] = compareMax(drinkCase[0][i-1], drinkCase[1][i-1], drinkCase[2][i-1]); // i번째 미선택 경우
            drinkCase[1][i] = drinkCase[0][i-1] + wine[i];//i번째 선택, 이전꺼 미선택
            drinkCase[2][i] = drinkCase[1][i-1] + wine[i];//i번째 선택, 이전꺼 선택
        }
        return compareMax(drinkCase[0][n], drinkCase[1][n], drinkCase[2][n]);
    }

    private static int compareMax(int case1, int case2, int case3){
        return Math.max(case1, Math.max(case2, case3));
    }
}
