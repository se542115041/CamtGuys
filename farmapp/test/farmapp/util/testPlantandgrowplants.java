package farmapp.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import CamtGuys.farmapp.model.BigPlant;
import CamtGuys.farmapp.model.Garden;
import CamtGuys.farmapp.model.Plant;

public class testPlantandgrowplants {
	BigPlant p1 = new BigPlant("Corn",5.0,3,17,"Corn",3);
	int agep1 = p1.getAge();
	Garden g1 = new Garden();
	
	@Test
	public void plantAPlant(){
		g1.getListofplant().add(p1);//plant a plant in Garden.
		assertEquals(p1,g1.getListofplant().get(0));
		}
	@Test
	public void growUpPlant(){
		p1.growUp();
		assertEquals((p1.getAge()),(agep1 + 1));
	}
	
}
