package com.java;

import java.util.Scanner;

public class ReverNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user input:");
		int num = 123, reversed = 0;
	    
	    System.out.println("Original Num: " + num);

	    
	    while(num != 0)
	    {
	    
	      
	      int digit = num % 10;
	      reversed = reversed * 10+digit;

	     
	      num /= 10;
	    
	    }
	    System.out.println("Reversed Num: " + reversed);
	  }

	}

