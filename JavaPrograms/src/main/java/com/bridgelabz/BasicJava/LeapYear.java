package com.bridgelabz.BasicJava;

import java.util.Scanner;

import com.bridgelabz.UtilJava.Utility;

/*Print the year is a 
 * Leap Year or not.
 */
public class LeapYear {

	public static void main(String[] args) {
		
		System.out.println("Enter the year: ");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		
		Utility.leap(year);

	}

}
