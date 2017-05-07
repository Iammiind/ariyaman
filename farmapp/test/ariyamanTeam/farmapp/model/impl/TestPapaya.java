package ariyamanTeam.farmapp.model.impl;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPapaya {

	@Test
	public void getName(){
		Papaya test = new Papaya();
		test.getName();
		assertEquals(test.getName(), "papaya");	
	}
	
	@Test
	public void getStats(){
		Papaya test = new Papaya();
		test.getStats();
		assertEquals(test.getStats(),2);
	}
	
	@Test
	public void getAge(){
		Papaya test = new Papaya();
		test.getAge();
		assertEquals(test.getAge(),7);
	}
	
	@Test
	public void getRealAge(){
		Papaya test = new Papaya();
		test.getRealAge();
		assertEquals(test.getRealAge(),0);
	}
	
	@Test
	public void increaseAge(){
		Papaya test = new Papaya();
		test.getRealAge();
		assertEquals(test.getRealAge(),0);
	}
	
	@Test
	public void getStatusMedium(){
		Papaya test = new Papaya();
		for(int i=0; i<4; i++){
			test.increaseAge();
		}
		test.getRealAge();
		test.getStatus();
		assertEquals(test.getStatus(), "medium");
	}
	
	@Test
	public void getStatusRipe(){
		Papaya test = new Papaya();
		for(int i=0; i<test.age; i++){
			test.increaseAge();
		}
		test.getRealAge();
		test.getStatus();
		assertEquals(test.getStatus(), "ripe");
	}
	
}
