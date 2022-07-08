package com.java;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your full name:");
			String name1 = sc.nextLine();
			System.out.println("Your full name is:" +name1);
			
			System.out.println("your name:");
			String name = sc.nextLine();
			System.out.println("Your name is:" +name);
			
			System.out.println("Enter your Rollno:");
			int rollno = sc.nextInt();
			System.out.println("Rollno is:" +rollno);
			
			System.out.print("Insert a no:");
			int number = sc.nextInt();
			System.out.print("Text1:");
			String text1 = sc.nextLine();
			
			System.out.print("Text2:");
			String text2 = sc.nextLine();
			
			System.out.println("number is:" + number);
			System.out.println("text1 is:" + text1);
			System.out.println("text2 is:" + text2);
			
			
			
		
	}

}
