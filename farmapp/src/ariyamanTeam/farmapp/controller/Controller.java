package ariyamanTeam.farmapp.controller;

import java.util.ArrayList;

import ariyamanTeam.farmapp.model.Fruit;
import ariyamanTeam.farmapp.model.Plant;
import ariyamanTeam.farmapp.model.User;
import ariyamanTeam.farmapp.model.impl.Firefruit;
import ariyamanTeam.farmapp.model.impl.FirefruitTree;
import ariyamanTeam.farmapp.model.impl.Moonpeach;
import ariyamanTeam.farmapp.model.impl.MoonpeachTree;
import ariyamanTeam.farmapp.model.impl.Papaya;
import ariyamanTeam.farmapp.model.impl.PapayaTree;

/**
 * Created by iammiind on 3/30/2017 AD.
 */
public class Controller {
	ArrayList<Plant> plants = new ArrayList<Plant>();
	ArrayList<Fruit> fruits = new ArrayList<Fruit>();
	
	int i,a,b,c,d,w,h,v,e;

    public void viewAllPlants() {
    	if(plants.size() != 0) {
    	for(i=0; i<plants.size(); i++) {
    		System.out.println(i+1+" : "+ plants.get(i).getName());
    		System.out.println("Age: [ " + plants.get(i).getStatus() + " ] " + "( " +plants.get(i).getrealAge()+" / "+ plants.get(i).getAge() +" )");
    		System.out.print("Health :");
    		for(a=0; a<plants.get(i).getrealHealth(); a++) {
    			System.out.print(" <3 ");
    		}
    		System.out.println(" ("+ plants.get(i).getrealHealth()+ " / " + plants.get(i).getHealth() + " )");
    		System.out.print("Water :");
    		for(b=0; b<plants.get(i).getrealWater(); b++) {
    			System.out.print(" <3 ");
    		}
    		System.out.println(" ("+ plants.get(i).getrealWater()+ " / " + plants.get(i).getWater() + " )");
    		System.out.println("Fruit : " +plants.get(i).getStatusFruit());
    		System.out.println("----------------------------------------------------------------------------");
    	}
    	}
    	else {
    		System.out.println();
    		System.out.println("Your Farm doesn't have any plants yet !!!");
    		System.out.println();
    	}
    }
    
    public void plantSeed(int num) {
    	if(num == 1) {
    		PapayaTree papaya = new PapayaTree();
    		plants.add(papaya);
    	}
    	if(num == 2) {
    		MoonpeachTree moonpeach = new MoonpeachTree();
    		plants.add(moonpeach);
    	}
    	if(num == 3) {
    		FirefruitTree firefruit = new FirefruitTree();
    		plants.add(firefruit);
    	}
    }
    
    public void watering() {
    	for(w=0; w<plants.size(); w++) {
    		plants.get(w).increaseWater();
    		plants.get(w).increaseHealth();
    	}
    }
    
    int papayaAmount = 0;
    int moonPeachAmount = 0;
    int fireFruitAmount = 0;
    public void addProductToInventory() {
    	// fruit part
    	if(fruits.size() != 0) {
	    	for(v=0; v<fruits.size(); v++) {
	    		if(fruits.get(v).getName().equals("papaya")) {
	    			this.papayaAmount = this.papayaAmount + 1;
	    		}
	    		if(fruits.get(v).getName().equals("moon peach")) {
	    			this.moonPeachAmount = this.moonPeachAmount + 1;
	    		}
	    		if(fruits.get(v).getName().equals("fire fruit")) {
	    			this.fireFruitAmount = this.fireFruitAmount + 1;
	    		}
	    		
	    		fruits.remove(v);
	    	}
    	}
    	
    }
    
    public void harvesting(int num) {
	    	if(plants.get(num).getName().equals("Papaya Tree") && plants.get(num).getStatusFruit().equals("ripe")) {
	    		fruits.add(plants.get(num).getFruit());
	    		plants.remove(num);
	    		
	    		System.out.println();
	    		System.out.println("Harvest Success !!");
	    		System.out.println();
	    	}
	    	else if(plants.get(num).getName().equals("Moonpeach Tree") && plants.get(num).getStatusFruit().equals("ripe")) {
	    		fruits.add(plants.get(num).getFruit());
	    		plants.remove(num);
	    		
	    		System.out.println();
	    		System.out.println("Harvest Success !!");
	    		System.out.println();
	    	}
	    	else if(plants.get(num).getName().equals("Firefruit Tree") && plants.get(num).getStatusFruit().equals("ripe")) {
	    		fruits.add(plants.get(num).getFruit());
	    		plants.remove(num);
	    		
	    		System.out.println();
	    		System.out.println("Harvest Success !!");
	    		System.out.println();
	    	}
    		else {
    			System.out.println();
    			System.out.println("The fruit isn't ripe, you can't harvert it yet !!!");
    			System.out.println();
    		}
    }
    
