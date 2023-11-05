package week3;

import java.util.Scanner;

public class Main16 {
    static int n;
    static int ret = 1000000000;
    static int[][] p;
    static int[][] v;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};

    static boolean check(int y, int x) {
        if (v[y][x] != 0) return false;
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (v[ny][nx] != 0) return false;
        }
        return true;
    }

    static int setFlower(int y, int x) {
        v[y][x] = 1;
        int s = p[y][x];
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            v[ny][nx] = 1;
            s += p[ny][nx];
        }
        return s;
    }

    static void eraseFlower(int y, int x) {
        v[y][x] = 0;
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            v[ny][nx] = 0;
        }
    }

    static void flower(int cnt, int hap) {
        if (cnt == 3) {
            ret = Math.min(ret, hap);
            return;
        }

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (check(i, j)) {
                    flower(cnt + 1, hap + setFlower(i, j));
                    eraseFlower(i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        p = new int[n][n];
        v = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                p[i][j] = scanner.nextInt();
            }
        }

        flower(0, 0);
        System.out.println(ret);
    }
}
