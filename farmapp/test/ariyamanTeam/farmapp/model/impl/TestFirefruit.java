package ariyamanTeam.farmapp.model.impl;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFirefruit {
	
	@Test
	public void getName(){
		Firefruit test = new Firefruit();
		test.getName();
		assertEquals(test.getName(),"fire fruit");
	}
	
	@Test
	public void getStats(){
		Firefruit test = new Firefruit();
		test.getStats();
		assertEquals(test.getStats(),10);
	}
	
	@Test
	public void getAge(){
		Firefruit test = new Firefruit();
		test.getAge();
		assertEquals(test.getAge(),10);
	}
	
	@Test
	public void getRealAge(){
		Firefruit test = new Firefruit();
		test.getRealAge();
		assertEquals(test.getRealAge(),0);
	}
	
	@Test
	public void increaseAge(){
		Firefruit test = new Firefruit();
		test.getRealAge();
		assertEquals(test.getRealAge(),0);
	}
	
	@Test
	public void getStatusMedium(){
		Firefruit test = new Firefruit();
		for(int i=0; i<5; i++){
			test.increaseAge();
		}
		test.getRealAge();
		test.getStatus();
		assertEquals(test.getStatus(), "medium");
	}
	
	@Test
	public void getStatusRipe(){
		Firefruit test = new Firefruit();
		for(int i=0; i<test.age; i++){
			test.increaseAge();
		}
		test.getRealAge();
		test.getStatus();
		assertEquals(test.getStatus(), "ripe");
	}
}
