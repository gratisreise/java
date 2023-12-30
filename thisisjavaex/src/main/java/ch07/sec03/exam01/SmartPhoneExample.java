package ch07.sec03.exam01;

import ch07.sec02.SmartPhone;

public class SmartPhoneExample {
    public static void main(String[] args) {
        //SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("스마트폰", "빨강");

        //Phone으로부터 상속 받은 필드 읽기
        System.out.println("모델: " + myPhone.model);
        System.out.println("색상:" + myPhone.color);
    }
}
