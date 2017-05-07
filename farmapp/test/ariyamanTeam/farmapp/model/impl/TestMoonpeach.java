package ariyamanTeam.farmapp.model.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMoonpeach {
	
	@Test
	public void getName() {
		Moonpeach test = new Moonpeach();
		test.getName();
		assertEquals(test.getName(), "moon peach");
	}
	@Test
	public void getStats(){
		Moonpeach test = new Moonpeach();
		test.getStats();
		assertEquals(test.getStats(),5);
	}
	@Test
	public void getAge(){
		Moonpeach test = new Moonpeach();
		test.getAge();
		assertEquals(test.getAge(),12 );
	}
	@Test
	public void getRealAge(){
		Moonpeach test = new Moonpeach();
		test.getRealAge();
		assertEquals(test.getRealAge(),0);
		
	}
	@Test
	public void increaseAge(){
		Moonpeach test = new Moonpeach();
		test.increaseAge();
		assertEquals(test.realAge,1);
		
	}
	@Test
	public void getStatusMedium() {
		Moonpeach test = new Moonpeach();
		for (int i = 0; i < 5; i++) {
		test.increaseAge();		
		if (test.realAge==6) {
			assertEquals(test.getStatus(), "medium");
		}
		}
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


	
	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		
	
	
	
	
	



