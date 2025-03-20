package ch00_review;

public class Review02 {
    public static void main(String[] args) {
        /*

         */


        double result1 = 0;
        double result2 = 0;
        double height = 0;
        double width = 0;

        // 1. 이상의 변수에 세로 30.3 / 가로 124.37인
        // 사각형의 넓이를 구하시오.
        // 2.동일한 가로 세로의 삼각형의 넓이를 구하시오
        // 실행 예
        // 가로 124.37, 세로 30.3인 삼각형의 넓이는 ,,, 이고
        // 사각형의 넓이는 ...입니다.

        height = 30.3;
        width = 124.37;
        result1 = height * width;
        result2 = (height * width)/2;       //결과적으로 사각형의 넓이만 구했고

        System.out.println("가로 " + width +", 세로가 " + height + "인 사각형의 넓이는 " + result1 + "이고");
        System.out.println("가로 " + width +", 세로가 " + height + "인 삼각형의 넓이는 " + result2 + "입니다.");
        // 이상의 코드에서 볼 수 있듯이 삼각형의 넓이는 사각형 넓이/2로 처리했습니다

    }
}
