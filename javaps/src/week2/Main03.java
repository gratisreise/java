package week2;

import java.util.*;

public class Main03{
    static int n, y, x, ret;
    static int[][] a = new int[104][104];
    static int[][] visited;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};

    static void dfs(int y, int x, int d){
        visited[y][x] = 1;
        for(int i = 0; i < 4; i++){
            int ny = y + dy[i];
            int nx = x + dx[i];
            if(ny < 0 || nx < 0 || ny >= n || nx >= n) continue;
            if(a[ny][nx] <= d || visited[ny][nx] != 0) continue;
            dfs(ny, nx, d);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }

        for(int d = 0; d <= 100; d++){
            visited = new int[104][104];
            int cnt = 0;
            for(int i = 0; i < n ; i++){
                for(int j = 0; j < n; j++){
                    if(a[i][j] <= d || visited[i][j] != 0) continue;
                    dfs(i, j, d); cnt++;
                }
            }
            ret = Math.max(ret, cnt);
        }
        System.out.println(ret);
    }
}