package factory;

/**
 * Created by jackhanley on 03/01/2017.
 */
public class BMW implements Car{

    @Override
    public void drive() {
        System.out.println("I am a BMW and I am driving.");
    }
}
