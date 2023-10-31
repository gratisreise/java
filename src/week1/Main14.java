package week1;

import java.util.Scanner;

public class Main14 {
    static long modPower(long a, long b, long c){
        if(b == 1) return a % c;
        long ret = modPower(a, b / 2, c);
        ret = (ret * ret) % c;
        if(b % 2 == 1) ret = (ret * a) % c;
        return ret;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long ret = modPower(a, b, c);
        System.out.println(ret);
    }
}
