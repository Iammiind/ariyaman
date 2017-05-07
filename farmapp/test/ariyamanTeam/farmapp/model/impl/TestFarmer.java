package ariyamanTeam.farmapp.model.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestFarmer {
	@Test
	public void getName() {
		Farmer test = new Farmer();
		test.getName();
		assertEquals(test.getName(), "Peter");
	}
	@Test
	public void getStats(){
		Farmer test = new Farmer();
		test.getStats();
		assertEquals(test.getStats(), 100);
		
	}
	@Test
	public void getRealStats(){
		Farmer test = new Farmer();
		test.getRealStats();
		assertEquals(test.getRealStats(), 50);
	}
	@Test
	public void increaseState1(){
		Farmer test = new Farmer();
		test.realStats = 100;
		test.increaseStats(2);
		
		assertEquals(test.realStats, test.getRealStats());
	}
	
	@Test
	public void increaseState2() {
		Farmer test = new Farmer();
		test.increaseStats(2);
		
		assertEquals(test.realStats, 52);
	}
}
	
	
	