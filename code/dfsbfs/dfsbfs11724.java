package code.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dfsbfs11724 {
    static boolean[] visited;
    static int[][] graph;
    static int n, m;
    static int a, b;
    static int ans = 0;
    static int start;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n+1];
        graph = new int[n+1][n+1];

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        for (int i = 1; i <= n; i++) {
            if(visited[i]) continue;
            start = i;
            ans++;
            dfs(i);
        }
        System.out.println(ans);
    }

    private static void dfs(int v) {
        if(start == v && visited[v]) {
            return;
        }
        visited[v] = true;
        for (int i = 1; i <= n; i++) {
            if(graph[v][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }
}
