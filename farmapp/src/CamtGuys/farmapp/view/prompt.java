package CamtGuys.farmapp.view;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CamtGuys.farmapp.controller.Market;
import CamtGuys.farmapp.controller.PlantController;
import CamtGuys.farmapp.controller.ViewPlantsController;
import CamtGuys.farmapp.model.BigPlant;
import CamtGuys.farmapp.model.Plant;

public class prompt {
	int menu;
	Scanner selectMenu = new Scanner(System.in);
	List<Plant> seedplant = new ArrayList<Plant>();
	ViewPlantsController view = new ViewPlantsController();
	public void userMenu(){
		do{
		System.out.println("Welcome to the World of Garden! Please choose an action\n"
				+ "(1) View Plants\n"
				+ "(2) Plant a plant\n"
				+ "(3) Sleep");
		System.out.println("(4) go to market");
		System.out.println("(0) Exit");
		System.out.println();
		System.out.print("selectMenu : ");
		
		menu = selectMenu.nextInt();
		
	   if(menu == 1){

	        		view.ViewPlants();
	        		
	        		
	   }
	   else if(menu ==2){
		  
	        		PlantController plantController = new PlantController();
	        		plantController.plant();
	        		// selectMenu.close();
	   }
	   else if(menu==3){
		   System.out.println("coming soon!");
		   
		   userMenu();
		   
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



