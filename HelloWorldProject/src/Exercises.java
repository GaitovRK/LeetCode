// Created by Rashid Gaitov
// Date: 16.10.2022
// SWE 501.01 Course

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import javax.xml.transform.Source;

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
		
//		System.out.println("Enter the year: ");
//		Scanner yearScanner = new Scanner(System.in);
//		int year = yearScanner.nextInt();
//		
//		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//			System.out.println("The year " + year + " is a Leap Year!");
//		} else {
//			System.out.println("The year " + year + " is NOT a Leap Year!");
//		}
//		

		
		// Exercise 8: Switch statement
		
//		int month = 2;
//		
//		switch (month) {
//		case 1: {
//			System.out.println("January!");
//			break;
//		}
//		case 2: {
//			System.out.println("February!");
//			break;
//		}
//		case 3: {
//			System.out.println("March!");
//			break;
//		}
//		case 4: {
//			System.out.println("April!");
//			break;
//		}
//		default:
//			System.out.println("I don't know this month :(");
//		}
		
		
		// Exercise 9: Multiplication table
		
//		int number1 = 0;
//		int number2 = 0;
//		
//		for (int x = 1; x < 10; x++) {
//			for (int y = 1; y < 10; y++) {
//				System.out.println("The multiplication of " + x + " and " + y + " is " + x*y);
//			}
//			
//		}
		
		
		// Exercise 10: The greatest common divisor
		
//		Scanner inpuScanner = new Scanner(System.in);
//		int answer = 0;
//		
//		System.out.println("Enter first integer: ");
//		int firstNumber = inpuScanner.nextInt();
//		
//		System.out.println("Enter second integer: ");
//		int secondNumber = inpuScanner.nextInt();
//		
//
//		
//		for (int i = firstNumber; i  > 0; i --) {
//			if (firstNumber % i == 0 && secondNumber % i == 0) {
//				answer = i;
//				break;
//			}
//		}
//		
//		System.out.println("The greatest common divisor of " + firstNumber + " and " + secondNumber + " is " + answer);
		
		
		// Exercise 11: Print all even numbers
		
//		for (int i = 0; i < 100; i++) {
//			if (i % 2 != 0) {
//				continue;
//			}
//			System.out.println(i);
//		}
//		
		
		//Exercise 12: Compute angles of a triangle
		
//		Scanner inpuScanner = new Scanner(System.in);
//		double angleA = 0;
//		double angleB = 0;
//		double angleC = 0;
//		double sideA = 0;
//		double sideB = 0;
//		double sideC = 0;
//		
//		System.out.println("Enter first corner X-coordinate: ");
//		double firstX = inpuScanner.nextDouble();
//		System.out.println("Enter first corner Y-coordinate: ");
//		double firstY = inpuScanner.nextDouble();
//
//		System.out.println("Enter second corner X-coordinate: ");
//		double secondX = inpuScanner.nextDouble();
//		System.out.println("Enter second corner Y-coordinate: ");
//		double secondY = inpuScanner.nextDouble();
//		
//		System.out.println("Enter third corner X-coordinate: ");
//		double thirdX = inpuScanner.nextDouble();
//		System.out.println("Enter third corner Y-coordinate: ");
//		double thirdY = inpuScanner.nextDouble();
//		
		// angle A = acos((a * a - b * b - c * c) / (-2 * b * c))
		// angle B = acos((b * b - a * a - c * c) / (-2 * a * c))
		// angle C = acos((c * c - b * b - a * a) / (-2 * a * b))
		
		
//		sideA = Math.sqrt((secondX - firstX) * (secondX - firstX) + (secondY - firstY) * (secondY - firstY));
//		sideB = Math.sqrt((secondX - thirdX) * (secondX - thirdX) + (secondY - thirdY) * (secondY - thirdY));
//		sideC = Math.sqrt((thirdX - firstX) * (thirdX - firstX) + (thirdY - firstY) * (thirdY - firstY));
//
//		angleA = Math.toDegrees(Math.acos((sideA * sideA - sideB * sideB - sideC * sideC) / (-2 * sideB * sideC)));
//		angleB = Math.toDegrees(Math.acos((sideB * sideB - sideA * sideA - sideC * sideC) / (-2 * sideA * sideC)));
//		angleC = Math.toDegrees(Math.acos((sideC * sideC - sideB * sideB - sideA * sideA) / (-2 * sideA * sideB)));
//
//		
//		System.out.println("The angles A, B and C are: " + 
//		Math.round(angleA * 100) / 100.0 + "\t" + 
//		Math.round(angleB * 100) / 100.0 + "\t" + 
//		Math.round(angleC * 100) / 100.0);

		
		// Exercise 13: Working with Strings
		
