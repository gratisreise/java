package ch06.sec08.exam02;

public class Computer {
    int sum(int... values){
        //sum 변수 선언
        int sum = 0;

        //valuse는 배열타입의 변수처럼 사용
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return sum;
    }
}
