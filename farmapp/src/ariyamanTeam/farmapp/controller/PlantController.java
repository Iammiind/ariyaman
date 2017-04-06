package ariyamanTeam.GardenGame.controller;

import ariyamanTeam.GardenGame.model.Plant;

/**
 * Created by iammiind on 3/30/2017 AD.
 */
public class PlantController {
    Plant namePlant;

    public void increaseAge(Plant namePlant) {
        this.namePlant = namePlant;
        int age = this.namePlant.getHealth();
        age--;
    }
    public void increaseHealth(Plant namePlant){
    }
    public void reduceHealth(Plant namePlant) {
    }
    public void increaseWater(Plant namePlant){
    }
    public void reduceWater(Plant namePlant) {
    }
    public void getPlant(Plant namePlant){
    }
    public void getAllPlant(){
    }

}
