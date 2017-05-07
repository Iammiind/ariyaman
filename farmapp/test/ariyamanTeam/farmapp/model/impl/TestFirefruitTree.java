package ariyamanTeam.farmapp.model.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import ariyamanTeam.farmapp.model.impl.FirefruitTree;

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
		assertEquals(test.getAge(), 10);
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
	public void getFruitStatusAvailable(){
		FirefruitTree test = new FirefruitTree();
		if(test.getFruit == true){
			assertEquals(test.getStatus(),"raw");
		}
	}
	
	@Test
	public void getFruitStatusUnavailable(){
		FirefruitTree test = new FirefruitTree();
		if(test.getFruit == false){
			test.fruit.equals("don't have");
		}
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
		for(int i=0; i<4; i++){
			test.increaseAge();
		}
		
		test.getrealAge();
		test.getStatus();
		assertEquals(test.getStatus(),"mature");
	}
	
	@Test
	public void getStatusCreatFruit(){
		FirefruitTree test = new FirefruitTree();
		if(test.getStatus().equals("mature") && test.getrealHealth() == test.getHealth() && test.getFruit == false){
			assertEquals(test.getFruit, true);
		}
	}
	
	@Test
	public void getStatusDead(){
		FirefruitTree test = new FirefruitTree();
		for(int i=0; i<5; i++){
			test.increaseAge();
		}
		test.getrealAge();
		test.getAge();
		test.getStatus();
		if(test.getrealAge() == test.getAge() || test.getrealWater() == 0 && test.getrealHealth() == 0){
			assertEquals(test.getStatus(),"dead");
		}
				
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
		for(int i = 0; i<5; i++){
			test.reduceWater();
		}
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
