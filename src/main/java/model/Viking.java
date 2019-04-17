package model;
import interfaces.Drink;
import interfaces.DrinkVikingImpl;
import interfaces.Urinate;
import interfaces.UrinateVikingImpl;

public class Viking extends Human {
    private Integer professionalDrinker;

    public Viking(Integer professionalDrinker) {
        super();
        this.professionalDrinker = professionalDrinker;
    }

    public Viking(String name, Integer age, Integer weight, Integer professionalDrinker) {
        super(name, age, weight, new UrinateVikingImpl(), new DrinkVikingImpl());
        this.professionalDrinker = professionalDrinker;
    }

    public Integer getProfessionalDrinker() {
        return professionalDrinker;
    }

    public void setProfessionalDrinker(Integer professionalDrinker) {
        this.professionalDrinker = professionalDrinker;
    }

    @Override
    public String toString() {
        return "Viking [" +
                " Nombre : " + super.getName() +
                " - Edad : " + super.getAge() +
                " - Peso : " + super.getWeight() +
                " - BebedorProfesional : " + professionalDrinker +
                "]";
    }

   @Override
   public int drink(){
 
        int chelas = super.drink() + professionalDrinker;
        super.restarChelas(chelas);
        super.sumarOrina(chelas);
        
        if(super.getOrina() > AGUANTE){
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