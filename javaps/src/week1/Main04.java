package week1;

import java.util.*;

public class Main04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        String temp = sb.reverse().toString();
        if (s.equals(temp)) System.out.println(1);
        else System.out.println(0);
    }
}