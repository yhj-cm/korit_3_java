package ch13_abstraction.interfaces;

public class VolumeUpButton extends Button{
    @Override
    public void onDown() {
        super.onDown();
    }

    @Override
    public void onPressed() {
        System.out.println();

    }

    @Override
    public String onUp() {
        return super.onUp();
    }
}
