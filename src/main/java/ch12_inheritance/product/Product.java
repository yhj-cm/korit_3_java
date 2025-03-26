package ch12_inheritance.product;


    public class Product extends Item {
        private int price;
        private int stock;
        //빨간줄 생기길래 생성자 만들래서 만들었더니 부모 속성만 받아옴
        //부모의 속성과 자식의 속성을 전부 다 입력해야 하는 AllArgsConstructor

        public Product(String name, String category, int price, int stock) {
            super(name, category);
            this.price = price;
            this.stock = stock;

        }

        static void displayInfo() {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }

   // 이상까지의 코드를 작성했을 때 ProductMain에서 할 수 있는 것
   // 1. 객체 생성을 필드를 전부 초기화했을 때 할 수 있음.
   // 2. 부모 속성이든 자식 속성이든 상관없이 getter / setter

    //고유 메서드












