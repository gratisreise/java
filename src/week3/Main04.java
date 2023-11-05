package week3;

import java.util.*;

public class Main04 {
    static final int INF = Integer.MAX_VALUE;
    static int ret = -1, n, m, y, x, sy, sx;
    static char[][] a;
    static int[][] vis_f, vis_j;
    static final int[] dy = {0, 1, 0, -1};
    static final int[] dx = {-1, 0, 1, 0};
    static class Pair{
        int f, s;
        public Pair(int f, int s){
            this.f = f;
            this.s = s;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();
        a = new char[n + 1][m + 1];
        vis_f = new int[n + 1][m + 1];
        vis_j = new int[n + 1][m + 1];

        Queue<Pair> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                a[i][j] = s.charAt(j);
                vis_f[i][j] = INF;
                vis_j[i][j] = INF;
                if (a[i][j] == 'F') {
                    vis_f[i][j] = 1;
                    q.add(new Pair(i, j));
                }
                if (a[i][j] == 'J') {
                    vis_j[i][j] = 1;
                    sy = i;
                    sx = j;
                }
            }
        }

        while (!q.isEmpty()) {
            Pair p = q.remove();
            y = p.f;
            x = p.s;
            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];
                if (ny < 0 || nx < 0 || ny >= n || nx >= m) continue;
                if (a[ny][nx] == '#' || vis_f[ny][nx] != INF) continue;
                vis_f[ny][nx] = vis_f[y][x] + 1;
                q.add(new Pair(ny, nx));
            }
        }

        q.add(new Pair(sy, sx));
        while (!q.isEmpty()) {
            Pair p = q.remove();
            y = p.f;
            x = p.s;
            if (y == 0 || x == 0 || y == n - 1 || x == m - 1) {
                ret = vis_j[y][x];
                break;
            }
            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];
                if (ny < 0 || nx < 0 || ny >= n || nx >= m) continue;
                if (a[ny][nx] == '#' || vis_j[ny][nx] != INF) continue;
                if (vis_j[y][x] + 1 >= vis_f[ny][nx]) continue;
                vis_j[ny][nx] = vis_j[y][x] + 1;
                q.add(new Pair(ny, nx));
            }
        }

        if (ret == -1) System.out.println("IMPOSSIBLE");
        else System.out.println(ret);
    }
}
