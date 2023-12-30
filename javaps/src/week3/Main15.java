import java.util.Scanner;

public class Main15 {
    static int n, m, h, a, b;
    static int ret = Integer.MAX_VALUE;
    static int[][] visited = new int[35][35];

    static boolean check() {
        for (int i = 1; i <= n; i++) {
            int start = i;
            for (int j = 1; j <= h; j++) {
                if (visited[j][start] == 1) start++;
                else if (visited[j][start - 1] == 1) start--;
            }
            if (start != i) return false;
        }
        return true;
    }

    static void go(int here, int cnt) {
        if (cnt > 3 || cnt >= ret) return;
        if (check()) {
            ret = Math.min(ret, cnt);
            return;
        }
        for (int i = here; i <= h; i++) {
            for (int j = 1; j <= n; j++) {
                if (visited[i][j] == 1 || visited[i][j - 1] == 1 || visited[i][j + 1] == 1) continue;
                visited[i][j] = 1;
                go(i, cnt + 1);
                visited[i][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        h = sc.nextInt();

        while (m-- > 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            visited[a][b] = 1;
        }
        go(1, 0);
        System.out.println((ret == Integer.MAX_VALUE) ? -1 : ret);
    }
}
