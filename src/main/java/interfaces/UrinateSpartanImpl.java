package interfaces;

import java.util.Random;

public class UrinateSpartanImpl implements Urinate {
    public int urinate() {
        Random rand = new Random();
        return rand.nextInt(4)+1;
    }
}