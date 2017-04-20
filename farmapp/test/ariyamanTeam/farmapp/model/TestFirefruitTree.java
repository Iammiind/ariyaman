package ariyamanTeam.farmapp.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFirefruitTree {

	@Test
	public void getName() {
		FirefruitTree test = new FirefruitTree();
		test.getName();
		assertEquals(test.getName(), "Firefruit Tree");
	}
	
	@Test
	public void getAge(){
		FirefruitTree test = new FirefruitTree();
		test.getAge();
		assertEquals(test.getAge(), 5);
	}
	
	@Test
	public void getrealAge(){
		FirefruitTree test = new FirefruitTree();
		test.getrealAge();
		assertEquals(test.getrealAge(),0);
	}
	
	@Test
	public void getHealth(){
		FirefruitTree test = new FirefruitTree();
		test.getHealth();
		assertEquals(test.getHealth(),5);
	}
	
	@Test
	public void getrealHealth(){
		FirefruitTree test = new FirefruitTree();
		test.getrealHealth();
		assertEquals(test.getrealHealth(),5);
	}
	
	@Test
	public void getWater(){
		FirefruitTree test = new FirefruitTree();
		test.getWater();
		assertEquals(test.getWater(),5);
	}
	
	@Test
	public void getrealWater(){
		FirefruitTree test = new FirefruitTree();
		test.getrealWater();
		assertEquals(test.getrealWater(),5);
	}
	
	@Test
	public void getFruitStatusSeedling(){
		FirefruitTree test = new FirefruitTree();
		test.increaseAge();
		test.getStatus();
		test.getFruit();
		assertEquals(test.getFruit(),"raw");
	}
	
	@Test
	public void getFruitStatusMature(){
		FirefruitTree test = new FirefruitTree();
		test.increaseAge();
		test.increaseAge();
		test.increaseAge();
		test.getStatus();
		test.getFruit();
		assertEquals(test.getFruit(),"ripe");
	}
	
	@Test
	public void getStatusSeed(){
		FirefruitTree test = new FirefruitTree();
		test.getrealAge();
		test.getStatus();
		assertEquals(test.getStatus(),"seed");
	}
	
	@Test
	public void getStatusSeedling(){
		FirefruitTree test = new FirefruitTree();
		test.increaseAge();
		test.getrealAge();
		test.getStatus();
		assertEquals(test.getStatus(),"seedling");
	}
	
	@Test
	public void getStatusMature(){
		FirefruitTree test = new FirefruitTree();
		test.increaseAge();
		test.increaseAge();
		test.increaseAge();
		test.increaseAge();
		test.getrealAge();
		test.getStatus();
		assertEquals(test.getStatus(),"mature");
	}
	
	@Test
	public void getStatusDead(){
		FirefruitTree test = new FirefruitTree();
		test.increaseAge();
		test.increaseAge();
		test.increaseAge();
		test.increaseAge();
		test.increaseAge();
		test.getrealAge();
		test.getAge();
		test.getStatus();
		assertEquals(test.getStatus(),"dead");
	}
	
	@Test
	public void increaseAge(){
		FirefruitTree test = new FirefruitTree();
		test.getFruit();
		test.getrealAge();
		assertEquals(test.getrealAge(),0);
	}
	
	@Test
	public void reduceHealth(){
		FirefruitTree test = new FirefruitTree();
		test.reduceWater();
		test.reduceWater();
		test.reduceWater();
		test.reduceWater();
		test.reduceWater();
		test.reduceHealth();
		assertEquals(test.realHealth, 4);
	}
	
	@Test
	public void reduceWater(){
		FirefruitTree test = new FirefruitTree();
		test.getFruit();
		test.getrealWater();
		assertEquals(test.getrealWater(),5);
	}
	
	@Test
	public void increaseWater(){
		FirefruitTree test = new FirefruitTree();
		test.getFruit();
		test.getrealWater();
		assertEquals(test.getrealWater(),5);
	}
}
