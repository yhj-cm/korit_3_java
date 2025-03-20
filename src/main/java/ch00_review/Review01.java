package ch00_review;

import java.util.Scanner;


    public class Review01 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            System.out.println("hello,java!");
            // 변수 : 데이터를 담는 바구니인데, 이름표를 붙여줘요
            //변수의 선언 방식
            // 자료형 변수명 = 데이터;
            // 자료형 : int, double, String, boolean
            // 변수명 짓는 규칙  : 카멜케이스
            // 카멜케이스 예시 :myExample과 같은 방식으로 작성
            double height = 170;
            System.out.println(height);


            String name = "윤현지";
            int age = 20;
            int birthday = 20050911;

            System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
            System.out.println("생일은 " + birthday + "입니다.");
            System.out.println("10년 후에 저는 " + (age+10) + "살이 됩니다");

            String name1 = "";
            int age1 = 0;
            int birthday1 = 0;
            System.out.println("이름을 입력하세요 >>>");





        }
    }

