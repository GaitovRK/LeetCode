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
		
//		int number1 = (int) (Math.random() * 100);
//		int number2 = (int) (Math.random() * 100);
//		int sum = number1 + number2;
//
//		System.out.println("What is the sum of " + number1 + " and " + number2 + "?");
//		Scanner answerScanner = new Scanner(System.in);
//		int answer = answerScanner.nextInt();
//		
//		if (answer == sum) 
//			System.out.println("You are correct!");
//		else 
//			System.out.println("You are wrong! The correct answer is " + sum);

		
		// Exercise 6: BMI
		
		// inputs
//		System.out.println("Enter your height in cm and weight in kg: ");
//		Scanner bmiScanner = new Scanner(System.in);
//		int height = bmiScanner.nextInt();
//		int weight = bmiScanner.nextInt();
//		
//		// bmi calculation
//		double bmi = weight / Math.pow((height / 100.0), 2);
//		
//		System.out.println("Your BMI is: " + bmi);
//		
//		if (bmi < 18.5) 
//			System.out.println("You are underweight");
//		else if (bmi < 25.0) 
//			System.out.println("You are normal");
//		else if (bmi < 30.0) 
//			System.out.println("You are overweight");
//		else 
//			System.out.println("You are obese");
		
		
		// Exercise 7: Leap Year Calculation
		
		System.out.println("Enter the year: ");
		Scanner yearScanner = new Scanner(System.in);
		int year = yearScanner.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("The year " + year + " is a Leap Year!");
		} else {
			System.out.println("The year " + year + " is NOT a Leap Year!");
		}
		
		
		// Exercise 8:
		// Exercise 9:
		// Exercise 10:
		// Exercise 11:

	}
}
