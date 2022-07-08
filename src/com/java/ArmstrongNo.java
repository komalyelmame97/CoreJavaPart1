package com.java;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user Inputs:");
		int num = sc.nextInt();
		int arm=0,digit;
		int temp=num;
		
		while(num!=0)
		{
				digit=num%10;
				arm=arm+(digit*digit*digit);
				num/=10;
		}
		System.out.println("arm:"+arm);
		
		int result = arm;
		System.out.println("Result:"+result);
		if(result==temp)
		{
			System.out.println("Number is armstrong:");
		}
		else 
		{
			System.out.println("Number is not armstrong:");
			
		}
	}

}
