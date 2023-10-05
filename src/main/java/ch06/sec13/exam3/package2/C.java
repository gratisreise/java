package ch06.sec13.exam3.package2;

import ch06.sec13.exam3.package1.A;

public class C {
    public C(){
        A a = new A();

        //필드값 변경
        a.field1 = 1;
        //a.field2 = 1;  default
        //a.field3 = 1;  private

        //메소드 호출
        a.method1(); // public
        //a.method2();  default
        //a.method3();  private
    }
}
