package week1;

import java.util.Scanner;

public class Main08 {
    // 누적합의 값이 담길 배열
    static int[] psum = new int[100004];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        //누적합이 담기는 것 구현
        for(int i = 1; i <= n; i++){
            int temp = sc.nextInt();
            psum[i] = psum[i - 1] + temp;
        }

        int ret = Integer.MIN_VALUE;

        for(int  i = k; i <= n; i++){
            ret = Math.max(ret, psum[i] - psum[i - k]);
        }

        System.out.println(ret);
    }
}
