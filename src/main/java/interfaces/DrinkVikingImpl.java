package interfaces;

import java.util.Random;

public class DrinkVikingImpl implements Drink {


    public int drink() {
        Random rand = new Random();
        return rand.nextInt(4)+1;
    }
}