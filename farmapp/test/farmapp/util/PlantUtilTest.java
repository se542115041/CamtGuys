package farmapp.util;

import static org.junit.Assert.*;
import org.junit.Test;

import CamtGuys.farmapp.model.BigPlant;
import CamtGuys.farmapp.util.MathUtil;

public class PlantUtilTest {

	@Test
	public void testAddPlant() {
	String plantName = "Corn";
	double HP = 5.0;
	int age = 3;
	int ageofFruitable = 17;
	String Fruit = "Corn";
	int NumbOfFruit = 3;

	
    BigPlant p1 = new BigPlant("Corn",5.0,3,17,"Corn",3);
    
	assertEquals((p1.getName()),plantName);
	assertEquals((p1.getAge()),age);
	assertEquals((p1.getAgeofFruitable()),ageofFruitable);
	assertEquals((p1.getFruit()),Fruit);
	assertEquals((p1.getNumbOfFruit()),NumbOfFruit);
	assertEquals(p1.getHP(), HP,1-2);
	}

}
