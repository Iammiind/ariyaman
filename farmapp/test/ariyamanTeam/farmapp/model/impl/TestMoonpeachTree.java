package ariyamanTeam.farmapp.model.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import ariyamanTeam.farmapp.model.impl.MoonpeachTree;

public class TestMoonpeachTree {
	
	@Test
	public void getName() {
		MoonpeachTree test = new MoonpeachTree();
		test.getName();
		assertEquals(test.getName(), "Moonpeach Tree");
	}
	@Test
	public void getAge(){
		MoonpeachTree test = new MoonpeachTree();
		test.getAge();
		assertEquals(test.getAge(),10);
	}
	@Test
	public void getrealAge(){
		MoonpeachTree test = new MoonpeachTree();
		test.getrealAge();
		assertEquals(test.getrealAge(),0);
	}
	@Test
	public void getHealth(){
		MoonpeachTree test = new MoonpeachTree();
		test.getHealth();
		assertEquals(test.getHealth(),5);
	
	}
	@Test
	public void getrealHealth(){
		MoonpeachTree test = new MoonpeachTree();
		test.getrealHealth();
		assertEquals(test.getrealHealth(),5);
	}
	@Test
	public void getWater(){
		MoonpeachTree test = new MoonpeachTree();
		test.getWater();
		assertEquals(test.getWater(),5);
	}
	@Test
	public void getrealWater(){
		MoonpeachTree test = new MoonpeachTree();
		test.getrealWater();
		assertEquals(test.getrealWater(),5);
	}
	@Test
	public void getFruitStatusSeeding(){
		MoonpeachTree test = new MoonpeachTree();
		test.increaseAge();
		test.getStatus();
		test.getFruit();
		assertEquals(test.getFruit(), "raw");
		}
	@Test
	public void getFruitStatusMature(){
		MoonpeachTree test = new MoonpeachTree();
		test.increaseAge();
		test.increaseAge();
		test.increaseAge();
		test.getStatus();
		test.getFruit();
		assertEquals(test.getFruit(), "ripe");
		
	}
	@Test
	public void getStatusSeed(){
		MoonpeachTree test = new MoonpeachTree();
		test.getrealAge();
		test.getStatus();
		assertEquals(test.getStatus(),"seed");
	}
	@Test
	public void getStatusSeeding(){
		MoonpeachTree test = new MoonpeachTree();
		test.increaseAge();
		test.getrealAge();
		test.getStatus();
		assertEquals(test.getStatus(), "seedling");
	}
	@Test
	public void getStatusMature(){
		MoonpeachTree test = new MoonpeachTree();
		test.increaseAge();
		test.increaseAge();
		test.increaseAge();
		test.getrealAge();
		test.getStatus();
		assertEquals(test.getStatus(),"mature");
	}
	@Test
	public void getStatusDead(){
		MoonpeachTree test = new MoonpeachTree();
		test.increaseAge();
		test.increaseAge();
		test.increaseAge();
		test.increaseAge();
		test.increaseAge();
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
		MoonpeachTree test = new MoonpeachTree();
		test.increaseAge();
		assertEquals(test.getAge(),1);
		
	}
	@Test
	public void reduceHealth(){
		MoonpeachTree test = new MoonpeachTree();
		test.reduceWater();
		test.reduceWater();
		test.reduceWater();
		test.reduceWater();
		test.reduceWater();
		test.reduceHealth();
		assertEquals(test.realHealth,4);
	}
	@Test
	public void reduceWater(){
		MoonpeachTree test = new MoonpeachTree();
		test.getFruit();
		test.getrealWater();
		assertEquals(test.getrealWater(),5);
		
	}
	@Test
	public void increaseWater(){
		MoonpeachTree test = new MoonpeachTree();
		test.getFruit();
		test.getrealWater();
		assertEquals(test.getrealWater(),5);
		
	}
	
	
	

}
