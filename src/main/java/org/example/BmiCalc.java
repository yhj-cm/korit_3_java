package org.example;

/*
    이하의 코드에 필요한 로직을 작성하고,
    BmiCalcMain에 적용하여 -> 여기에 객체도 생성해야하고,
                         -> getBmi라는 메서드도 호출
     동일한 결과값이 나오도록 작성하시오

     이 클래스에 getBmiResult 메서드를 call()으로 정의하여
     bmiCalc.getBmiResult(); 를 호출했을 때
     실행 예
     키(cm)를 입력하세요 >>> 172
     몸무게(kg)를 입력하세요 >>> 70
     당신의 Bmi 지수는 23.66....이며 과체중입니다.

 */
public class BmiCalc {
    public double getBmi(double cm, double kg) {
        double Bmi = 0;         //지역 변수
        cm = cm / 100;
        Bmi = kg / (cm * cm) ;


       return Bmi;
    }

    public String getResult(double Bmi) {
        final double UNDER_WEIGHT = 18.5;
        final double  NORMAL = 23;
        final double OVER_WEIGHT = 25;
        String rating = "";

        if(Bmi < UNDER_WEIGHT) {
            rating = "저체중";
        } else if (Bmi < NORMAL) {
            rating = "정상";
        } else if (Bmi < OVER_WEIGHT) {
            rating = "과체중";
        } else {
            rating = "비만";
        }
        return rating;
    }


}
