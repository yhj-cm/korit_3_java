package ch12_array;

import java.util.Arrays;

public class Array14 {
    public static void main(String[] args) {
        int[][] nums = new int[20][5];
        int number = 0;

//        //1부터 100까지의 숫자를 nums 배열에 순서대로 값을 넣으시오.
//        for( int i = 0 ; i < nums.length ; i++) {
//            for (int j = 0 ; j < nums[i].length; j++) {
//               nums[i][j] = ++number;
//                System.out.print(nums[i][j] + " / ");
//            }
//            System.out.println();
//        }


        //2차 배열의 출력 : Arrays.deepToString(배열명);
        //Arrays.toString()이 안먹힌다는 것을 확인했었습니다.
        System.out.println(Arrays.deepToString(nums));


        //java의 출력 결과

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = ++number;
            }
        }

        // 배열 출력: 각 행을 한 줄에 5개의 숫자씩 출력하며 쉼표와 공백 추가
        for (int i = 0; i < nums.length; i++) {
            System.out.print("[");  // 행 시작
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j]);
                if (j < nums[i].length - 1) {
                    System.out.print(", ");  // 마지막 숫자가 아니면 쉼표 추가
                }
            }
            System.out.println("]");  // 행 끝에서 줄바꿈
        }
    }
}



