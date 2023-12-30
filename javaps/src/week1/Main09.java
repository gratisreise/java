package week1;

import java.util.*;

public class Main09 {
    static int n, m;
    static String s;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        Map<String, Integer> mp1 = new HashMap<>();
        Map<Integer, String> mp2 = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            s = sc.next();
            mp1.put(s, i);
            mp2.put(i, s);
        }
        for (int i = 0; i < m; i++) {
            s = sc.next();
            if (Character.isDigit(s.charAt(0))) {
                System.out.println(mp2.get(Integer.parseInt(s)));
            } else {
                System.out.println(mp1.get(s));
            }
        }
    }
}