package ch03;

public class CarManager {
    public CarManager() {
    }

    public static void main(String[] var0) {
        Car var1 = new Car();
        new Car();
        var1.speedUp();
        var1.speedUp();
        System.out.println(var1.getCurrentSpeed());
        var1.breakDown();
        System.out.println(var1.getCurrentSpeed());
    }
}

