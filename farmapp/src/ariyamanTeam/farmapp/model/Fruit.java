package ariyamanTeam.farmapp.model;

/**
 * Created by iammiind on 3/30/2017 AD.
 */
public interface Fruit {
	String name = "";
	int age = 0;
	int realAge = 0;
    String status = "";
    int stats = 0;
    
    public String getName();
    public String getStatus();
    public int getStats();
    public void increaseAge();

}
