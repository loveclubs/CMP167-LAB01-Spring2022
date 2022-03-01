/*
 * Write a program that prompts user for their age and determine whether or not the user can drink alcohol or not.
 */

import java.util.Scanner;

public class Program4 {
		public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
			
		int userAge;
		
		System.out.println("Please enter your age.");
		userAge=scnr.nextInt();
		
		if (userAge >= 21) {
			System.out.println("You are of legal drinking age. Choose your choice of alcohol.");
		}
		else {
			System.out.println("Sorry, you are not of legal drinking age.");
		}
			
		}
}
