import factory.Car;
import factory.CarFactory;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the car factory");

        Car car = CarFactory.getInstance().createCar("BMW");
        car.drive();

        Car car2 = CarFactory.getInstance().createCar("Ford");
        car2.drive();


    }
}
