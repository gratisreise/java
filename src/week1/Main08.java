package week1;

import java.util.*;

public class Main08 {
    static int n, k, ret = Integer.MIN_VALUE;
    static int[] psum = new int[10000004];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int temp = sc.nextInt();
            psum[i] = psum[i - 1] + temp;
        }
        for (int i = k; i <= n; i++) {
            ret = Math.max(ret, psum[i] - psum[i - k]);
        }
        System.out.println(ret);
    }
}