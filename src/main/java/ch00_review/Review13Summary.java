package ch00_review;

public class Review13Summary {
    public static void main(String[] args) {
        Character character1 = new Character("전사", 25, "난무");

        // name은 public이기 때문에 직접 참조할 예정
        System.out.println("캐릭터 이름 : " + character1.name);  // 이게 첫 째줄
        // health는 getter를 통해서 받아올 예정
        System.out.println("현재 체력 : " + character1.getHealth());
        character1.attack();    // attack()만 호출
        character1.heal();
        /*
            전사이(가) 25의 힘으로 공격합니다!
            전사이(가) 경험치를 10얻었습니다.    -> attack() 메서드 내에 있는 gainExp(10)이 호출

            class Person{
                private String name;

                public String getName() {
                    return name;
                }

                public void showInfo() {
                    System.out.println("이름은 " + this.getName() + "입니다.");
                }
            }
         */

    }
}
