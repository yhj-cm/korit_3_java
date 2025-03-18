package ch09_classes.products;

import java.util.Scanner;

/*
    Product.java에 여러 가지 생성자를 정의하세요.
    필드는

    int productNum;
    String productName;

    메서드

    showInfo() -> productNum과 String productName 정보가 콘솔에 출력되도록 작성

    필드가 두개이기 때문에 생성자가 만들어질 경우의 수는 네 가지

    1.기본 생성자를 사용하여 객체를 생성하세요 product1
        productNum  123456
        productName Lg엘패드

    2. 시리얼 넘버를 기본으로 입력하는 매개변수 생성자를 통해
        객체를 생성하시오. product2
        productNum  9876564
        productName 다이소충전기

    3. 제품명을 기본으로 입력하는 매개변수 생성자를 통해
        객체를 생성하시오 product3
        productNum  159357
        productName USB 케이블

    4. AllArgsConstructor를 이용하여 객체 생성하시오. product4
        productNum 951753
        productName GFlip6
    5. 정보를 출력하는 showInfo() (call1타입으로 정의할것)의 콘솔창 결과는
    다음과 같습니다.




 */
public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product product1 = new Product();
        Product product2 = new Product(9876564);
        Product product3 = new Product("USB-C케이블");
        Product product4 = new Product(951753, "GFlip6");


        product1.ProductNum = 123456;
        product1.ProductName = "LG엘패드";

        product2.ProductName = "다이소 충전기";

        product3.ProductNum = 159357;


        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
        product4.showInfo();


    }
}
