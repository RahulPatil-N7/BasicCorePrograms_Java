package com.bridgelabz.functionsprgms;

import java.util.Scanner;

/*Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots.*/

public class Quadratic {
	public static void main(String[] args)
	{

	double a, b, c;
	double root1, root2;
	Scanner scanner = new Scanner(System.in);	
	System.out.println("Enter A value:");
	a = scanner.nextDouble();		
	System.out.println("Enter B value:");		
	b = scanner.nextDouble();		
	System.out.println("Enter C value:");		
	c = scanner.nextDouble();				
	double delta = b * b - 4 * a * c;
		if (delta > 0) {
			root1 = (-b + Math.sqrt(delta)) / (2 * a);
			root2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
		}
		// check if delta is equal to 0
		else if (delta == 0) {
		
			root1 = root2 = -b / (2 * a);
			System.out.format("root1 = root2 = %.2f;", root1);
		}		// if delta is less than zero
		else {			
			// roots are complex number and distinct
			double real = -b / (2 * a);
			double imaginary = Math.sqrt(-delta) / (2 * a);
			System.out.format("root1 = %.2f+%.2fi", real, imaginary);
			System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
		}
	}	

}



