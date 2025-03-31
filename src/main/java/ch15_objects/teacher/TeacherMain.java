package ch15_objects.teacher;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("안근수","코리아아카데미");
        Teacher teacher2 = new Teacher("안근수","코리아아카데미");

        boolean result1 = teacher1.equals(teacher2);
        System.out.println(result1); // true  -> 객체 상에서의 .equals()
        boolean result2 = teacher1 == teacher2;
        System.out.println(result2); //false  -> 주소지까지 같은지를 확인

        System.out.println(teacher1);

        Class tClass = teacher1.getClass();
        System.out.println(tClass);
        System.out.println(teacher1.getClass().getSimpleName());        //Teacher
        System.out.println(tClass.getSimpleName());                     //Teacher


        Field[] fields = tClass.getDeclaredFields();
        System.out.println(fields);
        for (int i = 0 ; i < fields.length ; i++) {
            System.out.println("필드명 출력 " + fields[i].getname());
            System.out.println("패키지 + 클래스명 출력 " + fields[i].getType());
            System.out.println("클래스명 출력 " + fields[i].getSimpleName());
        }

        for (Method method : methods) {
        }

        // 이상의 field의 element를 출력하는 반복문을 참고하여 향상된 for문으로 작성하세요



        //Steing 상에서 지난번에 굳이 new String("안녕하세요")와 "안녕하세요"가 false인 걸 증명했는데
        //어느 정신나간 사람이 굳이 new String으로 만들겠나



//        String[] strArray2 = {"안녕하세요", "안녕하세요"};
//        boolean result5 = strArray[0].equals(strArray2[0]);
//        System.out.println(result5);     //true
//        boolean result6 = strArray[0] == strArray2[1];
//        System.out.println(result6);



    }
}
