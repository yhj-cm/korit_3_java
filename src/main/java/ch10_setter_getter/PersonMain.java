package ch10_setter_getter;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person((-10));    //값은 들어가지 않았지만 객체는 생성됨
//        person1.name = "윤현지";
//        System.out.println(person1.name);
//        System.out.println(person1.age);
//        person1.age = 20; // private 적용 후 오류 발생해서 주석처리합니다


        //메서드 호출 방식 : 객체명.메서드명() {}
        person1.setName("윤현지");
        person1.setAge(20);
        person1.setAge(30);


//        person1.setName("레오나르도다빈치");
//        System.out.println(person1.getName());
//        person1.setName("윤현지");
//        System.out.println(person1.getName());



    }

}
