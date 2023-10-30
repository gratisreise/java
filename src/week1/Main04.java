package week1;
import java.util.*;

public class Main04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // reverse메소드 사용하기 위해 StringBuilder로 감싸기
        StringBuilder temp = new StringBuilder(s);
        // 앞뒤 전환한 것을 스트링으로 변환
        String ss = temp.reverse().toString();
        if(s.equals(ss)) System.out.println(1);
        else System.out.println(0);
    }
}
