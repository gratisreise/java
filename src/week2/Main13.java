package week2;

import java.util.*;

public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            Stack<Character> stk = new Stack<>();
            if (s.equals(".")) break;
            for(char c : s.toCharArray()){
                // 비교 대상 아닌 경우 제외
                if(c != '(' && c != ')' && c != '[' && c != ']') continue;
                if(!stk.isEmpty() && stk.peek() == '(' && c == ')'){
                    stk.pop();
                } else if(!stk.isEmpty() && stk.peek() == '[' && c == ']'){
                    stk.pop();
                } else stk.push(c);
            }
            if (stk.isEmpty()) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
