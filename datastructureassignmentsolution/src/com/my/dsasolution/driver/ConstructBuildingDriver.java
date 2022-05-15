package com.my.dsasolution.driver;

import java.util.Collections;
import java.util.List;

public class ConstructBuildingDriver {
	
	public void printOrderOfConstruction(List<Integer> floorSizeList, int listSize) {
		int maxFloorSize = floorSizeList.stream().max(Integer::compare).get(); // find max value using stream
		
		// If maximum element present at end then sorting the list in reverse order and will print
		if (floorSizeList.get(floorSizeList.size() - 1) == maxFloorSize) {
			int c = 1;
			for (; c < (floorSizeList.size() - 1); c++) {
				System.out.println("Day: " + c + "\n");
			}
			Collections.sort(floorSizeList, Collections.reverseOrder());
			System.out.println("Day: " + c);
			for(int i=0;i<=listSize;i++) {
				System.out.print(floorSizeList.get(i)+" ");
			}
		}// Else will check by index and matches according to conditions in very low time & print 
		else {
			int currentIndex = 0;
			int dayCounter = 1;
			while (currentIndex <= listSize) {
				int maxValue = findMaxValue(floorSizeList, currentIndex, listSize);
				int maxValueIndex = floorSizeList.indexOf(maxValue);

				currentIndex = maxValueIndex;
				
				//On reach end index sort the list in reverse order and print non-zero values
				if (currentIndex == listSize) {
					Collections.sort(floorSizeList, Collections.reverseOrder());
					for (int i = dayCounter; i <= (currentIndex + 1); i++) {
						++dayCounter;
						System.out.print("\nDay: " + (i) + "\n");
					}
					for (int day = 0; day <= currentIndex; day++) {
						if (floorSizeList.get(day) != 0) {
							System.out.print(floorSizeList.get(day) + "  ");
						} else {
							break;
						}
					}
					break;
				} else {//Print in requirement orders
					int nextValue = findMaxValue(floorSizeList, currentIndex + 1, listSize);
					for (int i = dayCounter; i <= (currentIndex + 1); i++) {
						++dayCounter;
						System.out.print("\nDay: " + (i) + "\n");
					}
					for (int day = currentIndex; day >= 0; day--) {
						if (floorSizeList.get(day) >= nextValue && floorSizeList.get(day) != 0) {
							System.out.print(floorSizeList.get(day) + "  ");
							floorSizeList.set(day, 0);
						}
					}
					currentIndex = maxValueIndex + 1;
				}
			}
		}
	}

	public static int findMaxValue(List<Integer> floorSizeList, int startIndex, int endIndex) {
		int maxValue = 0;
		if (startIndex == endIndex) {
			return floorSizeList.get(startIndex);
		} else {
			for (int c = startIndex; c <= endIndex; c++) {
				if (maxValue < floorSizeList.get(c)) {
					maxValue = floorSizeList.get(c);
				}
			}
		}
		return maxValue;
	}
}
