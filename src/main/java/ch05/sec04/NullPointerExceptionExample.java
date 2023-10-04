package ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
        intArray[0] = 10; // 배열이 참조하는 것이 없다

        String str = null;
        //문자열이 참조하는 것이 없음 NullPointerException
        System.out.println("총 문자 수: " + str.length());
    }
}
