package com.dsa.group.graded.assignment;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		int days;
		int size;
		Scrapper scrapper = new Scrapper();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of days");
		days = sc.nextInt();
		for (int i = 0; i < days; i++) {
			System.out.println("Enter the floor size on day : " + (i + 1) );
			size = sc.nextInt();
			if (size <= days)
				scrapper.fillList(i, size);

		}
		scrapper.result();

	}

}
