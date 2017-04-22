package CamtGuys.farmapp.view;
import java.util.ArrayList;
import java.util.Scanner;

import CamtGuys.farmapp.controller.PlantController;
import CamtGuys.farmapp.controller.ViewPlantsController;
import CamtGuys.farmapp.model.BigPlant;

public class prompt {
	int menu;
	Scanner selectMenu = new Scanner(System.in);
	
	ViewPlantsController view = new ViewPlantsController();
	public void userMenu(){

		System.out.println("Welcome to the World of Garden! Please choose an action\n"
				+ "(1) View Plants\n"
				+ "(2) Plant a plant\n"
				+ "(3) Sleep\n");
		
		menu = selectMenu.nextInt();
		
	   if(menu == 1){
		   selectMenu.close();
	        		view.ViewPlants();
	        		
	        		
	   }
	   else if(menu ==2){
		  
	        		PlantController plantController = new PlantController();
	        		plantController.plant();
	        		// selectMenu.close();
	   }
	   else if(menu==3){
		   selectMenu.close();
		   System.out.println("coming soon!");
		   
		   userMenu();
		   
	    }
	   else{
		   selectMenu.close();
		   System.out.println("you're drunk!");
		   selectMenu.close();
	   }
	}
}



