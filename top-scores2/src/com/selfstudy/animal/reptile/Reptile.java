package com.selfstudy.animal.reptile;

import com.selfstudy.animal.Animal;

public class Reptile extends Animal {
	protected String skin, egg;
	protected boolean backbone;
	
	
	public Reptile() {   //overide some values in the parent class
		heightInFeet=5;
		weightInKilos=20;
		animalType="reptile";
		bloodType="cold";
		this.skin="Dry skin";
		this.backbone=true;
		this.egg="soft shelled";
	}


	public String showInfo() {
		return "Reptile [skin=" + skin + ", egg=" + egg + ", backbone=" + backbone + ", heightInFeet=" + heightInFeet
				+ ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}
	
	

	

	

	
	
	
	
	

}
