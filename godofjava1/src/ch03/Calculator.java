package ch03;

import java.io.PrintStream;

public class Calculator {
    public Calculator() {
    }

    public static void main(String[] var0) {
        System.out.println("Calculator class started");
        Calculator var1 = new Calculator();
        byte var2 = 10;
        byte var3 = 5;
        PrintStream var10000 = System.out;
        int var10001 = var1.add(var2, var3);
        var10000.println("add=" + var10001);
        var10000 = System.out;
        var10001 = var1.substract(var2, var3);
        var10000.println("substract=" + var10001);
        var10000 = System.out;
        var10001 = var1.multiply(var2, var3);
        var10000.println("multiply=" + var10001);
        var10000 = System.out;
        var10001 = var1.divide(var2, var3);
        var10000.println("divde=" + var10001);
    }

    public int add(int var1, int var2) {
        return var1 + var2;
    }

    public int substract(int var1, int var2) {
        return var1 - var2;
    }

    public int multiply(int var1, int var2) {
        return var1 * var2;
    }

    public int divide(int var1, int var2) {
        return var1 / var2;
    }
}
