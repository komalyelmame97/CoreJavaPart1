package com.java;

import java.util.Scanner;

public class ArrayAsendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] {10,1000,10000,100,100000};
		int temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
			
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Accending order is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		}

}
