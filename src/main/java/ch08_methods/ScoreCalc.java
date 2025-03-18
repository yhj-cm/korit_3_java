package ch08_methods;

import java.util.Scanner;

/*
    점수들을 입력 받아서 총합 및 평균을 내는 프로그램을 구현할 예정
 */
public class ScoreCalc {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        double avg = 0.0;
        int numOfSubs = 0;

        System.out.print("합산할 과목의 갯수를 입력해 주세요>>>");
        numOfSubs = scanner.nextInt();

        if(numOfSubs > 3 || numOfSubs < 0) {
            System.out.println("불가능한 요청입니다.");

        } else if (numOfSubs == 3) {
            System.out.println("과목 3개의 점수를 입력해 주세요");

        } else if (numOfSubs == 2) {
            System.out.println("과목 2개의 점수를 입력해 주세요");

        } else if (numOfSubs == 1) {
            System.out.println("과목 1개의 점수를 입력해 주세요");

        }


        System.out.println("몇 과목의 점수를 입력하시겠습니까? >>> ");
        numOfSubs = scanner.nextInt();
        for (int i = 0 ; i < numOfSubs ; i++ ) {
            System.out.println((i+1) + "과목의 점수를 입력하세요 >>> ");
            sum += scanner.nextDouble();
        }
        avg = sum / numOfSubs;
        System.out.println("총합은 " + sum + "점이며, 평균은 " + avg + "점입니다.");


        //3과목의 점수를 입력 받고, 총합과 평균 점수를
        //콘솔창에 출력하시오

        //실행 예
        // 몇 과목의 점수를 입력하시겠습니까? >>> 3
        //1과목의 점수를 입력하세요 >>> 90
        //3과목의 점수를 입력하세요 >>> 95
        //총합은 285.0점이며, 평균은 n점입니다
    }
}
