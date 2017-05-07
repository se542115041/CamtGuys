package CamtGuys.farmapp.model;

public interface Plant {
	
	void glowUp();
	String viewDetail();
	boolean getStatusWater();
	boolean getStatusHarvest();
	void water();
	boolean canHarvest();
	void setStatusHarvest();
	Inventory harvest();
}
