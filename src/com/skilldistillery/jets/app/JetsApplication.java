package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Jet;

public class JetsApplication {

	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		app.launch();
	}
	


	private void launch() {
		displayUserMenu();
		menuChoice();

	}
	
	private void displayUserMenu() {

		System.out.println("Please select 1 - 9 for a menu choice");
		System.out.println("----------------------------------");
		System.out.println("* 1. List Fleet.");
		System.out.println("* 2. Fly all Jets.");
		System.out.println("* 3. View fastest jet.");
		System.out.println("* 4. View jet with longest range.");
		System.out.println("* 5. Load all Cargo Jets.");
		System.out.println("* 6. Dogfight!");
		System.out.println("* 7. Add a jet to Fleet.");
		System.out.println("* 8. Remove a jet from Fleet.");
		System.out.println("* 9. Quit. ");
		System.out.println("----------------------------------");
	}

	public void menuChoice() {
		int menuChoice = 0;
		switch (input.nextInt()) {
		case 1:
//			listfleet();
			break;
		case 2:
//			fly();
			break;
		case 3:
//			fastestJet();
			break;
		case 4:
//			longestRange();
			break;
		case 5:
//			loadCargo();
			break;
		case 6:
//			dogFight();
			break;
		case 7:
//			addJet();
			break;
		case 8:
//			removeJet();
			break;
		case 9:
			System.out.println("GoodBye!");
			break;
		default:
			System.out.println("Invalid menu choice!");
		}
	}

	public void removeJet() {
		//TODO create
	}

	public void addJet() {
		//TODO create
	}

	public void dogFight() {
		//TODO call fight implementors
	}

	public void loadCargo() {
		//TODO call cargo implementors
	}

	public void longestRange() {
		//TODO print longest range
	}

	public void fastestJet() {
		//TODO print fastest jet
	}

	public void flyAllJets() {
		//TODO call fly() with data and flight time.
	}

	public void listfleet() {
		//TODO print out toString with all jet data
		
		
	}

}
