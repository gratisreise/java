package ch05.problem;

public class Number8 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int totalSum = 0;
        int sum = 0;
        int totalAvg = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i].length;
            for(int j = 0; j < array[i].length; j++){
                totalSum += array[i][j];
            }
        }
        totalAvg = totalSum/ sum;
        System.out.println(totalAvg);
    }
}
