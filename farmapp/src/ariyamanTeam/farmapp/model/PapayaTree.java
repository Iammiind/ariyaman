package ariyamanTeam.farmapp.model;

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
	    
	    public PapayaTree(){
	    	this.name = "Papaya Tree";
	    	this.age = 7;
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

		public String getFruit() {
			if(this.status == "seedling") {
				this.fruit = "raw";
			}
			if(this.status == "mature") {
				this.fruit = "ripe";
			}
			return this.fruit;
		}
		public String getStatus() {
			if(this.realAge == 0) {
				this.status = "seed";
			}
			if(this.realAge == 1) {
				this.status = "seedling";
			}
			if(this.realAge >= 2 && this.realAge < this.age) {
				this.status = "mature";
			}
			if(this.realAge == this.age) {
				return this.status = "dead";
			}
			return this.status;
		}
		public int increaseAge() {
			return this.realAge++;
		}
		public int reduceHealth() {
			if(this.realWater == 0 ) {
				this.realHealth--;
			}
			return this.realHealth;
		}
	    public int reduceWater() {
	    	return this.realWater--;
	    }
	    public int increaseWater() {
	    	return this.realWater++;
	    }
	
	}
