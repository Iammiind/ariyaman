package ariyamanTeam.farmapp.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import ariyamanTeam.farmapp.model.Fruit;
import ariyamanTeam.farmapp.model.Plant;
import ariyamanTeam.farmapp.model.impl.Farmer;
import ariyamanTeam.farmapp.model.impl.Firefruit;
import ariyamanTeam.farmapp.model.impl.FirefruitTree;
import ariyamanTeam.farmapp.model.impl.Moonpeach;
import ariyamanTeam.farmapp.model.impl.MoonpeachTree;
import ariyamanTeam.farmapp.model.impl.Papaya;
import ariyamanTeam.farmapp.model.impl.PapayaTree;

public class TestController {
	@Test
	public void plantSeedPapayaTree() {
		Controller controller = new Controller();
		controller.plantSeed(1);
		for(Plant plant : controller.plants) {			
			assertTrue(plant instanceof PapayaTree);
		}
	}
	
	@Test
	public void plantSeedMoonpeachTree() {
		Controller controller = new Controller();
		controller.plantSeed(2);
		for(Plant plant : controller.plants) {
			assertTrue(plant instanceof MoonpeachTree);
		}
	}
	
	@Test
	public void plantSeedFirefruitTree() {
		Controller controller = new Controller();
		controller.plantSeed(3);
		for(Plant plant : controller.plants) {
			assertTrue(plant instanceof FirefruitTree);
		}
	}
	
	@Test
	public void watering() {
		Controller controller = new Controller();
		controller.watering();
		for(Plant plant : controller.plants) {
			assertEquals(plant.getrealWater(), 1);
		}
	}
	
	@Test
	public void harvestingPapaya() {
		Controller controller = new Controller();
		controller.plantSeed(1);
		controller.harvesting(1-1);
		
		for(Fruit fruit : controller.fruits) {
			assertTrue(fruit instanceof Papaya);
		}
	}
	
	@Test
	public void harvestingMoonpeach() {
		Controller controller = new Controller();
		controller.plantSeed(2);
		controller.harvesting(1-1);
		
		for(Fruit fruit : controller.fruits) {
			assertTrue(fruit instanceof Moonpeach);
		}
	}
	
	@Test
	public void harvestingFirefruit() {
		Controller controller = new Controller();
		controller.plantSeed(3);
		controller.harvesting(1-1);
		
		for(Fruit fruit : controller.fruits) {
			assertTrue(fruit instanceof Firefruit);
		}
	}
	
	@Test
	public void addPapayaToInventory() {
		Controller controller = new Controller();
		controller.plantSeed(1);
		controller.harvesting(1-1);
		controller.addProductToInventory();
		
		for(Fruit fruit : controller.fruits) {
			assertFalse(fruit instanceof Papaya);
		}
	}
	
	@Test
	public void addMoonpeachToInventory() {
		Controller controller = new Controller();
		controller.plantSeed(2);
		controller.harvesting(1-1);
		controller.addProductToInventory();
		
		for(Fruit fruit : controller.fruits) {
			assertFalse(fruit instanceof Moonpeach);
		}
	}
	
	@Test
	public void addFirefruitToInventory() {
		Controller controller = new Controller();
		controller.plantSeed(3);
		controller.harvesting(1-1);
		controller.addProductToInventory();
		
		for(Fruit fruit : controller.fruits) {
			assertFalse(fruit instanceof Firefruit);
		}
	}
	
	@Test
	public void eatPapaya() {
		Controller controller = new Controller();
		Farmer user = new Farmer();
		controller.papayaAmount = 1;
		controller.eatFruit(user, "papaya");
		
		assertEquals(controller.papayaAmount, 0);
	}
	
	@Test
	public void eatMoonpeach() {
		Controller controller = new Controller();
		Farmer user = new Farmer();
		controller.moonPeachAmount = 1;
		controller.eatFruit(user, "moonPeach");
		
		assertEquals(controller.moonPeachAmount, 0);
	}
	
	@Test
	public void eatFirefruit() {
		Controller controller = new Controller();
		Farmer user = new Farmer();
		controller.fireFruitAmount = 1;
		controller.eatFruit(user, "fireFruit");
		
		assertEquals(controller.fireFruitAmount, 0);
	}
	
	@Test
	public void destroyPapaya() {
		Controller controller = new Controller();
		controller.papayaAmount = 5;
		controller.destroysFruit("papaya");
		
		assertEquals(controller.papayaAmount, 0);
	}
	
	@Test
	public void destroyMoonpeach() {
		Controller controller = new Controller();
		controller.moonPeachAmount = 8;
		controller.destroysFruit("moonPeach");
		
		assertEquals(controller.moonPeachAmount, 0);
	}
	
	@Test
	public void destroyfireFruit() {
		Controller controller = new Controller();
		controller.fireFruitAmount = 4;
		controller.destroysFruit("fireFruit");
		
		assertEquals(controller.fireFruitAmount, 0);
	}
	
	@Test
	public void sleep1day() {
		Controller controller = new Controller();
		controller.plantSeed(1);
		controller.plantSeed(2);
		controller.plantSeed(3);
		controller.sleep1day();
		
		for(Plant plant : controller.plants) {
			assertEquals(plant.getrealAge(), 1);
		}
		
	}
}
