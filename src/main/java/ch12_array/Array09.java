package ch12_array;

import java.util.Scanner;


public class Array09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>>");
        int indexNum = scanner.nextInt();
        String[] students = new String[indexNum];
        //입력 part는 일반 for문
        for( int i = 0 ; i < students.length ; i++ ) {
            students[i] = scanner.nextLine();
        }

        //출력 part는 일반 for로 한 번 향상된 for문 한 번 해서 두 번 출력됩니다.
        for( int i = 0 ; i < students.length ; i++ ) {
            System.out.println((i+1) + "번 학생 등록 : ");
            students[i] = scanner.nextLine();
        }
        //일반 for문
        for( int i = 0 ; i < students.length ; i++) {
            System.out.println(students[i]);
        }
        //향상된 for문
        for(String student : students) {
            System.out.println(student);

        }
    }
}
