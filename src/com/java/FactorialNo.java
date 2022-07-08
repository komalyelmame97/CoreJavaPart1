package com.java;

import java.util.Scanner;

public class FactorialNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Inputs:");
		int numbers = sc.nextInt();
		int i = 1;
		int fact = 1;
		while(i<=numbers)
		{
				fact *= i;
				i++;
		}
		System.out.println("Factorial of num:"+fact);

	}

}
