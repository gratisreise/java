package week1;

import java.util.*;

public class Main12 {
    static int n, m, ret;
    static int[] a = new int[15004];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (m > 200000) System.out.println(0);
        else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (a[i] + a[j] == m) ret++;
                }
            }
            System.out.println(ret);
        }
    }
}