package ariyamanTeam.farmapp.model.impl;

import ariyamanTeam.farmapp.model.Fruit;
import ariyamanTeam.farmapp.model.Plant;

public class PapayaTree implements Plant {
	 	String name = "";
	    int age = 0;
	    int realAge = 0;
	    int health = 0;
	    int realHealth = 0;
	    int water = 0;
	    int realWater = 0;
	    String fruit = "";
	    String status = "";
	    boolean getFruit = false;
	    
	    Papaya papaya = new Papaya();
	    
	    public PapayaTree(){
	    	this.name = "Papaya Tree";
	    	this.age = 15;
	    	this.realAge = 0;
	    	this.health = 5;
	    	this.realHealth = 5;
	    	this.water = 5;
	    	this.realWater = 5;
	    	this.fruit = "don't have";
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
				this.fruit = this.papaya.getStatus();
			}
			else {
				this.fruit = "don't have";
			}
			
			return this.fruit;
		}
		
		public Fruit getFruit() {
			return this.papaya;
		}
		
		public String getStatus() {
			if(this.realAge == 0) {
				this.status = "seed";
			}
			if(this.realAge == 1) {
				this.status = "seeding";
			}
			if(this.realAge >= 2 && this.realAge < this.age) {
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
				this.papaya.increaseAge();
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
			if(this.realWater < 2 ) { 
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
