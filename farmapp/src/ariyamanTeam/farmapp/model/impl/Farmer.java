package ariyamanTeam.farmapp.model.impl;

import ariyamanTeam.farmapp.model.User;

public class Farmer implements User {
	String name = "";
	int stats = 0;
	int realStats = 0;
	
	public Farmer() {
		this.name = "Peter";
		this.stats = 100;
		this.realStats = 50;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getStats() {
		return this.stats;
	}
	
	@Override
	public int getRealStats() {
		return this.realStats;
	}

	@Override
	public void increaseStats(int num) {
		if(this.realStats == this.stats) {
			this.realStats = this.stats;
		}
		else {
			this.realStats = this.realStats + num;
		}
	}

}
