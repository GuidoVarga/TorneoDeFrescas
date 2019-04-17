package model;

import interfaces.Drink;
import interfaces.Urinate;

public abstract class Human {

    private String name;
    private Integer age;
    private Integer weight;
    private Urinate urinate;
    private Drink drink;
    private Integer orina = 0;
    private boolean needUrinate = false;
    protected Integer chelasRestantes = 0;
    public static final int RESISTENCIA = 2;
    public static final int AGUANTE = 10;
    
    public Human(){

    }

    public Human(String name, Integer age, Integer weight, Urinate urinate, Drink drink) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.urinate = urinate;
        this.drink = drink;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Urinate getUrinate() {
        return urinate;
    }

    public void setUrinate(Urinate urinate) {
        this.urinate = urinate;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public int drink(){
        return getDrink().drink();
    }

    public int urinate(){
        return getUrinate().urinate();
    }

	public Integer getChelasRestantes() {
		return chelasRestantes;
	}

	public void setChelasRestantes(Integer chelasRestantes) {
		this.chelasRestantes = chelasRestantes;
	}

	public void restarChelas(Integer chelas){
		this.chelasRestantes-=chelas;
	}
	
	public Integer getOrina() {
		return orina;
	}

	public void setOrina(Integer orina) {
		this.orina = orina;
	}
	
	public void sumarOrina(Integer orina){
		this.orina+=orina-RESISTENCIA;
	}
	
	public void restarOrina(Integer orina){
		this.orina-=orina;
	}

	public boolean isNeedUrinate() {
		return needUrinate;
	}

	public void setNeedUrinate(boolean needUrinate) {
		this.needUrinate = needUrinate;
	}
}