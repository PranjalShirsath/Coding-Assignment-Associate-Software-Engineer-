package com.Java;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArray {
	public static void main(String[] args) {

		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(6);
		myList.add(7);

		Collections.shuffle(myList);

		Integer[] shuffledArray = myList.toArray(new Integer[myList.size()]);

		for (Integer num : shuffledArray) {
			System.out.print(num + " ");
		}
	}

}
