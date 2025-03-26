package ch13_abstraction;

public abstract class Factory {
    private String name;

    public Factory(String name) {
        this.name = name;
    }

    // 추상 메서드: 각 공장에서 제품을 생산하는 방법을 정의하는 메서드
    public abstract void produce(String model);

    // 추상 메서드: 공장의 관리를 담당하는 메서드
    public abstract void manage();

    // 선택적으로 공장의 이름을 반환하는 메서드
    public String getName() {
        return name;
    }
}
    // 아까 팝업뜨는 거 확인해보니까 method body라는 부분이 저희가 말하는
    // 구현부에 해당하고, 코드로는 {}라는 사실을 확인할 수 있었습니다.
    /*
        근데 abstract가 접근 지정자와 리턴 타입 사이에 명시가 되면,
        클래스도 동일하게 접근 지정자와 class 사이에 abstract가 있어야만 합니다.

        왜?
        추상 메서드가 하나라도 있으면 추상 클래스가 돼야 하니까.
     */



