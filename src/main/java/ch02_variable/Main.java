package ch02_variable;
/*
    주석(comment) : Java 프로그램의 경우 폴더 및 파일의 전체 코드를
    컴파일링하는데, 거기서 오류가 하나라도 발생하면 전체 프로그램이 실행x
    하지만 주석 처리를 한 부분에 대해서는 컴퓨터가 코드로 인지하지 않기 때문에
    오류가 발생하지 않습니다

    즉 , 주석이란 컴퓨터가 읽어서 처리하는 부분이 아니라 사람이 읽어서
    정보를 얻을 수 있도록 하는 데에 의의가 있습니다.

     1) 한 줄 주석 : //
     2) 다중 주석: / + shift + 8
     3) 사후 주석 : 주석 처리할 부분의 코드 라인에 ctrl + /

   변수(variable) : 데이터를 담을 수 있는 바구니
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println("hello, java");
//        System.out.println("안녕하세요, 제 이름은 윤현지입니다.");
////        System.out.println(안녕하세요, 제 이름은 윤현지입니다.);
//        System.out.println(123);
//        System.out.println("123");
//        System.out.println(123 + 1);
//        System.out.println("123" + "1");

        // 변수 선언 방법
        // 자료형 변수명 = 데이터;
//        int score = 100;
//        System.out.println(100);
//        System.out.println(score);

        //1, 논리 자료형(boolean) 변수 : 참 / 거짓
//        boolean cheakFlag = false;
//        System.out.println(cheakFlag);
//        cheakFlag = true;
//        System.out.println(cheakFlag);
//
//        // 이상에서 볼 수 있듯이 처음 변수를 언급할 때에는 자료형 변수명 = 데이터;
//        // 의 형태로 작성하지만 다시 대입하는 경우에는 '변수명 = (바뀌는)데이터;'
//        // 형태로 작성함.
//
//        //checkFlag2 = true; -> 얘는 checkFlag2가 처음 등장하는데
//        // 자료명이 명시되지 않아 오류 발생
//        boolean checkFlag3;             //변수를 선언하는 부분 : 자료형 변수명;
//        checkFlag3 = true;              //변수에 처음 값을 대입하는 것을 '초기화'
//        checkFlag3 = false;             //변수에 값을 '재대입'

        //2. 문자 자료형 변수 char
//        char name1 = '윤';   //문자를 입력할 때는 착은 따옴표(')로 감싼다.
//        char name2 = '현';   // char : character의 축약어 알파벳/한글/숫자 하나를 의미
//        char name3 = '지';   // 문자 =/= 문자열

//        System.out.println(name1 + name2 + name3); //157416
//
//        System.out.println("" + name1 + name2 + name3); //윤현지
//
//        System.out.println("" + name2 + name1 + name3);

    /* 이상의 코드에서 확인할 수 있는 것은 컴퓨터는 생각보다 멍청해서 개발자인 저희가
    하나하나 지정을 다 해줘야 한다는 점입니다. 문자와 문자열이 서로 다른 개념인데,
    문자(하나짜리)를 게 번 더햇을 경우 더이상 문자가 아니라 문자열로 인식되기 때문에
    원하는 방식대로 출력이 되지 않습니다.

    그렇기 때문에 저희는 sout();의 ()안에 ""를 넣어줌으로써, () 안의 부분이 전체
    문자'열'로 인식되게끔 꼼수를 부린 부분이 58번 라인에 해당합니다.

    여기서 알 수 있는 점은 sout()의 가장 먼저 나온 데이터의 자료형을 따라간다는 점입니다.
      증거
     */
        System.out.println("123" + 1);      //문자열 + 숫자였는데 1231이 출력됨

        //3. 정수 사료형 변수(int)
        int width1 = 100;
        int width2 = 200;

        System.out.println(width1 + width2);  //숫자끼리는 연산이 가능합니다.

        String width3 = "300";
        String width4 = "400";

        System.out.println(width3 + width4);  //300400

        System.out.println(width1 + width3);  // 정수 + 문자열 = 100300 출력됨
        System.out.println(width4 + width2);  // 문자열 + 정수 = 400200 출력됨

        // 4.실수 자료형 double

        double pi = 3.1415926623;

        System.out.println(19 * pi);

        System.out.println(21 * 21 * pi);
        System.out.println(34 * pi);

        /*
           Java에서의 변수 표기 방식:
                1. 카멜 표기법(Camel Case)를 사용함.
                    : 첫문자는 소문자로 시작 / 복수의 단어로 이루어졌을 경우
                    두 번째 단어의 첫 문자만 대문자
                    ex) 한 단어 짜리 : result
                    ex) myTestResult
                2. 특수문자 지양

                cf) 파이썬 학습하신 분들은 파이썬의 변수 표기 방식은
                Snake Case라고 해서 my_test_result 와 같은 방식으로 표기합니다.



         */
        // 5. 문자열 자료형 String
        // 얘는 아까 언급한 것처럼 대문자로 시작하는 특이한 점이 있습니다.
        String name = "윤현지";
        String major = "시각디자인과";
        String job = "취준생";

        System.out.println(name);
        System.out.println(major);
        System.out.println(job);

        System.out.println("안녕하세요. 제 이름은 " + name +"이고, " + major + " 출신입니다.");

        int age1 = 20;
        String name1 = "윤현지";
        String major1 = "시디과";
        String mbti1 = "ENTP";


        System.out.println("저는 코리아 it 아카데미 3월 국비 과정을 수강하고 있는 " + name1 + "입니다." + age1 + "살입니다.\n");
        System.out.println("제\t 전공은 " + major1 +"이며, mbti는 " + mbti1 + "입니다. 열심히 할게요!");

    }
}
