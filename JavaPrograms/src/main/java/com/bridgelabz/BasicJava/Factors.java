package com.bridgelabz.BasicJava;

import java.util.Scanner;

import com.bridgelabz.UtilJava.Utility;

/*Computes the prime factorization
 of N using brute force.*/
public class Factors {
	public static void main(String[] args)
	{
		System.out.println("Enter any number to find it's Prime Factors :");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.print("Prime Factors of "+number+ " are : " );
		
		Utility.primeFactor(number);
	}

}
