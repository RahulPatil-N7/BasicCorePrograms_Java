package com.bridgelabz.UtilJava;

import java.util.Random;
import java.util.Scanner;

/* functions for basic
 * core programs
 */
public class Utility {
	
	public static void leap(int year) {
		//checks for leap year condition
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        }
		else {
            System.out.println(year + " is Not a Leap year.");
        }
		
	}

	public static void coin(int number) {
    	int head=0;
        int tail=0;
        for(int i=1;i<=number;i++)
        {
        	Random random = new Random();
        	int n = random.nextInt(1000);
            if(n%2==0){
                tail=tail+1;
            }
            else {
                head=head+1;
            }
        }
        double headPer = (head*100)/number ; //calculating head percentage from total flips
        double tailPer = (tail*100)/number ; //calculating tail percentage from total flips
        System.out.println("Heads:" +head);
        System.out.println("Tails:" +tail);
        System.out.println("Percentage of heads: " +headPer + "%");
        System.out.println("Percentage of tails: " +tailPer + "%");
    }
    
    public static void power(int number)
    {
    	//check condition for number to ensure its less than 31
    	if(number > 31)
        {
        	System.out.println("Number should be less than 31.");
        	return;
        }
        else
        {
        	for(int i=1 ; i<=number ; i++)
            {
                System.out.println("["+ i +"]" + "\t =" + ((int)(Math.pow(2,i))));
            }
        }

    }
    
    public static void harmonicNum(double number)
    {
    	double i;
		double sum=0;
    	for( i=1;i<=number;i++)
		{
			sum=sum+(1/i);
		}
    	//harmonic number is printed
		System.out.println("Harmonic value of "+ number + " is : "+sum);
    }
    
    public static void primeFactor(int number)
    {
    	// Print the number of 2s that divide number
    	while (number%2==0) {
            System.out.print(2 + " ");
            number /= 2;
        }
    	// number must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        
    	for (int i = 3; i <= Math.sqrt(number); i+= 2){
            
    		// While i divides n, print i and divide n
            while (number%i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }
 
        // This condition is to handle the case when
        // number is a prime number greater than 2
        if (number > 2) {
            System.out.print(number);
        }
    }
}