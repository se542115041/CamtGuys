package CamtGuys.farmapp.model;

public class BigPlant implements Plant {
	private String name;
	private double HP;//HeartPoints
	private int age;//days
	private int ageofFruitable;
	private String fruit;
	
	BigPlant(String name,double HP,int age,int ageofFruitable,String fruit){
		setName(name);
		setHP(HP);
		setAge(age);
		setAgeofFruitable(ageofFruitable);;
		setFruit(fruit);;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setHP(Double HP){
		this.HP = HP;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setAgeofFruitable(int ageofFruitable){
		this.ageofFruitable = ageofFruitable;
	}
	public void setFruit(String fruit){
		this.fruit = fruit;
	}
	public String getName(){
		return this.name;
	}
	public double getHP(){
		return this.HP;
	}
	public int getAge(){
		return this.age;
	}
	public int getAgeofFruitable(){
		return this.ageofFruitable;
	}
	public String getFruit(){
		return this.fruit;
	}


	public String viewDetail() {
		// TODO Auto-generated method stub
		return "Name : " + getName() + " HP = " + getHP() + " Age : " + getAge() + " days AgeofFruitable : " + getAgeofFruitable() + " days Fruit : " + getFruit() ;  
	}

	public void glowUp() {
		this.age = this.age+1;
	}
	
	
}
