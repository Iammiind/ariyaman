package ariyamanTeam.farmapp.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import ariyamanTeam.farmapp.model.Plant;
import ariyamanTeam.farmapp.model.impl.FirefruitTree;
import ariyamanTeam.farmapp.model.impl.MoonpeachTree;
import ariyamanTeam.farmapp.model.impl.PapayaTree;

public class TestController {
	@Test
	public void plantSeedPapayaTree() {
		Controller controller = new Controller();
		controller.plantSeed(1);
		for(Plant plant : controller.plants) {
			if(plant instanceof PapayaTree) {
				return;
			}
		}
		fail();
	}
	
	@Test
	public void plantSeedMoonpeachTree() {
		Controller controller = new Controller();
		controller.plantSeed(2);
		for(Plant plant : controller.plants) {
			if(plant instanceof MoonpeachTree) {
				return;
			}
		}
		fail();
	}
	
	@Test
	public void plantSeedFirefruitTree() {
		Controller controller = new Controller();
		controller.plantSeed(3);
		for(Plant plant : controller.plants) {
			if(plant instanceof FirefruitTree) {
				return;
			}
		}
		fail();
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
