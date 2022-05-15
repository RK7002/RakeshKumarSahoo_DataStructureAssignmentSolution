package com.my.dsasolution.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.my.dsasolution.driver.ConstructBuildingDriver;

public class ConstructBuildingService_Q1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> floorSizeList = new ArrayList<Integer>();
		
		ConstructBuildingDriver obj = new ConstructBuildingDriver();
		
		// Taking Inputs
		System.out.println("Enter the total no of floors in the building");
		int noOfFloors = scanner.nextInt();
		
		for (int i = 0; i < noOfFloors; i++) {
			System.out.println("Enter the Floor Size on Day " + (i + 1));
			floorSizeList.add(scanner.nextInt());
		}
		
		//Calling the driver method to print the requirement the assemble floor detail
		System.out.println("\nThe order of construction is as follows");
		obj.printOrderOfConstruction(floorSizeList, floorSizeList.size()-1);
		
		scanner.close();
	}
}
