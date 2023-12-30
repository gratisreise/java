package week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main16 {
    static int n, m, a, b, temp, ret = -1;
    static int[] visited = new int[10004];
    static List<Integer>[] l = new List[10004];
    static int[] cnt = new int[10004];

    static int go(int now) {
        visited[now] = 1;
        int ret = 1;
        for (int next : l[now]) {
            if (visited[next] == 0) {
                ret += go(next);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 1; i <= n + 1; i++) {
            l[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            l[b].add(a);
        }

        for (int i = 1; i <= n; i++) {
            Arrays.fill(visited,0);
            temp = go(i);
            if (ret < temp) ret = temp;
            cnt[i] = temp;
        }

        for(int i = 1; i <= n; i++){
            if(cnt[i] == ret) System.out.print(i + " ");
        }
    }
}
