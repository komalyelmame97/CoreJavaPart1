package com.java;

import java.util.Scanner;

public class Menudriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true)
		{
				System.out.println("menu");
				System.out.println("1.Add \n 2.sub \n 3.mul \n 4.div \n 5.exit \n");
				
				Scanner sc = new Scanner(System.in);
				System.out.println("enter your choice:");
				int ch = sc.nextInt();
				
				switch(ch)
				{
				case 1 : System.out.println("Enter two numbers:");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
					int add = num1+num2;
					System.out.println("Addition is:" +add );
					break;
					
				case 2 : 
					int sub = num1-num2;
					System.out.println("substraction is:" +sub );
					break;
					
				case 3 : 
					int mul = num1*num2;
					System.out.println("Multiplication is:" +mul );
					break;
					
				case 4 : 
					int div = num1/num2;
					System.out.println("Division is:" +div);
					break;
					
				case 5 : 
					System.exit(0);
				
				default:
					System.out.println("Invalid choice:");
				}
		}
	}

}
