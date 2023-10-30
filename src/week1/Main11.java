package week1;

import java.util.*;

public class Main11 {
    static int[] cnt = new int[200];
    static char mid;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder ret = new StringBuilder();

        for(char c : s.toCharArray()) cnt[c]++;
        int flag = 0;

        for(int i = 'Z'; i >= 'A'; i--){
            if(cnt[i] % 2 != 0){
                mid = (char)i;
                cnt[i]--; flag++;
            }

            if(flag == 2) break;

            for(int j = 0; j < cnt[i]; j += 2){
                ret.insert(0, i);
                ret.append((char)i);
            }
        }

        if(mid != 0) ret.insert(ret.length() / 2, mid);
        if(flag == 2) System.out.println("I'm Sorry Hansoo");
        else System.out.println(ret.toString());

    }
}
