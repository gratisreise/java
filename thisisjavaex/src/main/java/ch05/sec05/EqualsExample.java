package ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        //기존 문자열에 참조만 이어줌
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        if(strVar1 == strVar2){
            System.out.println("strVar1과 strVar2는 참조가 같음");

        } else{
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }

        if(strVar1.equals(strVar2)){
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }

        //new 연산자로 새로운객체 생성
        String str3 = new String("홍길동");
        String str4 = new String("홍길동");

        if(str3 == str4){
            System.out.println("str3과 str4는 참조가 같음");
        } else{
            System.out.println("str3과 str4는 참조가 다름");
        }

        if(str3.equals(str4)){
            System.out.println("str3과 str4는 문자열이 같음");
        }
    }
}
