package com.skilldistillery.jets.app;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Bomber;
import com.skilldistillery.jets.entities.CargoPlane;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.PassengerPlane;
import com.skilldistillery.jets.entities.RefuelingPlane;

public class JetsApplication {

	Scanner input = new Scanner(System.in);
	public AirField flightLine = new AirField();
	public List<Jet> jets = flightLine.readFromFile("Jets.txt");
//	List<Jet> jets = flightLine.readFromFile("Jets.txt");

	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		app.launch();
//		System.out.println(jets);

	}

	private void launch() {
		displayUserMenu();

	}

	private void displayUserMenu() {

		int menuChoice = 0;
		do {
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

			switch (input.nextInt()) {
			case 1:
				listFleet();
				break;
			case 2:
//				flyAllJets();
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
				addJet();
				break;
			case 8:
				removeJet();
				break;
			case 9:
				System.out.println("GoodBye!");
				break;
			default:
				System.out.println("Invalid menu choice! Select 1 - 9.");
			}
		} while (menuChoice != 9);
	}

	public void removeJet() {
		System.out.println("Please select the number of the jet you would like to remove.");
		int i;
		for (i = 0; i < jets.size(); i++) {
			System.out.println((i + 1) + ": " + jets.get(i));
		}int jetToRemove = input.nextInt() - 1;
		jets.remove(jetToRemove);
		
	}

	public void addJet() {
		System.out.println("Please enter a number to select the Jet Type:");
		System.out.println("1 for a Cargo Plane.");
		System.out.println("2 for a Fighter Jet.");
		System.out.println("3 for a Passenger Plane.");
		System.out.println("4 for a Bomber.");
		System.out.println("5 for an Aerial Refueler.");
		int jetSelection = input.nextInt();
		input.nextLine();
		System.out.println("Please enter the model:");
		String model = input.nextLine();
		System.out.println("Please enter the max speed:");
		double speed = input.nextDouble();
		System.out.println("Please enter the max range:");
		int range = input.nextInt();
		System.out.println("Please enter the price:");
		long price = input.nextInt();

		if (jetSelection == 1) {
			Jet j = new CargoPlane("CargoPlane", model, speed, range, price);
			jets.add(j);
		} else if (jetSelection == 2) {
			Jet j = new FighterJet("FighterJet", model, speed, range, price);
			jets.add(j);
		} else if (jetSelection == 3) {
			Jet j = new PassengerPlane("PassengerPlane", model, speed, range, price);
			jets.add(j);
		} else if (jetSelection == 4) {
			Jet j = new Bomber("Bomber", model, speed, range, price);
			jets.add(j);
		} else if (jetSelection == 5) {
			Jet j = new RefuelingPlane("RefuelingPlane", model, speed, range, price);
			jets.add(j);
		}
	}
//
//	public void dogFight() {
//		// TODO call fight implementors
//	}
//
//	public void loadCargo() {
//		// TODO call cargo implementors
//	}
//
//	public void longestRange() {
//		int i;
//		for (i = 0; i < jets.size(); i++) {
//			jets.get(i);
//		}jets.
//	}
//
//	public void fastestJet() {
//		Jet fastest = null;
//		for (int i = 0; i < jets.size(); i++) {
//		}
//	}
//
//	public void flyAllJets() {
//		for (int i = 0; i < jets.size(); i++) {
//
////			System.out.println("Jet-" + (i + 1) + ": " + jets.get(i));
//		}
//	}

	public void listFleet() {

		for (int i = 0; i < jets.size(); i++) {
			System.out.println("Jet-" + (i + 1) + ": " + jets.get(i));
		}
	}

}
