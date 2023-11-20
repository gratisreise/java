package ch05;

public class OperatorCasting {
    public static void main(String[] args) {
        OperatorCasting operator = new OperatorCasting();
        //operator.casting();
        operator.casting2();
    }

    private void casting2() {
        short shortValue = 256;
        byte byteValue = (byte)shortValue;
        System.out.println(byteValue);
        shortValue = 255;
        byteValue = (byte)shortValue;
        System.out.println(byteValue);
    }

    private void casting() {
        byte byteValue = 127;
        short shortValue = byteValue;

        shortValue++;
        System.out.println(shortValue);
        byteValue = (byte)shortValue;
        System.out.println(byteValue);
    }

}
