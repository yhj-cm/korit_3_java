package ch10_setter_getter.univ.student;

public class UnivStudentMain {
    public static void main(String[] args) {

        UnivStudent Student1 = new UnivStudent();
        UnivStudent Student2 = new UnivStudent("김이");
        UnivStudent Student3 = new UnivStudent(5);
        UnivStudent Student4 = new UnivStudent("김사",4);
        UnivStudent Student5 = new UnivStudent("김오",2,1.0);

        Student1.setName("김일");
        Student1.setGrade(1);
        Student1.setScore(3.3);

        Student2.setGrade(3);
        Student2.setScore(-30);
        Student2.setScore(4.0);

        Student3.setName("김삼");
        Student3.setGrade(2);
        Student3.setScore(2.7);

        Student4.setScore(3.8);

        Student1.showInfo();
        Student2.showInfo();
        Student3.showInfo();
        Student4.showInfo();
        Student5.showInfo();

    }
}
