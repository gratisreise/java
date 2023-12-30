package week2;

import java.util.*;

public class Main05{
    static int n;
    static char[][] a = new char[65][65];

    static String go(int y, int x, int n){
        if(n == 1) return String.valueOf(a[y][x]);
        char b = a[y][x];
        StringBuilder ret = new StringBuilder();

        for(int i = y; i < y + n; i++){
            for(int j = x; j < x + n; j++){
                if(a[i][j] != b){
                    ret.append("(");
                    ret.append(go(y, x, n / 2));
                    ret.append(go(y, x + n / 2, n / 2));
                    ret.append(go(y + n / 2, x, n / 2));
                    ret.append(go(y + n / 2, x + n / 2, n / 2));
                    ret.append(")");
                    return ret.toString();
                }
            }
        }
        return String.valueOf(a[y][x]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            for(int j = 0; j < n; j++){
                a[i][j] = s.charAt(j);
            }
        }
        System.out.println(go(0, 0, n));
    }
}