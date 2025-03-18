package ch06_condition;

import java.util.Scanner;

public class Condition04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int point = 0;
        final int VIP_POINT = 80;
        final int GOLD_POINT = 60;
        final int SLIVER_POINT = 40;
        final int BRONZE_POINT = 20;

        String rating = "";

        System.out.println("회원 포인트를 입력하세요 >>> ");

        point = scanner.nextInt();

        if(point > VIP_POINT) {
           rating = "VIP";
        } else if (point > GOLD_POINT) {
            rating = "GOLD";
        } else if (point > SLIVER_POINT ) {
           rating = "SLIVER";
        } else if (point > BRONZE_POINT)  {
            rating = "BRONZE";
        } else if (point <= BRONZE_POINT) {
            rating = "일반";
        }
        System.out.println("당신의 등급은 현재 " + rating + "등급입니다.");














    }
}
