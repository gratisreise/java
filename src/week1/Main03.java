package week1;
import java.util.*;
public class Main03 {
    static int cnt[] = new int[104];
    static int ret;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        //시간은 이상 미만으로
        for(int i = 0; i < 3; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int  j = a; j < b; j++){
                cnt[j]++;
            }
        }

        for(int i = 0; i < 100; i++){
            if(cnt[i] == 1) ret += A;
            else if(cnt[i] == 2) ret += B * 2;
            else if(cnt[i] == 3) ret += C * 3;
        }

        System.out.println(ret);
    }
}
