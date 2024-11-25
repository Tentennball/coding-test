package code.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dfsbfs2606 {
    static int year = 0;
    static int width, height;
    static int[][] iceberg;
    static int[][] seaCount;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        height = Integer.parseInt(st.nextToken());
        width = Integer.parseInt(st.nextToken());
        iceberg = new int[height][width];
        for (int i = 0; i < height; i++) {
            input = br.readLine();
            st = new StringTokenizer(input);
            for (int j = 0; j < width; j++) {
                iceberg[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(iceberg[i][j]);
            }
            System.out.println();
        }
        ;

        // 빙하높이 입력

        // 인접한 바다 개수 할당(2차원 배열)
        while (true) {
            // year 더하기
            // year * 바다개수만큼 빼기 (음수가 되면 0으로 바꿉니다)

            // dfs로 만약 count가 1 초과면 break;

            // 다 0이면 year 0으로 하고 break;
            break;
        }
        System.out.println(year);
    }

}
