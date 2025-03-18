package ch07_loops;
/*
    중첩 while문(Nested while loop)
    while(조건식1) {
       반복실행문1-a
       while(조건식2) {
           반복실행문2

       }
       반복실행문1-b
   }
 */
public class Loop02 {
    public static void main(String[] args) {
        int day = 1;
        int lesson = 1;
        //1일차 1교시입니다.~ 1일차 3교시입니다. / 5일차 3교시입니다.
        while(day < 6) {
            while (lesson < 4) {
                System.out.println(day + "일차 " + lesson + "교시입니다.");
                lesson++;
            }
            day++;
        }


        // 이상의 코드를 활용하여
        /*
            2 x 1 = 2
            2 x 2 = 4
            ...
            9 x 9 = 81
         */

        int dan = 1;

        int num = 1;

        while(dan < 10) {
            while(num < 10) {
                System.out.println(dan + "x" + num + "=" + dan * num);
                dan++;
                num++;
            }
            }
    }
}
