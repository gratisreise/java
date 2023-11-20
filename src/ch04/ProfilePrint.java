package ch04;

public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried;

    public ProfilePrint() {
    }

    public static void main(String[] var0) {
        ProfilePrint var1 = new ProfilePrint();
        var1.setAge((byte)26);
        var1.setMarried(false);
        var1.setName("김정호");
        System.out.println(var1.getAge());
        System.out.println(var1.getName());
        System.out.println(var1.getMarried());
    }

    public void setAge(byte var1) {
        this.age = var1;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String var1) {
        this.name = var1;
    }

    public String getName() {
        return this.name;
    }

    public void setMarried(boolean var1) {
        this.isMarried = var1;
    }

    public boolean getMarried() {
        return this.isMarried;
    }
}
