package ch09_classes;

import java.util.Scanner;

public class Car {
    Scanner scanner = new Scanner(System.in);

    int speed;
    String color;


    void drive() {
        System.out.println("운전합니다.");

    }


    void brake() {
        System.out.println("차가 멈춥니다");

    }
}
