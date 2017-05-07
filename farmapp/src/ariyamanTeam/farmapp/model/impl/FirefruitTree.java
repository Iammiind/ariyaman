package ariyamanTeam.farmapp.model.impl;

import java.util.ArrayList;

import ariyamanTeam.farmapp.model.Fruit;
import ariyamanTeam.farmapp.model.Plant;

public class FirefruitTree implements Plant {
	String name = "";
    int age = 0;
    int realAge = 0;
    int health = 0;
    int realHealth = 0;
    int water = 0;
    int realWater = 0;
    String status = "";
    String fruit = "";
    boolean getFruit = false;
  
	Firefruit fireFruit = new Firefruit();
    
    public FirefruitTree(){
    	this.name = "Firefruit Tree";
    	this.age = 10;
    	this.realAge = 0;
    	this.health = 5;
    	this.realHealth = 5;
    	this.water = 5;
    	this.realWater = 5;
    	this.fruit = "";
    }

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}
	
	public int getrealAge() {
		return this.realAge;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public int getrealHealth() {
		return this.realHealth;
	}

	public int getWater() {
		return this.water;
	}
	
	public int getrealWater() {
		return this.realWater;
	}

	public String getStatusFruit() {
		if(this.getFruit == true) {
			this.fruit = this.fireFruit.getStatus();
		}
		else {
			this.fruit = "don't have";
		}
		
		return this.fruit;
	}
	
	public Fruit getFruit() {
		return this.fireFruit;
	}
	
	public String getStatus() {
		if(this.realAge == 0) {
			this.status = "seed";
		}
		if(this.realAge == 1) {
			this.status = "seedling";
		}
		if(this.realAge >= 2 && this.realAge < 7) {
			this.status = "mature";
			
			if(this.status == "mature" && this.realHealth == this.health && this.getFruit == false) {
				this.getFruit = true;
			}
		}
		if(this.realAge == this.age || this.realWater == 0 && this.realHealth == 0) {
			this.status = "dead";
		}

		return this.status;
	}
	
	public void increaseAge() {
		if(this.getFruit == true) {
			this.fireFruit.increaseAge();
			this.realAge++;
		}
		else {
			this.realAge++;
		}
	}
	
	public void increaseHealth() {
		if(this.realHealth >= this.health) {
			this.realHealth = this.health;
		}
		else {
			this.realHealth++;
		}
	}
	
	public void reduceHealth() {
		if(this.realWater < 4 ) {
			this.realHealth--;
		}
		if(this.realHealth < 0) {
			this.realHealth = 0;
		}
	}
	
    public void reduceWater() {
    	if(this.realWater <= 0) {
    		this.realWater = 0;
    	}
    	else {
    		this.realWater--;
    	}
    }
    
    public void increaseWater() {
    	if(this.realWater == this.water) {
    		this.realWater = this.water;
    	}
    	else {
    		this.realWater++;
    	}
    }

}
