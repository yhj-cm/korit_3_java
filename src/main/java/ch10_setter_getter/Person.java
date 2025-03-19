package ch10_setter_getter;

public class Person {
    private String name;
    private int age;


    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //setter의 명칭 : set + 필드명으로 짓는 편
    //구조 : call2()유형으로 정의됨.

    public void setName(String name) {
        //이름의 글자 수가 4 초과라면 입력이 불가능 하게끔 로직을 추가하시오.
        //"불가능한 이름 입력입니다" 라고 출력되게끔 하고
        //이름을 바꾸는 데 성공했다면
        //변경 전 이름 :
        //변경 후 이름 :
        // 이 출력되게 하시오. 여기서 name.length()를 응용해야 합니다
        // 그리고 이거 다 끝나셨으면 person1.setName("레오나르도디카프리오')라고
        // 입력하고, 불가능한 이름 입력입니다.를 출력시키시오.
        //그리고 person1.setName()에 여러분 이름을 입력하여
        // 변경 전 이름 :안근수
        // 변경 후 이름 :윤현지 가 나올 수 있도록 작성하시오.

        if (name.length() > 4) {
            System.out.println("불가능한 이름 입력입니다.");

            return;
        }
        System.out.println("변경 전 이름 " + this.name);
        this.name = name;
        System.out.println("변경 후 이름 "+ name);
    }

    public void setAge(int age1) {
        if (age1 <= 0 || age1 >= 200) {
            System.out.println("불가능한 나이 입력입니다.");
            return;   //method 내에 return; 하면 메서드 그대로 종료
        }
        System.out.println("나이가 입력되었습니다.");
        System.out.println("변경 전 나이: " + this.age);
        this.age = age1;
        System.out.println("변경 후 나이: " + age1);
    }


    // Getter 명칭 : Get + 필드명으로 짓는 편
    // 구조 : call3() -> 매개변수 없음 / return 잇음
    // 데이터의 조회만 하면 되기 때문에 매개 변수가 요구되지 않음.
    //필드와 동일한 자료형의 return값이 요구됨. -> void 아님.
    public String getName(String name) {
        this.name = name;
        return name;
    }


}
