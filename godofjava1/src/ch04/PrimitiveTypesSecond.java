package ch04;

public class PrimitiveTypesSecond {
    int intDefault1;
    byte byteDefault;
    short shortDefault;
    long longDefault;
    float floatDefault;
    double doubleDefalut;
    char charDefault;
    boolean booleanDefault;

    public PrimitiveTypesSecond() {
    }

    public static void main(String[] var0) {
        PrimitiveTypesSecond var1 = new PrimitiveTypesSecond();
        var1.defaultValues();
    }

    public void defaultValues() {
        System.out.println("intDefault1 = " + this.intDefault1);
        System.out.println("byteDefault = " + this.byteDefault);
        System.out.println("shortDefault = " + this.shortDefault);
        System.out.println("longDefault = " + this.longDefault);
        System.out.println("floatDefault = " + this.floatDefault);
        System.out.println("doubleDefalut = " + this.doubleDefalut);
        System.out.println("charDefault = " + this.charDefault);
        System.out.println("booleanDefault = " + this.booleanDefault);
    }
}

