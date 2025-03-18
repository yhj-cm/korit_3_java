package ch09_classes;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();

        Car Mycar = new Car();

        Mycar.color =" 빨강 ";
        Mycar.speed = 160;

        Car YourCar = new Car();

        YourCar.color = " 노랑 ";
        YourCar.speed = 180;

        Mycar.drive();
        YourCar.brake();

    }
}
