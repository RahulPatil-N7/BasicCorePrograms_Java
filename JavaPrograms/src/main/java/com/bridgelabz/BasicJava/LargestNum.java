package com.bridgelabz.BasicJava;

import java.util.Scanner;

import com.bridgelabz.UtilJava.UtilityJava;

/*Program to Find the Largest
 *  Among Three Numbers
 */
public class LargestNum {

	public static void main(String[] args) {
		int num1,num2,num3;
		
		Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the first number :");
        num1 = scanner.nextInt();
        System.out.print("Enter the second number:");
        num2 = scanner.nextInt();
        System.out.print("Enter the third number :");
        num3 = scanner.nextInt();
     
        UtilityJava.maxNum(num1,num2,num3);
	}
}
