package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AirField {

	AirField flightLine = new AirField();

	private List<Jet> jets;

	public List<Jet> getJets() {
		return jets;
	}

	public void setJets(List<Jet> jets) {
		this.jets = jets;
	}

	public AirField() {
//		AirField flightLine = new AirField();

		List<Jet> jets = new ArrayList<>();

		readFromFile();

	}

	private void readFromFile() {
		String line;
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Jets.txt"));
			while ((line = reader.readLine()) != null) {
				String[] jetArr = line.split(",");
				String model;
				double speed;
				int range;
				long price;

				if (jetArr[0].equals("CargoPlane")) {
					model = jetArr[1];
					speed = Double.parseDouble(jetArr[2]);
					range = Integer.parseInt(jetArr[3]);
					price = Long.parseLong(jetArr[4]);
				} else if (jetArr[0].equals("FighterJet")) {
					model = jetArr[1];
					speed = Double.parseDouble(jetArr[2]);
					range = Integer.parseInt(jetArr[3]);
					price = Long.parseLong(jetArr[4]);
				} else if (jetArr[0].equals("PasengerPlane")) {
					model = jetArr[1];
					speed = Double.parseDouble(jetArr[2]);
					range = Integer.parseInt(jetArr[3]);
					price = Long.parseLong(jetArr[4]);
				} else if (jetArr[0].equals("Bomber")) {
					model = jetArr[1];
					speed = Double.parseDouble(jetArr[2]);
					range = Integer.parseInt(jetArr[3]);
					price = Long.parseLong(jetArr[4]);
				} else if (jetArr[0].equals("RefuelingPlane")) {
					model = jetArr[1];
					speed = Double.parseDouble(jetArr[2]);
					range = Integer.parseInt(jetArr[3]);
					price = Long.parseLong(jetArr[4]);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
