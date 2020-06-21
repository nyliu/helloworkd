package com.selfstudy.animal;

public class Animal {
	protected double heightInFeet;
	protected double weightInKilos;
	protected String animalType;
	protected String bloodType;
	
	public Animal() {
		this.heightInFeet = 0;
		this.weightInKilos = 0;
		this.animalType = "unknown";
		this.bloodType = "unknown";
	}

	public String showInfo() {
		return "Animal [height=" + heightInFeet + ", weight=" + weightInKilos + ", animalType=" + animalType + ", bloodType="
				+ bloodType + "]";
	}
	
	
	
	

}
