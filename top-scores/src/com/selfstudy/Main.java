package com.selfstudy;

import java.io.IOException;

import com.selfstudy.animal.Animal;
import com.selfstudy.animal.reptile.Crocodile;
import com.selfstudy.animal.reptile.Reptile;

public class Main {

	public static void main(String[] args) throws IOException {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
