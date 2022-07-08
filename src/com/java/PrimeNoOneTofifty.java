package com.java;

import java.util.Scanner;

public class PrimeNoOneTofifty {

	public static void main(String[] args) {
		int n,count,i,j;
		System.out.println("Enter The number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for( i=2;i<=n;i++)
		{
			count=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.print(i+"  ");

		}
	

	}

}
