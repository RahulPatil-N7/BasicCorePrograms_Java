package com.bridgelabz.BasicJava;

import java.util.Scanner;

import com.bridgelabz.UtilJava.UtilityJava;

/*Java Program to Compute
 *  Quotient and Remainder
 */
public class QuaAndRemainder {

	public static void main(String[] args) {
	
        int num1,num2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		num1 = sc.nextInt();
		System.out.println("Division by number: ");
		num2 = sc.nextInt();
		
        UtilityJava.QuotientRem(num1,num2);
	}

	}
