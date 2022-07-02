package com.bridgelabz.BasicJava;

import java.util.Scanner;

import com.bridgelabz.UtilJava.Utility;

/*Prints the Nth harmonic 
 number: 1/1 + 1/2 + ... + 1/N */
public class HarmonicN {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to get it's harmonic value: ");
		double number=sc.nextDouble();
		
		Utility.harmonicNum(number);
		}
}