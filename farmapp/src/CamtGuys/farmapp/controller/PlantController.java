package CamtGuys.farmapp.controller;

import java.util.ArrayList;
import java.util.Scanner;

import CamtGuys.farmapp.model.BigPlant;
import CamtGuys.farmapp.view.prompt;


public class PlantController{
	ArrayList<BigPlant>	bp = new ArrayList<BigPlant>();
	prompt run = new prompt();
	Scanner selectSeed = new Scanner(System.in);
	BigPlant bigPlant = new BigPlant();
	int selectedSeed;

	public ArrayList<BigPlant> plant(){   
		
		
		System.out.println("Select a seed to plant\n"
				+ "1: Papaya\n"
				+ "2: Coconut\n"
				+ "3: Watermellon\n");
		selectedSeed= selectSeed.nextInt();
			if(selectedSeed == 1){
        		
        			bigPlant.setName("Papayafruit");
        			bigPlant.setAge(1);
        			bigPlant.setAgeofFruitable(14);
        			bigPlant.setHP(4.0);
        			bigPlant.setNumbOfFruit(0);
        			
        			bp.add(bigPlant);
        		
        			System.out.println(bp.get(0).getName()+" Seed Planted.");
        			System.out.println(bp.get(0).getHP());
        			System.out.println(bp.get(0).getNumbOfFruit());
        			System.out.println(bp.get(0).getAgeofFruitable());
        			//run.userMenu();
        			//selectSeed.close();
        	}
		
			else if(selectedSeed == 2){
    		
			bigPlant.setName("Coconut");
			bigPlant.setAge(1);
			bigPlant.setAgeofFruitable(14);
			bigPlant.setHP(4.0);
			bigPlant.setNumbOfFruit(0);
			
			bp.add(bigPlant);
		
			System.out.println(bigPlant.getFruit()+" Seed Planted.");
			//selectSeed.close();
			//run.userMenu();
			
			
			}
		
			else if(selectedSeed == 3){
    		
			bigPlant.setName("Watermellon");
			bigPlant.setAge(1);
			bigPlant.setAgeofFruitable(14);
			bigPlant.setHP(4.0);
			bigPlant.setNumbOfFruit(0);
			
			bp.add(bigPlant);
		
		
			System.out.println(bp.get(0).getName()+" Seed Planted.");
			//selectSeed.close();
			//run.userMenu();
			
			
			}
		else {
			System.out.println("Wrong choice!");
			
		}run.userMenu();
			return bp;		
	}	
	public ArrayList<BigPlant> getPlant(){
		return this.bp;
		
	}
}
