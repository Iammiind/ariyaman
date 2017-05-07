package ariyamanTeam.farmapp.model;

public interface User {
	String name = "";
	int stats = 0;
	int realStats = 0;
	
	public String getName();
	public int getStats();
	public int getRealStats();
	public void increaseStats(int number);
}
