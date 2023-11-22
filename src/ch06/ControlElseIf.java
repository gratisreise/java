package ch06;

public class ControlElseIf {
    public static void main(String[] args) {
        ControlElseIf control = new ControlElseIf();
        control.elseIf(85);
    }

    private void elseIf(int point) {
        if(point > 90){
            System.out.println("A");
        } else if(point > 80){
            System.out.println("B");
        } else if(point > 70){
            System.out.println("C");
        } else if(point > 60){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
    public void elseIf2(int point){
        String result = point > 90 ? "A" : point > 80 ? "B" : point > 70 ? "C" : point > 60 ? "D" : "F";
        System.out.println(result);
    }
}
