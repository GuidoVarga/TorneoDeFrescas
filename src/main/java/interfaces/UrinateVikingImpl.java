package interfaces;

import java.util.Random;

public class UrinateVikingImpl implements Urinate {
   
    public int urinate() {
        Random rand = new Random();
        return rand.nextInt(3)+1;
    }
}