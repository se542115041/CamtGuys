package CamtGuys.farmapp.view;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CamtGuys.farmapp.controller.Market;
import CamtGuys.farmapp.controller.PlantController;
import CamtGuys.farmapp.controller.ViewPlantsController;
import CamtGuys.farmapp.model.BigPlant;
import CamtGuys.farmapp.model.Garden;
import CamtGuys.farmapp.model.Inventory;
import CamtGuys.farmapp.model.Plant;

public class prompt {
	int menu;
	Scanner selectMenu = new Scanner(System.in);
	List<Plant> seedplant = new ArrayList<Plant>();
	ViewPlantsController view = new ViewPlantsController();
	Garden garden = new Garden();
	List<Inventory> inventory = new ArrayList<Inventory>();
	
	public void userMenu(){
		seedplant.add(new BigPlant("Corn",5.0,0,17,"Corn",3));
		seedplant.add(new BigPlant("Corn",5.0,0,17,"Corn",3));
		garden.getListofplant().add(new BigPlant("Corn",5.0,20,17,"Corn",3));
		garden.getListofplant().add(new BigPlant("Corn",10,30,17,"Corn",3));
		garden.getListofplant().add(new BigPlant("Corn",10,1,17,"Corn",3));
		inventory.add(new Inventory("Corn",4));
		do{
		System.out.println("Welcome to the World of Garden! Please choose an action\n"
				+ "(1) View Plants\n"
				+ "(2) Plant a plant\n"
				+ "(3) Sleep");
		System.out.println("(4) Go to market");
		System.out.println("(5) Water a plant");
		System.out.println("(6) Harvest a plant");
		System.out.println("(7) View Inventory");
		System.out.println("(0) Exit");
		System.out.println();
		System.out.print("selectMenu : ");
		
		menu = selectMenu.nextInt();
		
		//view Plants
	   if(menu == 1){

		   garden.viewDetailAllPlant();
	        		
	        		
	   }
	   
	   //Plant a Plant
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
			   p.setStatusHarvest();
		   }
		   
	    }
	   
	   //go to market
	   else if(menu==4){
		   System.out.println("go to market");
		   Market market = new Market();
		   market.Show();
		   System.out.print("Choose your seed : ");
		   menu = selectMenu.nextInt();	
		   seedplant.add(market.Buy(menu-1));
	    }
	   
	   //water a plant
	   else if(menu==5){
		   selectMenu.reset();
		   garden.viewDetailAllPlant();	   
		   System.out.print("Choose your Plant : ");
		   menu = selectMenu.nextInt();	
		   garden.getListofplant().get(menu - 1).water();
	   }
	   
	   //Harvest a plant
	   else if(menu==6){
		   selectMenu.reset();
		   garden.viewDetailAllPlantCanHarvest();
		   if(garden.checkPlantCanHarvest()){
			   System.out.print("Choose your Plant : ");
			   menu = selectMenu.nextInt();
			   inventory.add(garden.getListofplant().get(menu - 1).harvest());
		   }
	   }
	   
	   //View Inventory
	   else if(menu==7){
		   selectMenu.reset();
		   int select;//Inventory
		   int select2;//Options
		   for(Inventory inv : inventory){
			   inv.showInventory();
		   }
		   System.out.print("Choose your Inventory : ");
		    select = selectMenu.nextInt();
		    selectMenu.reset();
			System.out.println("(1) View fruit");
			System.out.println("(2) Eat fruit");
			System.out.println("(3) Delete fruit");
			System.out.print("Choose your Options : ");
			select2 = selectMenu.nextInt();
			if(select2 == 1){
				inventory.get(select-1).showInventory();
			}
			else if(select2 == 2){
				System.out.println(inventory.get(select-1).getName() + " is yummy");
				inventory.get(select-1).setAmount(inventory.get(select-1).getAmount() - 1);
			}
			else if(select2 == 3){
				inventory.remove(select-1);
			}
			else{
				   System.out.println("you're drunk!");
			 }
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



