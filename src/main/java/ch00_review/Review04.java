package ch00_review;

import java.util.Scanner;

public class Review04 {
    public static void main(String[] args) {
        int limitnumber = 100;




//        for (int i = 0; i < limitnumber; i++) {
//        //     System.out.println(i + " ");
//            // 여기 내부에 if문을 써서 1부터 limitnumber까지의 숫자 중
//            // 짝수만 뽑아낼 수 있도록 하는 조건문을 작성하세요
//            int addedI = i+1;
//            if ( addedI % 2 == 0 ) {
//                System.out.println(addedI + " ");
//
//            }
//
//        }

        /*
        이상의 코드를 응용할겁니다. while문으로 개조할겁니다.
        근데 짝수말고 홀수가 출력되도록 작성하시오
         */
        for (int i = 0; i < limitnumber; i++) {
            while (i % 2 == 1) {
                i++;
            }
            System.out.println(i + 1);

        }


        Scanner scanner = new Scanner(System.in);


        //사용할 변수 목록
        int numOfstudent = 0;

        double sum = 0;
        double avg = 0;
        double score = 0;

        System.out.println("학생의 수는 몇 명인가요? >>> ");
        numOfstudent = scanner.nextInt();

        /*
            이상과 같은 코드라인이 있을 때 sum /avg는 아직 사용되지도 않았는데
            미리 선언되어 있고,
            numOfStudent의 경우에는 몇 줄만 더 내려가면 쓰는데
            굳이 저 위에 꾸역꾸역 써놨습니다.

            그런데 사용할 클래스 및 변수 목록을 봤을 때(그리고 변수명을
            해석했을 때),학생 수와 점수를 입력 받아서 합을 구하고
            평균을 내는 방식으로 이루어질 거라는 유추가 가능합니다
            또한, java 코딩에 익숙하시다면
            학생 개개인의 점수를 입력할 수 있도록 하는
            score1, score2의 형태가 아니라 sum만 존재한다는 점에서
            for 반복문 내부에 sum+= 이 사용될거라는 것도 추론하실 수 있습니다.

            이상의 추론을 바탕으로 저희가 반복문을 작성해보자면

        */
        //while문
//        int n = 1;
//        double score = 0;
//        while (n <= numOfstudent) {
//            System.out.println("점수를 입력하세요 >>>");
//            score = scanner.nextDouble();
//            sum += score;
//            n++;
//        }
//        System.out.println("총합 : " + sum);
//        avg = sum / numOfstudent;
//        System.out.println("평균 : " + avg);

        for (int i = 0; i < numOfstudent ; i++) {
            System.out.println("시험 점수를 입력하세요 >>> ");
            score = scanner.nextDouble();
            if ( score < 0 || score > 100 ) {
                System.out.println("불가능한 점수 입력입니다.");
                System.out.println("종료합니다. 처음부터 다시 입력하세요");
                break;  //그러면 반복문 바로 종료
            }
            sum += score;

        }
        System.out.println("총합 : " + sum);
        avg = sum / numOfstudent;
        System.out.println("평균 : " + avg);







    }
}
