package week1;

import java.util.*;

public class Main01{
    static int sum, ret1, ret2;
    static int[] a = new int[9];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < 9; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < i; j++){
                if(sum - a[i] - a[j] == 100){
                    ret1 = a[i]; ret2 = a[j];
                }
            }
        }
        for(int i = 0; i < 9; i++){
            if(a[i] == ret1 || a[i] == ret2) continue;
            l.add(a[i]);
        }
        Collections.sort(l);
        for(int i : l) System.out.println(i);
    }
}