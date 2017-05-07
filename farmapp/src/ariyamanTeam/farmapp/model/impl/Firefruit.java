package ariyamanTeam.farmapp.model.impl;

import ariyamanTeam.farmapp.model.Fruit;

public class Firefruit implements Fruit {
	String name = "";
	int age = 0;
	int realAge = 0;
    String status = "";
    int stats = 0;
    
    public Firefruit() {
    	this.name = "fire fruit";
    	this.age = 10;
    	this.realAge = 0;
    	this.status = "raw";
    	this.stats = 10;
    }
    
    @Override
	public String getName() {
		return this.name;
	}
    
	@Override
	public String getStatus() {
		if(this.realAge == 5) {
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
	public int getAge() {
		return this.age;
	}
	
	@Override
	public int getRealAge() {
		return this.realAge;
	}

	@Override
	public void increaseAge() {
		this.realAge++;
	}


}
