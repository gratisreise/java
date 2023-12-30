package week1;

import java.util.*;

public class Main03 {
    static int A, B, C, a, b, ret;
    static int[] cnt = new int[110];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        for (int i = 0; i < 3; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            for (int j = a; j < b; j++) cnt[j]++;
        }
        for (int i = 1; i <= 100; i++) {
            if (cnt[i] == 1) ret += A;
            else if (cnt[i] == 2) ret += B * 2;
            else if (cnt[i] == 3) ret += C * 3;
        }
        System.out.println(ret);
    }
}