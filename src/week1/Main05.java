package week1;

import java.util.*;

public class Main05 {
    static int n;
    static int[] cnt = new int[150];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            cnt[s.charAt(0)]++;
        }
        for (int i = 0; i < 150; i++) {
            if (cnt[i] >= 5) ret.append((char) i);
        }
        if (ret.length() != 0) System.out.println(ret);
        else System.out.println("PREDAJA");
    }
}