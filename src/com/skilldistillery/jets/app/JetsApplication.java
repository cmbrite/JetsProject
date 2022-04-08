package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Jet;

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
				System.out.println("Invalid menu choice! Select 1 - 9.");
			}
		} while (menuChoice != 9);
	}

	public void removeJet() {
		// TODO create
	}

	public void addJet() {
		// TODO create
	}

	public void dogFight() {
		// TODO call fight implementors
	}

	public void loadCargo() {
		// TODO call cargo implementors
	}

	public void longestRange() {
		// TODO print longest range
	}

	public void fastestJet() {
		// TODO print fastest jet
	}

	public void flyAllJets() {
		// TODO call fly() with data and flight time.
	}

	public void listFleet() {

		for (int i = 0; i < jets.size(); i++) {
			System.out.println(jets.get(i));
		}
	}

}
