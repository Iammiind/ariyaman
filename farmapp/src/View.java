import java.util.Scanner;

import ariyamanTeam.farmapp.controller.Controller;
import ariyamanTeam.farmapp.model.impl.Farmer;
import ariyamanTeam.farmapp.util.MathUtil;

public class View {

	public static void main(String[] args) {
		// User
		Farmer farmer = new Farmer();
		
		int exit=0;
		Scanner Sc = new Scanner(System.in);
		Controller controller = new Controller();
		MathUtil test = new MathUtil();
		while(true){
			System.out.println();
			System.out.println("> Welcome to the gardening game! Please choose an action");
			System.out.println("(1) View Plants");
			System.out.println("(2) Plants a Plant");
			System.out.println("(3) Water Plant");
			System.out.println("(4) Harvest Plant" );
			System.out.println("(5) View Inventory" );
			System.out.println("(6) Select fruit in inventory");
			System.out.println("(7) Sleep 1 Day");
			System.out.println("(8) View Own Stats");
//			test.add(1, 2);
			
			System.out.print("Please select the menu that you need => ");
			int selected = Sc.nextInt();
			
			if(selected == 1){
				controller.viewAllPlants();
			}
			
			if(selected == 2){
				System.out.println();
				System.out.println("Select your plant seed");
				System.out.println("(1) Papaya");
				System.out.println("(2) Moonpeach");
				System.out.println("(3) Firefruit");
				System.out.println("(other) Exit");
				int selectPlant = Sc.nextInt();
				controller.plantSeed(selectPlant);
			}
			
			if(selected == 3) {
				controller.watering();
			}
			
			if(selected == 4) {
				controller.viewAllPlants();
				
				System.out.print("Please Select The Plant Which You Need to Harvest => ");
				int selectHarvest = Sc.nextInt();
				controller.harvesting(selectHarvest-1);	
				controller.addProductToInventory();
				
				System.out.println();
			}
			
			if(selected == 5) {
				controller.viewInventory();
			}
			
			if(selected == 6) {
				System.out.println();
				System.out.println("---------- Fruit options ----------");
				System.out.println("(1) View Fruit");
				System.out.println("(2) Eat Fruit");
				System.out.println("(3) Destroy Fruit");
				System.out.println("(other) Exit");
				
				System.out.print("Please select the option that you need => ");
				int selectOption = Sc.nextInt();
				
				if(selectOption == 1) {
					controller.viewInventory();
					System.out.print("Please select the fruit that you need to view the detail => ");
					int selectFruitInvent = Sc.nextInt();
					
					if(selectFruitInvent == 1) {
						controller.viewFruit("papaya");
					}
					if(selectFruitInvent == 2) {
						controller.viewFruit("moonPeach");
					}
					if(selectFruitInvent == 3) {
						controller.viewFruit("fireFruit");
					}
				}
				if(selectOption == 2) {
					controller.viewInventory();
					System.out.print("Please select the fruit that you need to eat => ");
					int selectFruitInvent = Sc.nextInt();
					
					if(selectFruitInvent == 1) {
						controller.eatFruit(farmer, "papaya");
					}
					if(selectFruitInvent == 2) {
						controller.eatFruit(farmer, "moonPeach");
					}
					if(selectFruitInvent == 3) {
						controller.eatFruit(farmer, "fireFruit");
					}
				}
				if(selectOption == 3) {
					controller.viewInventory();
					System.out.print("Please select the fruit that you need to delete from the inventory => ");
					int selectFruitInvent = Sc.nextInt();
					
					if(selectFruitInvent == 1) {
						controller.destroysFruit("papaya");
					}
					if(selectFruitInvent == 2) {
						controller.destroysFruit("moonPeach");
					}
					if(selectFruitInvent == 3) {
						controller.destroysFruit("fireFruit");
					}
				}
				
			}
			
			if(selected == 7){
				controller.sleep1day();
			}
			
			if(selected == 8) {
				controller.viewOwnStats(farmer);
			}
		}
	}

}
