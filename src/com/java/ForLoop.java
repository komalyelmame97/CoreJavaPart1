package com.java;

import java.util.Scanner;

public class ForLoop {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user Input:");
		int sum = 0;
		int num = sc.nextInt();
		for(int i=1;i <= num; i++)
		{
			sum += i;
		}
		System.out.println("Sum Of Number is:" + sum);
	}

}
