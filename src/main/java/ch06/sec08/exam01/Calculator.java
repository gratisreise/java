package ch06.sec08.exam01;

public class Calculator {
    //리턴값이 없는 메소드 선언
    void powerOn(){
        System.out.println("전원을 켭니다.");

    }

    //리턴값이 없는 메소드 선언
    void powerOff(){
        System.out.println("전원을 끕니다.");

    }

    int plus(int x, int y){
        int result = x + y;
        return result; //리턴 값 지정
    }

    double divide(int x, int y){
        double result =(double)x / (double)y;
        return result; //리턴값 지정;
    }
}
