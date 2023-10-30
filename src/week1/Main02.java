package week1;
import java.util.*;

public class Main02 {
    static int cnt[] = new int[26];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for(int i = 0; i < s.length(); i++){
            cnt[s.charAt(i) - 'a']++;
        }
        for(int i : cnt) System.out.print(i + " ");
    }
}
