package CamtGuys.farmapp.view;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CamtGuys.farmapp.controller.Market;
import CamtGuys.farmapp.controller.PlantController;
import CamtGuys.farmapp.controller.ViewPlantsController;
import CamtGuys.farmapp.model.BigPlant;
import CamtGuys.farmapp.model.Garden;
import CamtGuys.farmapp.model.Plant;

public class prompt {
	int menu;
	Scanner selectMenu = new Scanner(System.in);
	List<Plant> seedplant = new ArrayList<Plant>();
	ViewPlantsController view = new ViewPlantsController();
	Garden garden = new Garden();
	public void userMenu(){
		seedplant.add(new BigPlant("Corn",5.0,0,17,"Corn",3));
		seedplant.add(new BigPlant("Corn",5.0,0,17,"Corn",3));
		do{
		System.out.println("Welcome to the World of Garden! Please choose an action\n"
				+ "(1) View Plants\n"
				+ "(2) Harvest a plant\n"
				+ "(3) Sleep");
		System.out.println("(4) Go to market");
		System.out.println("(5) Water a plant");
		System.out.println("(0) Exit");
		System.out.println();
		System.out.print("selectMenu : ");
		
		menu = selectMenu.nextInt();
		//view Plants
	   if(menu == 1){

		   garden.viewDetailAllPlant();
	        		
	        		
	   }
	   //harvest Plants
	   else if(menu ==2){
		   selectMenu.reset();
		   int i = 1;

			for(Plant plant : seedplant){
				
				System.out.println( i + " " + plant.viewDetail());
				i++;
			}
			
			System.out.print("Choose your seed : ");
			menu = selectMenu.nextInt();
			garden.harvestPlant(seedplant.get(menu - 1));
		   
	   }
	   //Sleep
	   else if(menu==3){
		   for(Plant p : garden.getListofplant()){
			   p.glowUp();
			   
		   }
		   
	    }
	   //go to market
	   else if(menu==4){
		   System.out.println("go to market");
		   Market market = new Market();
		   market.Show();
		   userMenu();
		   
	    }
	   //water a plant
	   else if(menu==5){
		   selectMenu.reset();
		   garden.viewDetailAllPlant();	   
		   System.out.print("Choose your Plant : ");
		   menu = selectMenu.nextInt();
		   garden.getListofplant().get(menu - 1).water();
	   }
	   //exit
	   else if(menu==0){
		   System.out.println("bye bye!");

	   }
	   else{
		   System.out.println("you're drunk!");

	   }
	   selectMenu.reset();
	}while(menu != 0);
		   selectMenu.close();
	}
}



