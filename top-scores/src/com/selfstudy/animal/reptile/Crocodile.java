package com.selfstudy.animal.reptile;

public class Crocodile extends Reptile {

	public Crocodile() {
		super();
		egg="hard shelled";
	}

	public String showInfo() {
		return "Crocodile [skin=" + skin + ", egg=" + egg + ", backbone=" + backbone + ", heightInFeet=" + heightInFeet
				+ ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}


}
