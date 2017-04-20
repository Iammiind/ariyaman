package ariyamanTeam.farmapp.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGardenBed {
	
	@Test
	public void setAmountOfHole(){
		GardenBed gardenBed = new GardenBed();
		gardenBed.AmountOfHole(4);
		
		assertEquals(gardenBed.AmountOfHole(), 4);
	}
}
