package ch00_review;

import java.util.Scanner;

/*
    Constructor (생성자) : 객체가 생성될 때 호출되는 특별한 메서드
    특징 :
        1) 클래스명과 생성자명은 동일
        2) 기본 생성자 / 매개변수 생성자
            a. 기본생성자 : 정의하지 않아도 default로 있지만,
                생성자를 하나라도 정의하는 순간 기본 생성자도 적어야함.
            b. 매개변수 생성자 : 객체를 생성할 때 필수적으로 요구되어지는
                속성을 명시한 생성자
        3) return 이 없다. call1()이거나(기본생성자) call2()거나(매개변수생성자)
        4) 형식 :
            a. 기본생성자
                클래스명() {}
            b. 매개변수생성자
                클래스명(매개변수1, 매개변수2) {
                    this.매개변수1 = 매개변수1;
                    this.매개변수2 = 매개변수2;
                }
    생성 방법 :
        1) 일일이 타이핑한다
        2)

 */
class building {
    Scanner scanner = new Scanner(System.in);
    //필드 선언
    int wall;
    int door;
    int window;
    String title;
    boolean elevator;
    boolean stair;

    public building() {
    }

    public building(String title) {
        this.title = title;

    }

    public building(int wall, int door, int window, String title, boolean elevator, boolean stair) {
        this.wall = wall;
        this.door = door;
        this.window = window;
        this.title = title;
        this.elevator = elevator;
        this.stair = stair;


    }


    void showInfo() {
        System.out.println("\n엘리베이터 -> " + elevator);
        System.out.println("계단 -> " + stair);
        System.out.println("벽 -> " + wall);
        System.out.println("문 -> " + door);
        System.out.println("창문 -> " + window);
        System.out.println("이름 -> " + title);

    }

    //기본 생성자 정의

    //이름만 있는 매개변수 생성자 정의

    //전부 다 있는 매개변수 생성자 정의

    /*
        Review08 클래스에서 Building 클래스의 객체를 생성
        1.Building1 -> 기본생성자로 정의
            엘리베이터 -> 없음
            계단 - 없음
            벽 - 5
            문 - 2
            창문 - 6
            이름 - 재팬아이티타운

            1.Building1 -> 기본생성자로 정의
            엘리베이터 -> 있음
            계단 - 있음
            벽 - 8
            문 - 4
            창문 - 230
            이름 - 코리아아이티타운

            1.Building1 -> 기본생성자로 정의
            엘리베이터 -> 있음
            계단 - 있음
            벽 - 3
            문 - 1
            창문 - 0
            이름 - 컴퓨터타운

            4.showInfo() 메서드를 정의 -> call1()유형으로 정의
            building1.showInfo();와 같은 방식으로 호출
            실행 예
            이 건물은 컴퓨터타운이고, 벽이 3개, 문이 1개, 창문이 0개 있습니다.
            엘리베이터 유무 : false
            계단 유무 :true



     */
}


public class Review08 {
    public static void main(String[] args) {

        building building1 = new building();
        building building2 = new building("코리아아이티타운");
        building building3 = new building(3, 1, 0, "컴퓨터타운",false,true);


        building1.elevator = false;
        building1.stair = false;
        building1.wall = 5;
        building1.door = 2;
        building1.window = 6;
        building1.title = "재팬아이티타운";

        building2.elevator = true;
        building2.stair = true;
        building2.wall = 8;
        building2.door = 4;
        building2.window = 230;

        building1.showInfo();
        building2.showInfo();
        building3.showInfo();







    }
}
