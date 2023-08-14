package com.dsa.group.graded.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Scrapper {

	// this list will hold the size on a given day.
	List list = new ArrayList<Integer>();

	public Scrapper() {
		super();
	}

	// method to add the size to the list
	public void fillList(int loc, int size) {
		this.list.add(loc, size);
	}

	public void result() {
		int flag = 0;
		// array list to hold the size which cannot be displayed on day as its smaller
		// than the base size.
		ArrayList<Integer> arr = new ArrayList(list.size());

		int j = 0;
		// arraylist to hold the size in descending order
		List<Integer> list1 = new ArrayList<Integer>(list);

		Collections.sort(list1, Collections.reverseOrder());

		int x, y, z;
		int i = 0;
		for (i = 0; i < list.size(); i++) {
			System.out.println("Day " + i + ":");
			x = (int) list.get(i);
			y = (int) list1.get(0);
			if (x == y) {
				list1.remove(Integer.valueOf(y));
				System.out.print(x);
				try {
					while (arr.contains(Integer.valueOf(x - 1))) {
						System.out.print(x - 1);
						list1.remove(Integer.valueOf(x - 1));
						x--;
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				j++;
				System.out.println();
			} else if (x < y) {
				z = x;
				arr.add(z);
				System.out.println(" ");
			}

		}

	}

}