    public void viewInventory() {
    	System.out.println();
    	System.out.println("---------- THE INVENTORY OF MY FARM ----------");
		System.out.println("   PRODUCT     AMOUNT");
		System.out.println("(1) Papaya => "+ this.papayaAmount);
		System.out.println("(2) Moon Peach => "+ this.moonPeachAmount);
		System.out.println("(3) Fire Fruit => "+ this.fireFruitAmount);
		System.out.println();
    }
    
    Papaya papaya = new Papaya();
    Moonpeach moonPeach = new Moonpeach();
    Firefruit fireFruit = new Firefruit();
    public void viewFruit(String select) {
    	if(select.equals("papaya")) {
    		System.out.println();
    		System.out.println("Name: Papaya");
    		System.out.println("State: "+ papaya.getStats());
    		System.out.println();
    	}
    	if(select.equals("moonPeach")) {
    		System.out.println();
    		System.out.println("Name: Moon Peach");
    		System.out.println("State: "+ moonPeach.getStats());
    		System.out.println();
    	}
    	if(select.equals("fireFruit")) {
    		System.out.println();
    		System.out.println("Name: Fire Fruit");
    		System.out.println("State: "+ fireFruit.getStats());
    		System.out.println();
    	}
    }
    
    public void eatFruit(User user, String fruit) {
    	if(fruit.equals("papaya") && this.papayaAmount > 0) {
    		this.papayaAmount--;
    		user.increaseStats(papaya.getStats());
    	}
    	if(fruit.equals("moonPeach") && this.moonPeachAmount > 0) {
    		this.moonPeachAmount--;
    		user.increaseStats(moonPeach.getStats());
    	}
    	if(fruit.equals("fireFruit") && this.fireFruitAmount > 0) {
    		this.fireFruitAmount--;
    		user.increaseStats(fireFruit.getStats());
    	}
    	else {
    		System.out.println();
    		System.out.println("The fruit that you select is not enough !!!");
    		System.out.println();
    	}
    	
    	System.out.println();
    	System.out.println("---------- Your Stats After Eat ----------");
    	System.out.println("Name: "+ user.getName());
    	System.out.println("Stats: "+ user.getRealStats() +" / " + user.getStats());
    	System.out.println();
    }
    
    public void destroysFruit(String fruitName) {
    	if(fruitName.equals("papaya")) {
    		this.papayaAmount = 0;
    	}
    	if(fruitName.equals("moonPeach")) {
    		this.moonPeachAmount = 0;
    	}
    	if(fruitName.equals("fireFruit")) {
    		this.fireFruitAmount = 0;
    	}
    }
    
    public void sleep1day() {
    	for(c=0; c<plants.size(); c++) {
    		plants.get(c).increaseAge();
    		plants.get(c).reduceWater();
    		plants.get(c).reduceHealth();
    	}
    	System.out.println("Goodnight .");
    	System.out.println("Goodmorning your plants have aged 1 day !.");
    	for(d=0; d<plants.size(); d++) {
    		if(plants.get(d).getStatus() == "dead") {
    			System.out.println("Oh no! your" +plants.get(d).getName()+ " has died from old age. ");
    			System.out.println("Oh no! your " +plants.get(d).getName()+ " fruit has rot.");
    		}
    		if(plants.get(d).getStatusFruit() == "ripe") {
    			System.out.println("Oh no! your" +plants.get(d).getName()+ " has produced a ripe fruit ");
    		}
    	}
    }
    
    public void viewOwnStats(User user) {
    	System.out.println();
    	System.out.print("---------- Your Stats ----------");
    	System.out.println("Name: "+ user.getName());
    	System.out.println("Stats: "+ user.getRealStats() +" / " + user.getStats());
    	System.out.println();
    }
}
