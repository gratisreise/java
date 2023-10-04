package problem;

public class Number6 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
                if(j == i - 1) System.out.println();
            }
//            System.out.println();
        }
    }
}
