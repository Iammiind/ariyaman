package ariyamanTeam.farmapp.model;

/**
 * Created by iammiind on 3/30/2017 AD.
 */
public interface Plant {
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

    // method get
    public String getName();
    public int getAge();
    public int getrealAge();
    public int getHealth();
    public int getrealHealth();
    public int getWater();
    public int getrealWater();
    public String getStatusFruit();
    public String getStatus();
    public Fruit getFruit();
    
    public void increaseAge();
    public void increaseHealth();
    public void reduceHealth();
    public void reduceWater();
    public void increaseWater();
    
}

