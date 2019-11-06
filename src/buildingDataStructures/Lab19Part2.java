/*
 * @Adam DePollo, 11/5/19
 */
package buildingDataStructures;

import java.util.HashMap;

public class Lab19Part2 {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 2, 3, 4, 4, 0, 5, 2, 2 };
		countFrequencyArr(arr);
		countFrequencyHash(arr);
	}

	// Estimate O(n) - there are no nested loops, the code will just compile once
	// for every item in the array entered
	public static void countFrequencyArr(int[] arr) {
		int[] frequencyArray = new int[11];
		for (int num : arr) {
			frequencyArray[num] = frequencyArray[num] + 1;
		}
		for (int i = 0; i < frequencyArray.length; i++) {
			System.out.println("[" + i + "]: " + frequencyArray[i]);
		}
	}

	// Estimate: O(n) -- there are no nested for loops, the code will just compile
	// once for every item in the array entered

	public static void countFrequencyHash(int[] arr) {
		HashMap<String, Integer> frequency = new HashMap<>();
		int mover = 0;
		for (int num : arr) {
			if (!frequency.containsKey(Integer.toString(num))) {
				frequency.put(Integer.toString(num), 0);
			}
			frequency.put(Integer.toString(num), frequency.get(Integer.toString(num)) + 1);
		}
		for (int i = 0; i < frequency.size(); i++) {
			System.out.println("[" + i + "]: " + frequency.get(Integer.toString(i)));
		}
	}

}
