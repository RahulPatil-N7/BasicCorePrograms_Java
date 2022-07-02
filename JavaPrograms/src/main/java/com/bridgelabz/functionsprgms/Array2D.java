package com.bridgelabz.functionsprgms;

import java.util.Scanner;

/*-> A library for reading in 2D arrays of integers, doubles, or booleans from
standard input and printing them out to standard output. */

public class Array2D {
	
	//method to create row & columns by taking array input 
	
	public static void twoDArr() {
		int rows,columns,i,j;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		rows = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		columns = sc.nextInt();
		
		int arr[][] = new int[rows][columns]; 
		System.out.println("Enter array elements: ");
		
		for (i = 0; i < rows; i++) {
			for (j = 0; j < columns; j++) { 
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (i = 0; i < rows; i++) {
			System.out.println();
			for (j = 0; j < columns; j++) {
				System.out.print(arr[i][j] + "\t");
			}
		}
	}

	public static void main(String[] args) {
		//calling twoDArr method 
		Array2D.twoDArr();

	}
}
