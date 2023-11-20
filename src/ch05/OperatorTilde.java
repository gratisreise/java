package ch05;

public class OperatorTilde {
    public static void main(String[] args) {
        OperatorTilde operator = new OperatorTilde();
        byte b = 127;
        operator.printTildeResult(b);
    }

    private void printTildeResult(byte b) {
        System.out.println("Original value = " + b);
        System.out.println("Tilde value = " + ~b);
    }
}