//		System.out.print("Enter the string: ");
//		Scanner input = new Scanner(System.in);
//		String s1 = input.nextLine();
//		String s2 = " - is your string";
//		
//		System.out.println(s1 + s2 + "\n" + 
//		"The first letter is " + s1.charAt(0) + "\n" +
//		"The length of the string is " + s1.length() + "\n" +
//		"The concat is " + s1.concat(s2) + "\n" + 
//		"The Upper message is " + s1.toUpperCase() + "\n" + 
//		"The lower message is " + s1.toLowerCase());	
//		
		
		// Exercise 14: Working with char
		
//		System.out.print("Enter the string: ");
//		Scanner input = new Scanner(System.in);
//		String s1 = input.next();
//		char firstChar = s1.charAt(0);
//		char lastChar = s1.charAt(s1.length() - 1);
//		
//		System.out.println("The first char is " + firstChar + 
//				"\nThe last char is " + lastChar);


		// Exercise 15: Advanced String commands
		
//		String s1 = "13a990013A";
//		String s2 = "13a";
//		
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s1.startsWith(s2));
//		System.out.println(s1.endsWith(s2));
//		
//		// Print substring starting from 3rd char
//		System.out.println(s1.substring(3));
//		
//		// Find index of letter a in s1 String
//		System.out.println(s1.indexOf('a'));
//		
//		// Find index of number in the second half of s1 String
//		System.out.println(s1.indexOf('1', s1.length()/2));
//		
//		// Find index of number in the end of s1 String
//		System.out.println(s1.lastIndexOf('1'));
//		
//		// Combination
//		System.out.println(s1.substring(s1.indexOf("0013")));


		// Exercise 16: Convert String to int/long
		
//		String s1 = "05431335801";
//		long phoneNumber = Long.parseLong(s1);
//		System.out.println(phoneNumber);
		
		
		// Exercise 17: Format output
		
//		int count = 13;
//		double precision = 0.013;
//		System.out.printf("count is %d and precision is %f", count, precision);
		
		
		// Exercise 18: Two Sum (LeetCode)
		
		
//		public int[] twoSum(int[] nums, int target) {
//	        Map<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
//			
//			for (int i = 0; i < nums.length; i++) {
//				int delta = target - nums[i];
//				
//				if (numbersMap.containsKey(delta)) {
//					return new int[] {numbersMap.get(delta), i};
//				}
//				
//				numbersMap.put(nums[i], i);
//			}
//	        
//	        return new int[] {-1, -1};
//	    
//	    }
		
		
		
		// Exercise 18: HashMap
		
//		Map<String, Long> employeeNumbersMap = new HashMap<>();
//		
//		employeeNumbersMap.put("Rashid", 5431335801L);
//		employeeNumbersMap.put("Ansar", 990L);
//		employeeNumbersMap.put("Unknown", 5143L);
//		
//		
//		System.out.println(employeeNumbersMap);
//		
//		System.out.println(employeeNumbersMap.get("Ansar"));

		
		
		// Exercise 19: LeetCode 1480
		
//		int nums[] = {1,2,3,4};
//		int[] result = new int[nums.length];
//		int sum = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//			sum += nums[i];
//			result[i] = sum;
//		}
//        
//        System.out.println(Arrays.toString(result));
//        System.out.println(nums);

		
//		int nums[] = {1,2,3,4};
//		int sum = 0;
//        int i = 1;
//
//        while (i < nums.length) {
//            nums[i] += nums[i-1];
//            i++;
//        }
//        
//        return nums;
		
		
		// Exercise 19: LeetCode 724
		
//		int nums[] = {1,7,3,6,5,6};
//		int index = 0;
//		int leftSum = 0;
//		int rightSum = 0;
//		
//		for (int i = 0; i < nums.length; i++) {
//			leftSum += nums[i];
//		}
//		
//		if (leftSum == 0) {
//			return nums.length;
//		} else {
//			leftSum = 0;
//		}
//		
//		for (int i = 0; i < nums.length; i++) {
//			leftSum += nums[i];
//
//			for (int j = i+1; j < nums.length; j++) {
//				rightSum += nums[j];
//			}
//			
//			if (leftSum == rightSum) {
//				return i;
//			} else {
//				leftSum = 0;
//				rightSum = 0;
//			}
//		}


		
		//Exercise 20: LeetCode 205
		
//		class Solution {
//		    public boolean isIsomorphic(String s, String t) {
		
//			String s = "badc";
//			String t = "baba";
//		
//			Map<Character, Character> mapS = new HashMap<>();
//		
//			char a;
//			char b;
//			
//			for (int i = 0, j = 0; i < s.length(); i++, j++) {
//				
//				a = s.charAt(i);
//				b = t.charAt(j);
//				
//				if (mapS.containsKey(a)) {
//					if (mapS.get(a).equals(b)) {
//						continue;
//					} else {
//						System.out.println(false);
//					}
//				}
//				
//				if (!mapS.containsValue(a)) {
//					mapS.put(a, b);
//				} else {
//					System.out.println(false);
//				}
//				
//			}
//			
//			System.out.println(true);
//			System.out.println(mapS);		    
//		}
		
		
		//Exercise 21: LeetCode 392
