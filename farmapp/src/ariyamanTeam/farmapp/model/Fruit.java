package ariyamanTeam.farmapp.model;

/**
 * Created by iammiind on 3/30/2017 AD.
 */
public interface Fruit {
    String name = "";
    String status = "";

    // method set
    public void setName(String name);
    public void setStatus(String status);

    // method get
    public void getName();
    public void getStatus();

}
