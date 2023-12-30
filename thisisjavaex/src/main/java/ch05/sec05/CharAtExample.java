package ch05.sec05;

import java.util.Scanner;

public class CharAtExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ssn = sc.nextLine();
        char sex = ssn.charAt(6);

        switch (sex){
            case '1', '3' -> System.out.println("남자입니다.");
            case '2', '4' -> System.out.println("여자입니다.");
        }
    }
}
