package ariyamanTeam.farmapp.controller;

import java.util.ArrayList;

import ariyamanTeam.farmapp.model.FirefruitTree;
import ariyamanTeam.farmapp.model.MoonpeachTree;
import ariyamanTeam.farmapp.model.PapayaTree;
import ariyamanTeam.farmapp.model.Plant;

/**
 * Created by iammiind on 3/30/2017 AD.
 */
public class Controller {
	ArrayList<Plant> plants = new ArrayList<Plant>();
	int i,a,b,c,d;

    public void viewAllPlants(){
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
    		System.out.println("Fruit : " +plants.get(i).getFruit());
    	}
    }
    public void plantSeed(int num){
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
    public void watering(){
    }
    public void harvesting(){
    }
    public void sleep1day(){
    	for(c=0; c<plants.size(); c++) {
    		plants.get(c).increaseAge();
    		plants.get(c).reduceWater();
    	}
    	System.out.println("Goodnight .");
    	System.out.println("Goodmorning your plants have aged 1 day !.");
    	for(d=0; d<plants.size(); d++) {
    		if(plants.get(d).getStatus() == "dead") {
    			System.out.println("Oh no! your" +plants.get(d).getName()+ " has died from old age. ");
    			System.out.println("Oh no! your " +plants.get(d).getName()+ " fruit has rot.");
    		}
    		if(plants.get(d).getFruit() == "ripe") {
    			System.out.println("Oh no! your" +plants.get(d).getName()+ " has produced a ripe fruit ");
    		}
    	}
    }
}
