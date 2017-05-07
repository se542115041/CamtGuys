package CamtGuys.farmapp.model;

import java.util.ArrayList;
import java.util.List;

public class Garden implements Plantable {

	private List<Plant> Listofplant = new ArrayList<Plant>();
	
	public void harvestPlant(Plant plant) {
		// TODO Auto-generated method stub
		getListofplant().add(plant);
	}

	public String viewDetailPlant(int index) {
		// TODO Auto-generated method stub
		if(getListofplant().size() == 0){
			return "No Plant";
		}
		else{
			return getListofplant().get(index).viewDetail() + " StatusWater : " + getListofplant().get(index).getStatusWater();
		}
	}

	public void viewDetailAllPlant() {
		int i = 1;
		// TODO Auto-generated method stub
		if(getListofplant().size() == 0){
			System.out.println("No Plant");
		}
		else{
		for(Plant p : getListofplant()){
			System.out.println( i + " " + p.viewDetail() + " StatusWater : " + p.getStatusWater());
			i++;
		}
		}
	}

	public List<Plant> getListofplant() {
		return Listofplant;
	}

	public void setListofplant(List<Plant> listofplant) {
		Listofplant = listofplant;
	}


}
