package com.bridgelabz.UtilJava;

/* functions for basic
 *  core programs
 */
public class UtilityJava {

	public static void QuotientRem(int num1,int num2) {
		int quo = num1/num2;     //calculating quotient
		int rem = num1%num2;     //calculating remainder
		System.out.println("the quotient and remainder after divison of "+num1+ " by "+num2+" are : ");
		
		System.out.println("\nThe quotient is : " + quo);
        System.out.println("The remainder is: " + rem);
	}
	
	public static void swap(int num1,int num2) {
		System.out.println("Before swapping numbers: "+num1 +"  "+ num2); 
		 
		 int temp = num1;  //using temp variable to swap numbers
		 num1 = num2;
		 num2 = temp;
		 System.out.println("After swapping: "+num1 +"   " + num2); 
	}
	
	public static void checkEvenOdd(int number) {
		if(number%2==0)   //check for even condition
			System.out.println(number + " is a even number.");
		else
			System.out.println(number + " is a odd number.");
	}
	
	public static void checkVowel(char letter) {
		switch (letter) {
        	case 'a':
        	case 'e':
        	case 'i':
        	case 'o':
        	case 'u':
        	case 'A':
        	case 'E':
        	case 'I':
        	case 'O':
        	case 'U':
            System.out.println(letter + " is a vowel.");
            break;
        default:
            System.out.println(letter + " is a consonant.");
		}
	}
	
	public static void maxNum(int num1,int num2,int num3) {
		//check if num1 is largest 
		if(num1 > num2 && num1 > num3) {
	            System.out.println("Largest number is :"+ num1);
		 }
		 else if(num2 > num3) {
	            System.out.println("Largest number is :"+num2);	
		 }
		 else {
	            System.out.println("Largest number is :"+num3);
		 }
	}
}
	

