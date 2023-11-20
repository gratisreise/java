package ch04;

public class PrimitiveTypes {
    public PrimitiveTypes() {
    }

    public static void main(String[] var0) {
        PrimitiveTypes var1 = new PrimitiveTypes();
        var1.checkChar();
    }

    public void checkByte() {
        byte var1 = -128;
        byte var2 = 127;
        System.out.println("byteMin=" + var1);
        System.out.println("byteMax=" + var2);
        --var1;
        byte var3 = (byte)(var2 + 1);
        System.out.println("byteMin - 1=" + var1);
        System.out.println("byteMax + 1=" + var3);
    }

    public void checkOtherTypes() {
        boolean var1 = true;
        int var2 = 21478364;
        long var3 = Long.MAX_VALUE;
    }

    public void checkChar() {
        char var1 = 0;
        char var2 = '\uffff';
        byte var3 = 97;
        System.out.println("charMin=[" + var1 + "]");
        System.out.println("charMax=[" + var2 + "]");
        System.out.println("a=[" + var3 + "]");
    }
}

