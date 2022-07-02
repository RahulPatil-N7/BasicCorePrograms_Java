package com.bridgelabz.BasicJava;

import java.util.Scanner;

import com.bridgelabz.UtilJava.UtilityJava;

/*Program to Check Whether 
 * a Number is Even or Odd
 */
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		
		UtilityJava.checkEvenOdd(num);
     }
	}
