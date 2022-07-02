package com.bridgelabz.BasicJava;

import java.util.Scanner;
import com.bridgelabz.UtilJava.UtilityJava;

/*Program to Swap
 *  Two Numbers
 */
public class NumberSwap {

	public static void main(String[] args) {
		int num1, num2;
		
		Scanner scanner = new Scanner(System.in);  
		 System.out.println("Enter the value of A and B:"); 
		 num1 = scanner.nextInt(); 
		 num2 = scanner.nextInt(); 
		 
		UtilityJava.swap(num1,num2);
	}
		

	}


