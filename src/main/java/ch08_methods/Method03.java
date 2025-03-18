package ch08_methods;

import java.util.Scanner;

/*
    Method02.java 파일에서 별찍기 관련 method를 구현하고, 실행까지 시켜봤습니다.
    근데 getstar() 메서드를 보면 내부에 if - else if - else 형태의 구문으로
    매개변수를 1-4까지 받아서 출력하게끔 구현되어 있습니다.

    근데 if문을 작성하면 가독성이 떨어지기 때문에
    이걸 째로 switch문으로 교체하여 동일한 기능을 하게끔
    Pefactoring(리팩토링) 과정을 거치고자 합니다.
 */
public class Method03 {
    public static String getStar(int rows, int select) {
        String result = "";
        //여기에 Method02에서 작성한 if 문을 switch문으로 수정할 것
        switch (select) {
            case 1:
                for (int i = 0 ; i < rows + 1 ; i++) {

                    for (int j = 0 ; j < i ; j++ ) {
                        result += "✨";
                    }

                    result += "\n";
                }

                break;
            case 2:
                for(int i = 0 ; i < rows ; i++) {

                    for (int j = 0; j < rows - (i + 1); j++) {
                        result += "  ";
                    }

                    for (int k = 0; k < i + 1; k++) {
                        result += "✨";
                    }

                    result += "\n";
                }

                break;
            case 3:
                for (int i = rows ; i > 0 ; i--) {
                    result +=" ";

                    for (int j = 0; j < i; j++) {
                        result += "✨";
                    }
                    result += "\n";
                }

                break;
            case 4:
                for(int i = 0 ;  i < rows ; i++) {

                    for (int j = 0 ; j < i + 1 ; j++) {
                        result += " ";
                    }
                    for (int j = rows ; j - i > 0 ; j++) {
                        result += "✨";
                    }
                    result += "\n";
                }

                break;
            default:
                result = ("잘못 입력하셨습니다.");
        }



        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowOfstars = 0;
        int choice;
        String starResult = "";

        System.out.print("몇 줄 짜리 별을 생성할까요? >>> ");
        rowOfstars = scanner.nextInt();

        System.out.println("왼쪽으로 치우친 증가하는 별");
        System.out.println("오른쪽으로 치우친 증가하는 별");
        System.out.println("왼쪽으로 치우친 감소하는 별");
        System.out.println("오른쪽으로 치우친 감소하는 별");
        System.out.print("메뉴를 선택하세요>>> ");
        choice = scanner.nextInt();

        starResult = getStar(rowOfstars, choice);
        System.out.println(starResult);



    }

}
//