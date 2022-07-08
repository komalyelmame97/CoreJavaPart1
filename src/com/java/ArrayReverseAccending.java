package com.java;

import java.util.Scanner;

public class ArrayReverseAccending {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array element:");
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("array element:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		
		System.out.println("array revers element:");
		for(int i=5-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}

}
