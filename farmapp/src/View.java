import ariyamanTeam.farmapp.controller.Controller;

public class View {

	public static void main(String[] args) {
		Controller test = new Controller();
		test.plantSeed(1);
		test.plantSeed(2);
		test.plantSeed(3);
		test.viewAllPlants();
		test.sleep1day();
		test.sleep1day();
		test.sleep1day();
		test.sleep1day();
		test.viewAllPlants();
	}

}
