package ch12_array;

public class Array10 {
    public static void main(String[] args) {

        String[] persons = { "강수림", "기준성", "김미진", "김준식",
                "문성진", "심민호", "양지은", "유지현", "윤현지", "이동규",
                "이예성", "이정화", "전용남", "채수원", "한영진"};

        //일반 for문
        for ( int i = 0; i < persons.length ; i++) {
            System.out.println((i+1) + "분" + persons[i] + "님");
        }

        //향상된 for문
        int number = 1;
        for (String person : persons) {
            System.out.println(number + "번 : " + person + " 님");
            number++;
        }
    }
}
