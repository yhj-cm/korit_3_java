package ch06_condition;

import java.util.Scanner;

/*
  중첩 if(Nested if condition sentence)
        if 문 내에 if문이 연속적으로 작성될 수 있습니다.

    형식 :
    if(조건식1) {
        실행문1
        if(조건식1-a) {
            실행문1-a
        } else if(조건식1-b) {
            실행문1-b
        } else {
            실행문1-c
        }
    } else if(조건식2) {
        실행문2
        if(조건식2-a) {
            실행문2-a
        } else {
            실행문2-b
        }
    } else {
        실행문3
    }
 */
public class Condition06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String grade = "";
        System.out.print("점수를 입력하세요 >>>");

        int score = scanner.nextInt();

        if(score > 100 || score <0) {
            grade = "X";
        } else if (score >= 90 ) {
            grade = "A";
        } else if (score >= 80 ) {
            grade = "B";
        } else if (score >= 70 ) {
            grade = "c";
        } else if (score >= 60 ) {
            grade = "d";
        } else if (score <= 59 ) {
            grade = "f";
        }

        //논리 연산자를 사용한 if문
        // 100초과 및 0 미만을 거르는 조건문 작성


        System.out.println("당신의 점수는 " + score + "이며 학점은 " + grade + "입니다.");







        /*
            사용자에게 score를 입력 받아 다음과 같은 조건을 만족시키도록 작성하시오.

            score가 0보다 작거나 100초과라면 grade는 x
            score 90 ~ 100, grade = A
            score 80 ~ 90, grade = B
            score 70 ~ 80, grade = C
            score 60 ~ 70, grade = D
            score 50 ~ 59, grade = F

            점수를 입력하세요 >>> -10
            입력한 점수는 -10점이며 학점은 x입니다.

            점수를 입력하세요 >>> 92
            입력한 점수는 92점이며 학점은 A학점입니다.
         */







    }
}
