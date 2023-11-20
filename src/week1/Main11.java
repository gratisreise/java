package week1;

import java.util.*;

public class Main11 {
    static int[] cnt = new int[200];
    static String s;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder ret = new StringBuilder();
        s = sc.next();
        char mid = 'a';
        int flag = 0;
        for (char c : s.toCharArray()) cnt[c]++;
        for (int i = 'Z'; i >= 'A'; i--) {
            if (cnt[i] % 2 != 0) {
                cnt[i]--;
                flag++;
                mid = (char) i;
            }
            if (flag == 2) break;
            for (int j = 0; j < cnt[i]; j += 2) {
                ret.insert(0, (char) i);
                ret.append((char) i);
            }
        }
        if (mid != 'a') ret.insert(ret.length() / 2, mid);
        if (flag == 2) System.out.println("I'm Sorry Hansoo");
        else System.out.println(ret);
    }
}