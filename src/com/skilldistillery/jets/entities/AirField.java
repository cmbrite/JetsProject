package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {

//	AirField flightLine = new AirField();

//	public AirField() {
////		AirField flightLine = new AirField();
////		List<Jet> jets = new ArrayList<>();
////		flightLine.readFromFile("Jets.txt");
////		String fileName = "Jets.txt";
////		AirField flightLine = new AirField();
////		List<Jet> jets = flightLine.readFromFile(fileName);
//
//	}

	public List<Jet> readFromFile(String fileName) {
		List<Jet> jets = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] jetsColl = line.split(",");
				String jetType = jetsColl[0];
				String model = jetsColl[1];
				double speed = Double.parseDouble(jetsColl[2]);
				int range = Integer.parseInt(jetsColl[3]);
				long price = Long.parseLong(jetsColl[4]);
//				Jet js = new Jet(model, speed, range, price);

				if (jetsColl[0].equals("CargoPlane")) {
					Jet j = new CargoPlane(jetType, model, speed, range, price);
					jets.add(j);
				} else if (jetsColl[0].equals("FighterJet")) {
					Jet j = new FighterJet(jetType, model, speed, range, price);
					jets.add(j);
				} else if (jetsColl[0].equals("PassengerPlane")) {
					Jet j = new PassengerPlane(jetType, model, speed, range, price);
					jets.add(j);
				} else if (jetsColl[0].equals("Bomber")) {
					Jet j = new Bomber(jetType, model, speed, range, price);
					jets.add(j);
				} else if (jetsColl[0].equals("RefuelingPlane")) {
					Jet j = new RefuelingPlane(jetType, model, speed, range, price);
					jets.add(j);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jets;
	}

}
