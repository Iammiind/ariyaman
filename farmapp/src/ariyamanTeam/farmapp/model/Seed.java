package ariyamanTeam.GardenGame.model;

/**
 * Created by iammiind on 3/30/2017 AD.
 */
public interface Seed {
    String name = "";
    int amount = 0;
    double price = 0;
    int growthIndex = 0;

    // method set
    public void setName(String name);
    public void setAmount(int amount);
    public void setPrice(double price);
    public void setGrowthIndex(int growthIndex);

    // method get
    public void getName();
    public void getAmount();
    public void getPrice();
    public void getGrowthIndex();
}
