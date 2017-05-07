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
			return getListofplant().get(index).viewDetail() + " StatusWater : " + getListofplant().get(index).getStatusWater() 
					+ " StatusHarvest : " + getListofplant().get(index).getStatusHarvest();
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
			System.out.println( i + " " + p.viewDetail() + " StatusWater : " + p.getStatusWater() 
			+ " StatusHarvest : " + p.getStatusHarvest());
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

	public void viewDetailAllPlantCanHarvest() {
		// TODO Auto-generated method stub
		int i = 1;
		int l = 0;//check Harvest
		for(Plant p : getListofplant()){
			if(p.canHarvest()){
				l++;
			}
		}
		// TODO Auto-generated method stub
		if(!checkPlantCanHarvest()){
			System.out.println("No Plant");
		}
		else{
		for(Plant p : getListofplant()){
			if(p.canHarvest()){
			System.out.println( i + " " + p.viewDetail() + " StatusWater : " + p.getStatusWater()
			+ " StatusHarvest : " + p.getStatusHarvest());
			}
			i++;
		}
		}
		
	}

	public boolean checkPlantCanHarvest() {
		// TODO Auto-generated method stub
		int l = 0;//check Harvest
		for(Plant p : getListofplant()){
			if(p.canHarvest()){
				l++;
			}
		}
		if(l == 0){
			return false;
		}
		else return true;
	}


}
