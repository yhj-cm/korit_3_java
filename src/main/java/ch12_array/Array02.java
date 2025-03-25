package ch12_array;

public class Array02 {
    public static void main(String[] args) {
        //비어있는 배열 선언 방식
        int[] arr01 = new int[100];

        //1부터 100까지의 엘리먼트를 집어넣는 코드
        for(int i = 0 ; i < arr01.length ; i++) {
            arr01[i] = (i = 1);     //여기서 값 대입
            //
        }
    }
}
