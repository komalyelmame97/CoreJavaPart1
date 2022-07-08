package com.java;

import java.util.Scanner;

public class StaticDynamicArray {

	public static void main(String[] args) {
		
//		int a[] = new int [5];
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
//		a[3] = 40;
//		a[4] = 50;
//		
//		for(int i=0;i<4;i++)
//		{
//			System.out.println(a[i]);
//		}
		
// Dynamic Array
		
		int i,size;
		System.out.println("Enter size of array:");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int a[] = new int [size];
		
		for(i=0;i<size;i++)
		{
			a[i] = sc.nextInt();
		}
			System.out.println("Printed Array Element:");
			
			for(i=0;i<size;i++)
			{
				System.out.print(a[i]+"  ");
			}
	}

}
