package ch03;

public class Profile {
    String name;
    int age;

    public Profile() {
    }

    public static void main(String[] var0) {
        Profile var1 = new Profile();
        var1.setName("Min");
        var1.setAge(20);
        var1.printName();
        var1.printAge();
    }

    public void setName(String var1) {
        this.name = var1;
    }

    public void setAge(int var1) {
        this.age = var1;
    }

    public void printName() {
        System.out.println("My name is " + this.name);
    }

    public void printAge() {
        System.out.println("My age is " + this.age);
    }
}
