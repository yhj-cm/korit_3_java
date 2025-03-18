package ch09_classes.products;

public class Product {
    int ProductNum;
    String ProductName;

    Product() {};

    Product(int productNum) {
        this.ProductNum = productNum;

    }

    Product(String productName) {
        this.ProductName = productName;
    }

    Product(int productNum,String productName) {
        this.ProductNum = productNum;
        this.ProductName = productName;



    }








    void showInfo() {
        System.out.println("시리얼 넘버 : " + ProductNum);
        System.out.println("제품 타이틀 : " + ProductName);
    }
}
