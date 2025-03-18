package ch06_condition;

import java.util.Scanner;

/*
    사용자에게 score를 입력 받아 다음과 같은 조건을 만족시키도록 작성하시오


    score가 0미만이거나 100 초과라면 grade = x
    changedScore = 9 ~ 10, grade = A
    changedScore = 8, grade = B
    changedScore = 7, grade = C
    changedScore = 6,grade = D
    changedScore = 5,4,3,2,1,0이면 grade = f

    실행 예
    점수를 입력하세요>>> 100
    점수는 100점이고, 학점은 a학점입니다.

    if문을 통해서 0미만 및 100초과를 걸러내서 grade = x
    나머지 부분에 switch문을 작성하면 구현이 가능할겁니다
 */
public class Condition08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int changeScore = 0;
        String grade = "";
        System.out.println("점수를 입력하세요 >>> ");
        score = scanner.nextInt();
        changeScore = score /10;

        switch (changeScore) {
            case 10:

            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";

                System.out.println("점수는 " + score + "점이며, 등급은 " + grade + "입니다.");
        }







    }
}
