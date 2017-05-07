package CamtGuys.farmapp.model;

public class Inventory {
	String name;
	int amount;
	
	
	public Inventory(String name, int amount) {
		setName(name);
		setAmount(amount);
	}
	public Inventory(Inventory harvest) {
		// TODO Auto-generated constructor stub
		setInventory(harvest);
	}
	public void setInventory(Inventory i) {
		this.name =i.name;
		this.amount =i.amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String something) {
		this.name = something;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void showInventory(){
		System.out.println("Inventory : " + name + " amount : " +amount);
	}
	
}
