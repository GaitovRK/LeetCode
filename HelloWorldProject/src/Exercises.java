// Created by Rashid Gaitov
// Date: 16.10.2022
// SWE 501.01 Course

import java.util.Random;
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
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter an integer number for seconds: ");
//		
//		int timeInSeconds = input.nextInt();
//		int timeInMinutes = timeInSeconds / 60;
//		
//		System.out.println(timeInSeconds + " seconds 5is " + timeInMinutes + " minutes and " + (timeInSeconds % 60) + " seconds :)");
		
		
		// Exercise 4: Converting to Farenheit

//		int farenheit = 100;
//		
//		double celsius = (5.0/9)*(farenheit - 32);
//		System.out.println(celsius);
		
		
		// Exercise 5: Math Exam
		
		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);
		int sum = number1 + number2;

		System.out.println("What is the sum of " + number1 + " and " + number2 + "?");
		Scanner answerScanner = new Scanner(System.in);
		int answer = answerScanner.nextInt();
		
		if (answer == sum) 
			System.out.println("You are correct!");
		else 
			System.out.println("You are wrong! The correct answer is " + sum);

	}
}
