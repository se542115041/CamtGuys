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
				+ "(2) Plant a plant\n"
				+ "(3) Sleep");
		System.out.println("(4) go to market");
		System.out.println("(5) water plant");
		System.out.println("(0) Exit");
		System.out.println();
		System.out.print("selectMenu : ");
		
		menu = selectMenu.nextInt();
		
	   if(menu == 1){

		   garden.viewDetailAllPlant();
	        		
	        		
	   }
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
	   else if(menu==3){

		   
	    }
	   else if(menu==4){
		   System.out.println("go to market");
		   Market market = new Market();
		   market.Show();
		   userMenu();
		   
	    }
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



