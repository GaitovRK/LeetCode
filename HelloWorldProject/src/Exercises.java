// Created by Rashid Gaitov
// Date: 16.10.2022
// SWE 501.01 Course

import java.util.Scanner;

public class Exercises {
	public static void main(String[] args) {
	
		// Exercise 1: Compute the area of a circle
		
//		double area;
//		final double PI = 3.1415;
//		int radius = 7;
//		
//		area = pi * radius * radius;
//		System.out.println("The area of a circle with the radius " + radius + " is equal to " + area);
		
		
		// Exercise 2: Area with the use of Scanner
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Enter radius: ");
//		double radius = input.nextDouble();
//		double area = radius * radius * 3.14;
//		
//		System.out.println("The area is " + area);
		
		
		// Exercise 3: Displaying Time
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer number for seconds: ");
		
		int timeInSeconds = input.nextInt();
		int timeInMinutes = timeInSeconds / 60;
		
		System.out.println(timeInSeconds + " seconds is " + timeInMinutes + " minutes and " + (timeInSeconds % 60) + " seconds");
		
	}
}
