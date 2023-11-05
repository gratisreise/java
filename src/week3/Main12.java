package week3;

import java.util.*;

public class Main12 {
    static int n, m, ret;
    static int[] visited = new int[100];
    static char[][] a = new char[21][21];
    static final int[] dy = { -1, 0, 1, 0 };
    static final int[] dx = { 0, 1, 0, -1 };

    static void go(int y, int x, int cnt) {
        ret = Math.max(ret, cnt);
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (ny < 0 || nx < 0 || ny >= n || nx >= m) continue;
            if (visited[a[ny][nx]] != 0) continue;
            visited[a[ny][nx]] = 1;
            go(ny, nx, cnt + 1);
            visited[a[ny][nx]] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                a[i][j] = s.charAt(j);
            }
        }

        visited[a[0][0]] = 1;
        go(0, 0, 1);

        System.out.println(ret);
    }
}
