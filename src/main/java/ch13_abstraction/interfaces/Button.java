package ch13_abstraction.interfaces;

/*
    인터페이스는 다중 상속이 가능
    단일 상속을 위한 명령어 -> extends
    다중 상속을 위한 명령어 -> implements
 */
public abstract class Button implements Press, Up, Down {

    @Override
    public void onDown() {}

    @Override
    public abstract void onPressed();

    @Override
    public String onUp() {
        return "올립니다.";
    }
}