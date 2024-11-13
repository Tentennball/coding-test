package code.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class dfsbfs1260 {
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
        dfs(v);
        System.out.println();
        visited = new boolean[n + 1];
        bfs(v);
    }

    static Queue<Integer> q = new LinkedList<>();
    private static void bfs(int v) {
        visited[v] = true;
        q.add(v);
        while (!q.isEmpty()) {
            int cur = q.poll();
            System.out.print(cur + " ");
            for (int i = 1; i <= n; i++) {
                if (!visited[i] && graph[cur][i] == 1) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }

    private static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int i = 1; i <= n; i++) {
            if (graph[v][i] != 1) continue;
            if(!visited[i]) dfs(i);
        }
    }


}
