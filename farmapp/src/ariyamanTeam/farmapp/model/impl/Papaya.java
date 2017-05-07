package ariyamanTeam.farmapp.model.impl;

import ariyamanTeam.farmapp.model.Fruit;

public class Papaya implements Fruit {
	String name = "";
	int age = 0;
	int realAge = 0;
    String status = "";
    int stats = 0;
    
    public Papaya() {
    	this.name = "papaya";
    	this.age = 7;
    	this.realAge = 0;
    	this.status = "raw";
    	this.stats = 2;
    }
    
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public String getStatus() {
		if(this.realAge == 4) {
			this.status = "medium";
		}
		if(this.realAge == this.age) {
			this.status = "ripe";
		}
		
		return this.status;
	}
	
	@Override
	public int getStats() {
		return this.stats;
	}

	@Override
	public void increaseAge() {
		this.realAge++;
	}
	
}
