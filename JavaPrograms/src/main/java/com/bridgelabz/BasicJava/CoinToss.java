package com.bridgelabz.BasicJava;

import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.UtilJava.Utility;

/*Flip Coin and print percentage
of Heads and Tails */
public class CoinToss {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of times coin flipped:");
        int number = scanner.nextInt();
        
        Utility.coin(number);
    }
}

