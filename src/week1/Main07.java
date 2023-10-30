package week1;
import java.util.*;

public class Main07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 입출력 변환 버퍼 비우기

        String s = sc.nextLine();
        int pos = s.indexOf('*');
        String pre_s = s.substring(0, pos);
        String suf_s = s.substring(pos + 1);

        for(int i = 0; i < n; i++){
            s = sc.nextLine();
            if(s.length() < pre_s.length() + suf_s.length()){
                System.out.println("NE");
            } else {
                //pre로 시작하고 suf로 끝났을 때
                if(s.startsWith(pre_s) && s.endsWith(suf_s)){
                    System.out.println("DA");
                } else {
                    System.out.println("NE");
                }
            }
        }
        sc.close();
    }
}
