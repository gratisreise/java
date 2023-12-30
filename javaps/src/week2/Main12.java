package week2;

import java.util.*;

public class Main12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            String s = sc.next();
            Stack<Character> stk = new Stack<>();
            for(char c : s.toCharArray()){
                if(!stk.isEmpty() && c == ')' && stk.peek() == '('){
                    stk.pop();
                } else stk.push(c);
            }
            if(stk.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}