package CamtGuys.farmapp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CamtGuys.farmapp.model.BigPlant;
import CamtGuys.farmapp.model.Plant;

public class Market {
	List<Plant> seedplant = new ArrayList<Plant>();
	int index;
	Scanner select = new Scanner(System.in);
	int i = 1;

	public void Show(){
		Plant p1 = new BigPlant("Corn",5.0,0,17,"Corn",3);
		seedplant.add(p1);
		p1 = new BigPlant("Watermellon",5.0,0,17,"Watermellon",3);
		seedplant.add(p1);
		for(Plant plant : seedplant){
	
			System.out.println( i + " " + plant.viewDetail());
			i++;
		}
	}
}
