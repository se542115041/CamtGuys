package CamtGuys.farmapp.model;

public class BigPlant implements Plant {
	private String name;
	private double HP;//HeartPoints
	private int age;//days
	private int ageofFruitable;
	private String fruit;
	private int numbOfFruit;
	private boolean statusWater;
	
	

	public BigPlant(String name,double HP,int age,int ageofFruitable,String fruit,int numbOfFruit){
		setName(name);
		setHP(HP);
		setAge(age);
		setAgeofFruitable(ageofFruitable);;
		setFruit(fruit);;
		setNumbOfFruit(numbOfFruit);
		this.statusWater = false;
		
	}
	
	public BigPlant(){
		
	}
	public void setStatusWater(boolean status){
		this.statusWater = status;
	}
	public boolean getStatusWater(){
		return this.statusWater;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setHP(Double HP){
		if(HP <= 10.0){
		this.HP = HP;
		}
		else if (HP <= 0){
		this.HP = 0;
		}
		else if (HP > 10){
		this.HP = 10;
		}
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
	
	public void setNumbOfFruit(int numbOfFruit) {
		this.numbOfFruit = numbOfFruit;
	}
	
	public int getNumbOfFruit() {
		if(HP > 8){
			return numbOfFruit + 2;
		}
		else
			return numbOfFruit;
	}


	public String viewDetail() {
		// TODO Auto-generated method stub
		return "Name : " + getName() + " HP = " + getHP() + " Age : " + getAge() + " days AgeofFruitable : " + getAgeofFruitable() + " days Fruit : " + getFruit() ;  
	}

	public void glowUp() {
		this.age = this.age+1;
		if(statusWater == true) setHP(HP + 0.5);
		else if(statusWater == false) setHP(HP - 1);
		this.statusWater = false;
	}

	public void water() {
		// TODO Auto-generated method stub
		this.statusWater = true;
	}

	
	
}
