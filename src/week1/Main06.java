package week1;

import java.util.*;

public class Main06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder ret = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                if (c + 13 > 'Z') c -= 13;
                else c += 13;
            } else if (Character.isLowerCase(c)) {
                if (c + 13 > 'z') c -= 13;
                else c += 13;
            }
            ret.append(c);
        }
        System.out.println(ret);
    }
}