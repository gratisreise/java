package week1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main09 {
    static Map<String, Integer> mp = new HashMap<>();
    static String[] a = new String[1000004];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine(); // 버퍼비우기

        // 속도개선을 위해
        // O(1)인 배열 또는 O(logn)인 맵을 사용한다.
        for(int i = 0; i < n; i++){
            String s = sc.next();
            mp.put(s, i + 1);
            a[i + 1] = s;
        }

        for(int i = 0; i < m; i++){
            String s = sc.next();
            if(s.matches("\\d+")){
                int index = Integer.parseInt(s);
                System.out.println(a[index]);
            } else {
                System.out.println(mp.get(s));
            }
        }

    }
}
