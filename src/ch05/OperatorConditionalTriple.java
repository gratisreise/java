package ch05;

public class OperatorConditionalTriple {
    public static void main(String[] args) {
        OperatorConditionalTriple operator = new OperatorConditionalTriple();
        operator.doBlinDate(30);
        operator.doBlinDate(80);

    }

    public boolean doBlinDate(int point){
        boolean doBlinDateFlag = false;
        doBlinDateFlag = (point >= 80) ? true : false;
        System.out.println(point + " : " + doBlinDateFlag);
        return doBlinDateFlag;
    }
}
