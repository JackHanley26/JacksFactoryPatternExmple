package factory;

/**
 * Created by jackhanley on 03/01/2017.
 */
public class Ford implements Car {

    @Override
    public void drive() {
        System.out.println("I am a Ford and I am driving.");
    }
}
