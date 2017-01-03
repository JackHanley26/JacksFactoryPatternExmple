package factory;

/**
 * Created by jackhanley on 03/01/2017.
 */
public class CarFactory {

    private static CarFactory carFactory = null;


    public static CarFactory getInstance(){
        if(carFactory == null){
            carFactory = new CarFactory();
        }
        return carFactory;
    }

    public Car createCar(String carType) {

        if (carType.equalsIgnoreCase("Ford")) {
            return new Ford();
        } else if (carType.equalsIgnoreCase("BMW")) {
            return new BMW();
        } else {
            System.out.println("Car type not found");
            return null;
        }
    }
}
