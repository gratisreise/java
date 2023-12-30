package week3;

import java.util.*;

public class Main02{
    static int n, m, ret = Integer.MIN_VALUE;
    static char[][] a;
    static int visited[][];
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static List<Pair> L;
    static class Pair{
        int f, s;
        public Pair(int f, int s){
            this.f = f;
            this.s = s;
        }
    }
    static void solve(){
        for(Pair p : L){
            visited = new int[n + 4][m + 4];
            bfs(p.f, p.s);
        }
    }
    static void bfs(int y, int x){
        visited[y][x] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(y, x));
        while(!q.isEmpty()){
            Pair p = q.poll();
            y = p.f;
            x = p.s;
            for(int i = 0; i < 4; i++){
                int ny = y + dy[i];
                int nx = x + dx[i];
                if(ny < 0 || nx < 0 || ny >= n || nx >= m) continue;
                if(a[ny][nx] == 'W' || visited[ny][nx] != 0) continue;
                visited[ny][nx] = visited[y][x] + 1;
                ret = Math.max(ret, visited[ny][nx] - 1);
                q.add(new Pair(ny, nx));
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new char[n + 4][m + 4];
        L = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            for(int j = 0; j < m; j++){
                a[i][j] = s.charAt(j);
                if(a[i][j] == 'L') L.add(new Pair(i, j));
            }
        }
        solve();
        System.out.println(ret);
    }
}