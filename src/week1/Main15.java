package week1;

import java.util.*;

public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            int cnt = 1; int ret = 1;
            while(true){
                if(cnt % n == 0){
                    System.out.println(ret);
                    break;
                } else {
                    cnt = (cnt * 10 + 1) % n;
                    ret++;
                }
            }
        }
    }
}
