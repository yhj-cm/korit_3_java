package ch00_review;

import java.util.Scanner;

public class Review06 {
        //method 정의 영역
    /*
        1.총합을 내는 메서드 구현
            1) 매개변수는 score1, score2
            2) return 타입은 double
            호출 방식
            System.out.println(review06.addScores(4.5, 3.0));
            실행 예
            7.5

     */
//    double addScores(double score1, double score2) {
//        return score1 + score2;
//    }
//
//    double calculateAvg(double totalScore,int numOfsums){
//        totalScore =
//    }


    public static void main(String[] args) {
        Review06 review06 = new Review06();
//        System.out.println(review06.addScores(4.5, 5.6));
//
//        double sum = review06.addScores(4.5,3.1);
//        int subs = 2;
        /*
        여태까지 메서드 정의한 것의 문제점은 두 과목의 점수를 더한 값만
        반환한다는 의미였습니다

        이를 main 단계에서 반복문과 결합하여
        원하는 과목의 개수의 점수 합을 구할 수 있도록 작성할 예정
        그리고 거기에 맞춰서 평균 점수도 출력할 수 있도록 작성
         */
        Scanner scanner = new Scanner(System.in);
        double score1;
        double score2;
        double score3;
        double totalScore = 0;
        int subjects = 0;



//        for ( int i = 0; i < subjects ; i++) {
//            System.out.println((i+1) + "번째 과목의 점수를 입력하세요");
//            score1 = scanner.nextDouble();
//            review06.addScores(score1,0);
//        }
//
//        averageScore = review06.calculateAvg(totalScore,subjects);






    }
}
