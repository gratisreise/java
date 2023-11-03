package week2;

import java.util.*;

public class Main11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 666;; i++){
            if(String.valueOf(i).contains("666")) n--;
            if(n == 0){System.out.println(i); break;}
        }
    }
}
