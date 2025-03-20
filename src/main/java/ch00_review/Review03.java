package ch00_review;

import java.util.Scanner;

public class Review03 {
    public static void main(String[] args) {
        /*
            조건문
            if(조건식) {
                실행문
            }
            조건식 : true / false로 결정나는 식
            조건식이 true면 {} 내의 실행문이 실행됨.

            전체 형식:
            if(조건식) {
                실행문1
            } else if(조건식2)
            실행문2
            } else if(조건식3)
            실행문3
            } else {
                실행문4
            }

            그리고, Nested if문
            if (조건식1) {
             실행문1-1;  // 조건식1이 참일 때 실행되는 코드
                if (조건식1-a) {
                    실행문1-a;  // 조건식1-a가 참일 때 실행되는 코드
                } else if (조건식1-b) {
                    실행문1-b;  // 조건식1-b가 참일 때 실행되는 코드
                } else {
                    실행문1-c;  // 조건식1-a와 조건식1-b 모두 거짓일 때 실행되는 코드
                }
            }

            7세 미만은 탑승 불가
            110cm 미만은 탑승 불가

         */
        int age = 0;
        int height = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력하세요 >>> ");
        age = scanner.nextInt();
        System.out.println("키를 입력하세요 >>>");
        height = scanner.nextInt();


        // 조건문
//        if (age >= 7) {
//            System.out.println("규정 나이 7세 이상입니다."); //실행문 1-1
//            if(height >= 110) {
//                System.out.println("롤러코스터 입장이 가능합니다."); //실행문 1-a
//            }else {   // height <110
//                System.out.println("하지만 키가 부족해 입장이 불가합니다."); // 실행문 1-b
//            }
//            System.out.println("감사합니다"); //실행문1-2
//        } else {   //age > 7
//            System.out.println("규정 나이 미만으로 탑승이 불가능합니다.");
//        }

        //

//        if (height >= 110) {
//            System.out.println("규정 키 이상입니다.");
//            if(age >= 7) {
//                System.out.println("롤러코스터 입장이 가능합니다.");
//            }else {
//                System.out.println("하지만 나이가 부족해 입장이 불가합니다.");
//            }
//            System.out.println("감사합니다");
//        } else {
//            System.out.println("규정 키 미만으로 탑승이 불가능합니다.");
//        }

        if (height >= 110 && age >= 7) {
            System.out.println("롤러코스터 입장이 가능합니다");
        } else {
            System.out.println("롤러코스터 입장이 불가합니다");
        }
        System.out.println("감사합니다.");





    }
}
