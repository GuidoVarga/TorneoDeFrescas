package model;

import interfaces.DrinkSpartanImpl;
import interfaces.UrinateSpartanImpl;

public class Mestizo extends Human {
	
	private Integer extraTolerance;
	private Integer professionalDrinker;

    public Mestizo(Integer extraTolerance, Integer professionalDrinker) {
        this.extraTolerance = extraTolerance;
        this.professionalDrinker = professionalDrinker;
    }

    public Mestizo(String name, Integer age, Integer weight, Integer extraTolerance, Integer professionalDrinker) {
        super(name, age, weight, new UrinateSpartanImpl(), new DrinkSpartanImpl());
        this.extraTolerance = extraTolerance;
        this.professionalDrinker = professionalDrinker;
    }

    public Integer getExtraTolerance() {
        return extraTolerance;
    }

    public void setExtraTolerance(Integer extraTolerance) {
        this.extraTolerance = extraTolerance;
    }
    
    public Integer getProfessionalDrinker() {
        return professionalDrinker;
    }

    public void setProfessionalDrinker(Integer professionalDrinker) {
        this.professionalDrinker = professionalDrinker;
    }

    @Override
    public String toString() {
        return "Mestizo[" +
                " Nombre : " + super.getName() +
                " - Edad : " + super.getAge() +
                " - Peso : " + super.getWeight() +
                " - ToleranciaExtra : " + extraTolerance +
                "]";
    }

    @Override
    public int drink(){
        int chelas = super.drink() + professionalDrinker;;
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
