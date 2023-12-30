package ch06.sec13.exam2.package1;

public class A {
    //필드 선언
    A a1 = new A(true);
    A a2 = new A(1);
    A a3 = new A("String");

    //public 접근 제한 생성자 선언
    public A(boolean b) {
    }

    A(int b){

    }
    private A(String s){

    }
}
