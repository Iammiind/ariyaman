package ariyamanTeam.farmapp.model;

/**
 * Created by iammiind on 3/30/2017 AD.
 */
public interface Plant {
    String name = "";
    int age = 0;
    int health = 0;
    int water = 0;
    Fruit fruit = null;

    // method set
    public void setName(String name);
    public void setAge(int age);
    public void setHealth(int health);
    public void setWater(int water);
    public void setFruit(Seed fruit);

    // method get
    public String getName();
    public int getAge();
    public int getHealth();
    public int getWater();
    public Fruit getFruit();
}

