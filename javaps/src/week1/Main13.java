package week1;

import java.util.*;

public class Main13 {
    static int n, ret;
    static String s;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            s = sc.next();
            Stack<Character> stk = new Stack<>();
            for (char c : s.toCharArray()) {
                if (!stk.isEmpty() && c == stk.peek()) stk.pop();
                else stk.push(c);
            }
            if (stk.isEmpty()) ret++;
        }
        System.out.println(ret);
    }
}