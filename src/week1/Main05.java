package week1;
import java.util.*;

public class Main05 {
    static int[] cnt = new int[26];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 문자열의 추가삭제 수정은 StringBuilder사용
        //why?? => String이 불변객체이기 때문에
        StringBuilder ret = new StringBuilder();

        for(int i = 0; i < n; i++){
            String s = sc.next();
            cnt[s.charAt(0) - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(cnt[i] >= 5){
                ret.append((char)(i + 'a'));
            }
        }

        if(ret.length() > 0){
            System.out.println(ret);
        } else {
            System.out.println("PREDAJA");
        }
    }
}
