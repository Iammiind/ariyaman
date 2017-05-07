package ariyamanTeam.farmapp.model.impl;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPapayaTree {
	
	@Test
	public void getName() {
		PapayaTree test =new PapayaTree();
		test.getName();
		assertEquals(test.getName(), "Papaya Tree");
	}
	
	@Test
	public void getAge() {
		PapayaTree test =new PapayaTree();
		test.getAge();
		assertEquals(test.getAge(), 15);
	}

	@Test
	public void getrealAge() {
		PapayaTree test =new PapayaTree();
		test.getrealAge();
		assertEquals(test.getrealAge(), 0);
	}
	
	@Test
	public void getWater() {
		PapayaTree test =new PapayaTree();
		test.getWater();
		assertEquals(test.getWater(), 5);
	}
	
	@Test
	public void getrealWater() {
		PapayaTree test =new PapayaTree();
		test.getrealWater();
		assertEquals(test.getrealWater(), 5);
	}
	
	@Test
	public void getFruitStatusAvailable(){
		PapayaTree test = new PapayaTree();
		if(test.getFruit == true){
			assertEquals(test.getStatus(),"raw");
		}
	}
	
	@Test
	public void getFruitStatusUnavailable(){
		PapayaTree test = new PapayaTree();
		if(test.getFruit == false){
			test.fruit.equals("don't have");
		}
	}
	
	@Test
	public void getStatusSeed(){
		PapayaTree test =new PapayaTree();
		test.getStatus();
		assertEquals(test.getStatus(), "seed");
	}
	
	@Test
	public void getStatusSeeding(){
		PapayaTree test =new PapayaTree();
		test.increaseAge();
		test.getStatus();
		assertEquals(test.getStatus(), "seeding");
	}
	
	@Test
	public void getStatusMature(){
		PapayaTree test =new PapayaTree();
		test.increaseAge();
		test.increaseAge();
		test.getStatus();
		assertEquals(test.getStatus(), "mature");
	}
	
	@Test
	public void getStatusDead(){
		PapayaTree test = new PapayaTree();
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
		PapayaTree test =new PapayaTree();
		test.increaseAge();
		assertEquals(test.getrealAge(),1);
	}
	
	@Test
	public void reduceHealth(){
		PapayaTree test =new PapayaTree();
		for(int i=1;i<6;i++){
			test.reduceWater();
		}
		test.reduceHealth();
		assertEquals(test.getrealHealth(),4);
	}
	
	@Test
	public void increaseWater(){
		PapayaTree test = new PapayaTree();
		test.getFruit();
		test.getrealWater();
		assertEquals(test.getrealWater(),5);
	}

	
	@Test
	public void reduceWater(){
		PapayaTree test =new PapayaTree();
		test.reduceWater();
		assertEquals(test.getrealWater(),4);
	}
	
	
}
