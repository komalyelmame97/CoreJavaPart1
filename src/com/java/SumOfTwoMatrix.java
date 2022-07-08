package com.java;

import java.util.Scanner;

public class SumOfTwoMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a[][] =  new int[2][2];
		int b[][] =  new int[2][2];
		int c[][] =  new int[2][2];
		System.out.println("Enter first matrix data:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter second matrix data:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("first matrix data:\n ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
				System.out.print("\n");
		}
		
		System.out.println("second matrix data:\n ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(b[i][j]+" ");
			}
				System.out.print("\n");
		}
		System.out.println("Sum of two matrix: \n");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				c[i][j] = a[i][j]+a[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.print("\n");
		}
	}

}
