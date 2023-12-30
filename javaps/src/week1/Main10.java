package week1;

import java.util.*;

public class Main10 {
    static int t, n;
    static String a, b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            Map<String, Integer> mp = new HashMap<>();
            for (int i = 0; i < n; i++) {
                a = sc.next();
                b = sc.next();
                mp.put(b, mp.getOrDefault(b, 0) + 1);
            }
            long ret = 1;
            for (Map.Entry<String, Integer> e : mp.entrySet()) {
                ret *= (e.getValue() + 1);
            }
            ret--;
            System.out.println(ret);
        }
    }
}