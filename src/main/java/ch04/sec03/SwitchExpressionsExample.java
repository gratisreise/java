package ch04.sec03;

import java.util.Scanner;

public class SwitchExpressionsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char grade = sc.next().charAt(0);

        switch(grade){
            case 'A', 'a' ->{
                System.out.println("우수 회원입니다.");

            }
            case 'B', 'b' -> {
                System.out.println("일반 회원입니다.");

            }
            default -> {
                System.out.println("손님입니다.");
            }
        }

        switch(grade){
            case 'A', 'a' -> System.out.println("우수 회원입니다.");
            case 'B', 'b' -> System.out.println("일반 회원입니다.");
            default -> System.out.println("우수 회원입니다.");
        }
    }
}
