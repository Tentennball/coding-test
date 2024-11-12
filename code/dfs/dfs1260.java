package code.dfs;

import java.util.Scanner;

public class dfs1260 {
    static int n, m, v;
    static boolean[] visited;
    static int[][] graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();
        graph = new int[n + 1][n + 1];

        visited = new boolean[n + 1];

        for (int i = 1; i <= m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        visit(v);
    }

    private static void visit(int v) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int i = 1; i <= n; i++) {
            if (graph[v][i] != 1) continue;
            if(!visited[i]) visit(i);
        }
    }


}
