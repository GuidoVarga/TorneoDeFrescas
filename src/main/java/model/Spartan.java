package model;

import interfaces.Drink;
import interfaces.DrinkSpartanImpl;
import interfaces.Urinate;
import interfaces.UrinateSpartanImpl;

public class Spartan extends Human {

    private Integer extraTolerance;

    public Spartan(Integer extraTolerance) {
        this.extraTolerance = extraTolerance;
    }

    public Spartan(String name, Integer age, Integer weight, Integer extraTolerance) {
        super(name, age, weight, new UrinateSpartanImpl(), new DrinkSpartanImpl());
        this.extraTolerance = extraTolerance;
    }

    public Integer getExtraTolerance() {
        return extraTolerance;
    }

    public void setExtraTolerance(Integer extraTolerance) {
        this.extraTolerance = extraTolerance;
    }

    @Override
    public String toString() {
        return "Spartan[" +
                " Nombre : " + super.getName() +
                " - Edad : " + super.getAge() +
                " - Peso : " + super.getWeight() +
                " - ToleranciaExtra : " + extraTolerance +
                "]";
    }

    @Override
    public int drink(){
        int chelas = super.drink();
        super.restarChelas(chelas);
        super.sumarOrina(chelas - extraTolerance);
        
        if(super.getOrina() > AGUANTE + extraTolerance){
        	super.setNeedUrinate(true);
        }
        
        return chelas;
    }

    @Override
    public int urinate(){
    	int orina = super.urinate();
    	super.restarOrina(orina);
    	
    	if(super.getOrina() < 0){
    		super.setNeedUrinate(false);
    	}
    	
        return orina;
    }
}