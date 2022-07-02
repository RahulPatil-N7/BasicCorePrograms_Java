package com.bridgelabz.BasicJava;

import java.util.Scanner;

import com.bridgelabz.UtilJava.Utility;

/*This program takes a command-line argument N 
 and prints a table of the
powers of 2 that are less than or equal to 2^N. */
public class PowerN {

	public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number:");
	        int number = scanner.nextInt();
	        
	        Utility.power(number);
	}
}


