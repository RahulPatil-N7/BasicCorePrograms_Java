package com.bridgelabz.functionsprgms;

import java.util.Scanner;

/*the x and y and prints the Euclidean distance from the point (x, y) 
 * to the origin (0, 0). The
formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function */
public class Distance {

	public static void main(String[] args) {
		
		int x, y;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter value of X:");
		x = scanner.nextInt();
		
		System.out.print("Enter value of Y:");
		y = scanner.nextInt();
        //using Math.pow() function to calculate distance. 
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        
        System.out.println("Distance from (" + x + ", " + y + ") to (0, 0) = " + distance);
	}

}
