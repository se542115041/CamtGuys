package CamtGuys.farmapp.model;

public class Inventory {
	String name;
	int amount;
	
	
	public Inventory(String name, int amount) {
		this.name = name;
		this.amount = amount;
	}
	public Object getName() {
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
