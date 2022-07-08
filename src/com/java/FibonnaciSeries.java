package com.java;

import java.util.Scanner;

public class FibonnaciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user Input:");
		int num = sc.nextInt();
		int num1 = 0,num2 = 1,num3;
		System.out.print("Fibonnaci Series:" +num1+"" +num2);
		for(int i=1;i<=5;i++)
		{
				num3=num1+num2;
				System.out.print(""+num3);
				num1=num2;
				num2=num3;
		}
	}

}
