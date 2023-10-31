package week1;

import java.util.Scanner;
import java.util.Stack;

public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int ret = 0;

        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            Stack<Character> stk = new Stack<>();

            for(char c : s.toCharArray()){
                if(!stk.isEmpty() && stk.peek() == c) stk.pop();
                else stk.push(c);
            }
            if(stk.isEmpty()) ret++;
        }
        System.out.println(ret);
    }
}
