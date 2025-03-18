package ch08_methods;

import java.util.Scanner;

/*
     별찍기 관련한 거 메서드로 구현할 예정입니다.
 */
public class Method02 {
    //call4 유형이 될 예정
    public static String getStar(int rows, int select) {    // rows와 rowOfStars는 서로 다른 개념
        // 사용할 지역 변수 선언
        String result = "";

        // select에 따라서 서로 다른 결과값이 나오도록 조건문을 작성할 예정입니다(1. 이면 왼쪽으로 치우친 증가하는 별)
        if(select == 1) {
            for (int i = 0 ; i < rows + 1 ; i++) {
                //별 찍히는 부분
                for (int j = 0 ; j < i ; j++ ) {
                    result += "✨";
                }
                //개행 부분
                result += "\n";
            }
        } else if(select == 2) {
            for(int i = 0 ; i < rows ; i++) {
                // 공백이 찍히는 for문
                for(int j = 0 ;  j < rows -(i + 1) ; j++) {
                    result += "  ";
                }
                // 별이 찍히는 for문
                for(int k = 0 ; k < i + 1 ; k++ ) {
                    result += "✨";
                }
                // 개행
                result += "\n";
            }
        } else if(select == 3) {
            for (int i = rows ; i > 0 ; i--) {
                result +=" ";

                for (int j = 0; j < i; j++) {
                    result += "✨";
                }
                result += "\n";
            }



        } else if(select == 4) {
            for(int i = 0 ;  i < rows ; i++) {
                //공백이 늘어나야 함. -> select == 1에서 작성한 방식 참조 가능
                for (int j = 0 ; j < i + 1 ; j++) {
                    result += " ";
                }
                for (int j = rows ; j - i > 0 ; j++) {
                    result += "✨";
                }
                result += "\n";


            }


        } else {
            result = "잘못 입력하셨습니다. 프로그램을 종료합니다.";
        }
        return result;
    }


        public static void main (String[]args) {
            Scanner scanner = new Scanner(System.in);

            int rowOfstars = 0;
            int choice;
            String starResult = "";

            System.out.print("몇 줄 짜리 별을 생성할까요? >>> ");
            rowOfstars = scanner.nextInt();

            System.out.println("왼쪽으로 치우친 증가하는 별");
            System.out.println("오른쪽으로 치우친 증가하는 별");
            System.out.println("왼쪽으로 치우친 감소하는 별");
            System.out.println("오른쪽으로 치우친 감소하는 별");
            System.out.print("메뉴를 선택하세요>>> ");
            choice = scanner.nextInt();

            starResult = getStar(rowOfstars, choice);
            System.out.println(starResult);

    }
}
