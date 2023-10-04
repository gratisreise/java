package problem;

public class Number4 {
    static int x, y;
    public static void main(String[] args) {
        while(x + y != 5){
            x = (int)(Math.random()*6) + 1;
            y = (int)(Math.random()*6) + 1;
            System.out.println("(" + x + "," + y +")");
        }
    }
}
