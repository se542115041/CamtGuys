package farmapp.util;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import CamtGuys.farmapp.model.BigPlant;
import CamtGuys.farmapp.model.Inventory;
import CamtGuys.farmapp.model.Plant;

public class TestwaterandHPandInventory {
	double p1HP = 5.0;
	BigPlant p1 = new BigPlant("Corn",p1HP,3,17,"Corn",3);
	int amount = 3;
	Plant p2 = new BigPlant("Corn",10,20,17,"Corn",amount);
	Plant p3 = new BigPlant("Corn",5,20,17,"Corn",amount);
	Plant p4 = new BigPlant("Corn",5,20,17,"Corn",3);
	List<Inventory> inv = new ArrayList<Inventory>();
	@Test
	public void waterAPlant(){
		assertEquals(p1.getStatusWater(),false);
		p1.water();
		assertEquals(p1.getStatusWater(),true);
		p1.growUp();
		assertEquals(p1.getHP(),p1HP+0.5,1-2);
		p1.growUp();
		assertEquals(p1.getHP(),p1HP+0.5-1,1-2);
		}
	@Test
	public void HighHpHighFruit(){
		inv.add(p2.harvest());
		inv.add(p3.harvest());
		assertEquals(inv.get(0).getAmount(),amount+2);//p2
		assertEquals(inv.get(1).getAmount(),amount);//p3
	}
	@Test
	public void testInventory(){
		Inventory i = new Inventory("something",5);
		Inventory f = new Inventory(p4.harvest());
		
	}
}
