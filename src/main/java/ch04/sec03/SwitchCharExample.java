package ch04.sec03;

import java.util.Scanner;

public class SwitchCharExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char grade = sc.next().charAt(0);

        switch(grade) {
            case 'A':
            case 'a':
                System.out.println("우수 회원입니다.");
                break;
            case 'B':
            case 'b':
                System.out.println("일반 회원입니다.");
                break;
            default:
                System.out.println("손님입니다.");
        }
    }
}