//		String s = "b";
//		String t = "abc";
//		int j = 0;
//		
//		for (int i = 0; i < t.length() && j < s.length(); i++) {
//			if (t.charAt(i) == s.charAt(j)) {
//				j++;
//			}
//		}				
//		System.out.println(s.length() == j);
		
		
		//Exercise 21: LeetCode 121

//		int[] prices = {7,1,12,5,29,0,1};
//		
//		int cheapest = prices[0];
//		int topProfit = 0;
//		int todayProfit = 0;
//		
//		for (int i = 0; i < prices.length; i++) {
//			
//			if (cheapest > prices[i]) {
//				cheapest = prices[i];
//			}
//			
//			todayProfit = prices[i] - cheapest;
//			
//			if (todayProfit > topProfit) {
//				topProfit = todayProfit;
//			}
//			
//		}
//		
//
//		System.out.println(topProfit);

		
		//Exercise 21: LeetCode 121

//		int[] myList = new int[10];
//		boolean[] arr1 = new boolean[10];
//		
//		System.out.println(myList[5]);
//		System.out.println(arr1[5]);
//
//		
//		Scanner inputScanner = new Scanner(System.in);
//		
//		for (int i = 0; i < arr1.length; i++) {
//			myList[i] = inputScanner.nextInt();
//		}
//		
//		System.out.println(Arrays.toString(myList));
		
		
		// Java Course problem 7.24 (Hard)
		
//		boolean[] lockers = new boolean[100];
//		
//		for (int j = 1; j < lockers.length; j++) {
//			
//			for (int i = j; i < lockers.length; i += j) {
//				if (lockers[i] == false) {
//					lockers[i] = true;
//				} else {
//					lockers[i] = false;
//				}
//			}
//			
//		}
//		
//		System.out.println(Arrays.toString(lockers));
		
		
		// Java Course problem 7.31 (Hard)		
		// Merge two sorted lists
		
//		Scanner inputScanner = new Scanner(System.in);
//		
//		System.out.println("Enter array1");
//		
//		int arrayLength1 = inputScanner.nextInt();
//		int[] array1 = new int[arrayLength1];
//		
//		for (int i = 0; i < array1.length; i++) {
//			array1[i] = inputScanner.nextInt();
//		}
//		
//		System.out.println("Enter array2");
//
//		int arrayLength2 = inputScanner.nextInt();
//		int[] array2 = new int[arrayLength2];
//		
//		for (int i = 0; i < array2.length; i++) {
//			array2[i] = inputScanner.nextInt();
//		}
//		
//		merge(array1, array2);
		
		
		
		// Sorting Array: Selection sort
		
//		final int[] array = {2, 9, 5, 4, 8, 1, 6};
//		
//		for (int i = 0, min, index; i < array.length - 1; i++) {
//			min = array[i];
//			index = i;
//
//			// Find the minimum in the list
//			for (int j = i; j < array.length; j++) {
//				if (min > array[j]) {
//					min = array[j];
//					index = j;
//				}
//			}
//			
//			// Swap current with the minimum
//			array[index] = array[i];
//			array[i] = min;
//		}
//		
//		System.out.println("The sorted array is: " + Arrays.toString(array));

		
		// Binary search
		
//		final int[] array = {1, 2, 3, 5, 7, 12, 16, 19, 120};
//		
//		int searchedNumber = 1;
//		int low = 0;
//		int high = array.length;
//		int middleIndex = high / 2;
//		
//		while (high > low) {
//			middleIndex = (low + high) / 2;
//			if (array[middleIndex] > searchedNumber) 
//				high = middleIndex - 1;
//			else 
//				low = middleIndex + 1;
//		}
//		
//		System.out.println("The number's index is " + middleIndex);

		
		// Reverse Array Method
		
		int[] array = {1, 2, 3, 4, 5, 6};
		reverseArray(array);
		
		
	}
	
	// Java Course problem 7.31 (Hard)		
	// Merge two sorted lists
	
//	public static int[] merge(int[] list1, int[] list2) {
//		
//		int[] array = new int[list1.length + list2.length];
//				
//		for (int i = 0; i < list1.length; i++) {
//			array[i] = list1[i];
//		}
//		
//		for (int i = 0; i < list2.length; i++) {
//			array[i + list1.length] = list2[i];
//		}
//		
//		Arrays.sort(array);
//		System.out.println(Arrays.toString(array));
//		return array;
//	}
	
	
	// Reverse Array Method
	
	public static int[] reverseArray(int[] array) {
		
		int[] newArray = new int[array.length];
		
		for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
			newArray[i] = array[j];
		}
		System.out.println(Arrays.toString(newArray));
		return newArray;
	}
	
}
