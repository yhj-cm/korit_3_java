package ch12_inheritance.product;

public class ProductMain {
    public static void main(String[] args) {
        //  Item item1 = new Item(); -> 여기서 오류 발생하는건 여기서 수정 불가능
        // AllarguConstructor인데 () 안에 argument 안 집어넣어서
//        Item item1 = new Item("일반 상품","일반 카테고리");
//        System.out.println("이 상품은 " + item1.getName() + "입니다.");
//        System.out.println("이 상품은 " + item1.getCategory() + "입니다.");
        // Item 클래스 건드리지 말고 getter 이용해서 다음과 같은 출력문이 나오도록 작성하시오
        // 이 상품은 일반 상품입니다.
        // 이 상품은 일반 카테고리입니다.
        Product product1 = new Product("전자제품","가전제품",100000,10);
        product1.setCategory("백색 가전제품");
        System.out.println("해당 제품은 " + product1.getCategory() + "입니다.");

        product1.displayInfo();



    }


}
