import java.util.Scanner;

import ariyamanTeam.farmapp.controller.Controller;

public class View {

	public static void main(String[] args) {
		int exit=0;
		Scanner Sc = new Scanner(System.in);
		Controller controller = new Controller();
		while(true){
			System.out.println("> Welcome to the gardening game! Please choose an action");
			System.out.println("(1) View Plants");
			System.out.println("(2) Plant a plant");
			System.out.println("(3) Water Plant");
			System.out.println("(4) Harvest Plant" );
			System.out.println("(5) View Inventory" );
			System.out.println("(6) Visit Shop (Buy seeds and plant food etc.)" );
			System.out.println("(7) Sleep 1 Day");
			int First = Sc.nextInt();
			
			if(First==1){
				controller.viewAllPlants();
			}
			if(First==2){
				System.out.println("Select your plant seed");
				System.out.println("(1) Papaya");
				System.out.println("(2) Moonpeach");
				System.out.println("(3) Firefruit");
				System.out.println("(other) Exit");
				int Second=Sc.nextInt();
				controller.plantSeed(Second);
			}
			if(First==7){
				controller.sleep1day();
			}
		}
	}

}
