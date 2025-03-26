package ch12_array;

import java.util.Random;

/*
    1차 배열을 기준으로
    1 ~ 45까지의 임의의 숫자를 뽑아 배열에 대입

    목표는 1차 배열 내에 6개의 임의의 int값을 집어넣는 것
    근데, 중복이 있으면 안됨. -> 저랑 같이 수업

    그래서 복습을 한다고 가정하고 1 ~ 45까지의 숫자를
    여섯개짜리의 빈 배열에 집어넣는 것부터 시작하겠습니다.

    lottoNumbers에 1 ~45까지의 숫자 중 6개를 뽑아 대입하는 반복문 작성
    -> 1차 배열 하나가 완성됩니다.
 */
public class Array16LottoAnswer {
    public static void main(String[] args) {
        //객체 생성
        Random random = new Random();
        //생각해봐야할 점 - Math.random()을 사용해서 1 ~ 45까지의 범위를 만들려면 어떡해야 할까
        //빈 배열 선언
        int[] lottoNumbers = new int[6];

        System.out.println(Math.random());
    }
}
