package CamtGuys.farmapp.model;

import java.util.ArrayList;
import java.util.List;

public class Garden implements Plantable {

	List<Plant> Listofplant = new ArrayList<Plant>();
	
	public void harvestPlant(Plant plant) {
		// TODO Auto-generated method stub
		Listofplant.add(plant);
	}

	public String viewDetailPlant(int index) {
		// TODO Auto-generated method stub
		if(Listofplant.size() == 0){
			return "No Plant";
		}
		else{
			return Listofplant.get(index).viewDetail();
		}
	}

	public void viewDetailAllPlant() {
		int i = 1;
		// TODO Auto-generated method stub
		if(Listofplant.size() == 0){
			System.out.println("No Plant");
		}
		else{
		for(Plant p : Listofplant){
			System.out.println( i + " " + p.viewDetail());
			i++;
		}
		}
	}

}
