package com.java;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[2][2];
		System.out.println("Enter array data:");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.print("Matrix is:   \n");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
		
	}

}
