package org.example;

import java.util.Scanner;


public class BmiCalcMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cm = 0;
        double kg = 0.0;
        double Bmi = 0;

        System.out.print("키(cm)를 입력하세요 >>>");
        cm = scanner.nextDouble();

        System.out.print("몸무게를 입력하세요 >>>");
        kg = scanner.nextDouble();

        BmiCalc bmiCalc = new BmiCalc();
//        bmiCalc.getbmiResult()


//        System.out.println("당신의 bmi 지수는 " + Bmi + "이며 " + rating + "입니다.");


//        System.out.println("BMI 계산기입니다.");
//
//        System.out.print("키(cm)를 입력하세요 >>>");
//
//        cm = scanner.nextDouble();
//        cm = cm / 100;
//        System.out.println(cm);
//
//        System.out.print("몸무게를 입력하세요 >>>");
//
//        kg = scanner.nextDouble();
//        Bmi = kg / (cm * cm) ;
//        System.out.println("당신의 BMI는 " + Bmi + "입니다.");
//
//        if(Bmi < 18.5 ) {
//            System.out.println("저체중입니다.");
//        } else if (Bmi < 23) {
//            System.out.println("정상 체중입니다");
//        } else if (Bmi < 25) {
//            System.out.println("과체중입니다.");
//        } else if (Bmi > 25) {
//            System.out.println("비만입니다.");
//        }


    }
}