package com.bridgelabz.functionsprgms;

import java.util.Scanner;

/*take t and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
temperature t (in Fahrenheit) and the wind speed v (in miles per hour) */

public class WindChill {
	public static void main(String[] args) {

		double t,v,w;
		Scanner scanner = new Scanner(System.in);
		
		//temperature t (in Fahrenheit) and the wind speed v (in miles per hour) are taken as input
		System.out.println("Enter Temperature(t) value:");
		t = scanner.nextDouble();
		System.out.println("Enter Speed(v) value:");
		v = scanner.nextDouble();
		
		//wind chill calculated using Math.pow in formula
		if(t<=50 && (v<=120) && (v>3)) {
			w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
			System.out.println("Temperature = " + t);
			System.out.println("Wind speed  = " + v);
			System.out.println("Wind chill  = " + w);
		}
		else {
			System.out.println("Temperture sholud be less than 50 or speed should be between 3 to 120.");
		}
		
	}
}


