package ch05.problem;

import java.util.Scanner;

public class Number9 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean run = true;
        int[] arr = null;

        while(run){
            System.out.println("-------------------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("-------------------------------------------------------------");
            System.out.print("선택> ");
            int push = Integer.parseInt(sc.nextLine());
            switch (push){
                case 1 ->{
                    System.out.print("학생수> ");
                    int size = Integer.parseInt(sc.nextLine());
                    arr = new int[size];
                }
                case 2 ->{
                    for(int i = 0; i < arr.length; i++){
                        System.out.print("score["+ i + "]> ");
                        arr[i] =Integer.parseInt(sc.nextLine());
                    }
                }
                case 3 ->{
                    for(int i : arr){
                        System.out.println("score["+ i + "]> "+ i);
                    }
                }
                case 4 ->{
                    int max = 0, sum = 0, avg = 0;

                    for(int i = 0; i < arr.length; i++){
                        if(arr[i] > max) max = arr[i];
                        sum += arr[i];
                    }

                    avg = sum / arr.length;

                    System.out.println("최고점수> " + max);
                    System.out.println("평균점수> " + avg);
                }
                case 5 -> run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
