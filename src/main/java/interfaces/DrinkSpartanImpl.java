package interfaces;

import java.util.Random;

public class DrinkSpartanImpl implements Drink {

	 public int drink() {
	        Random rand = new Random();
	        return rand.nextInt(3)+1;
	 } 
}