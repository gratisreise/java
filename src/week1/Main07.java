package week1;

import java.util.*;

public class Main07 {
    static int n, pos;
    static String s, pre_s, suf_s;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.next();
        pos = s.indexOf("*");
        pre_s = s.substring(0, pos);
        suf_s = s.substring(pos + 1);
        for (int i = 0; i < n; i++) {
            s = sc.next();
            if (s.length() < pre_s.length() + suf_s.length()) {
                System.out.println("NE");
            } else {
                if (s.startsWith(pre_s) && s.endsWith(suf_s)) {
                    System.out.println("DA");
                } else {
                    System.out.println("NE");
                }
            }
        }

    }
}