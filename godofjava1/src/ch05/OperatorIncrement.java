package ch05;

public class OperatorIncrement {
    public static void main(String[] args) {
        OperatorIncrement operator = new OperatorIncrement();
        operator.increment();
        System.out.println("-------");
        operator.increment2();
    }

    private void increment2() {
        int intValue = 1;
        System.out.println(intValue);
        intValue = intValue + 1;
        System.out.println(intValue);
        intValue = intValue + 1;
        System.out.println(intValue);
    }

    private void increment() {
        int intValue = 1;
        System.out.println(intValue++);
        System.out.println(intValue);
        System.out.println(++intValue);
    }

}
