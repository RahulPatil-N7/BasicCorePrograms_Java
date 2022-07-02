package com.bridgelabz.BasicJava;

import java.util.Scanner;

import com.bridgelabz.UtilJava.UtilityJava;

/*Program to Check Whether an 
 * Alphabet is Vowel or Consonant
 */
public class VowelConsonant {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an alphabet : ");
		char letter = scanner.next().charAt(0);
		
		UtilityJava.checkVowel(letter);
	}

}
