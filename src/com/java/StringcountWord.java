package com.java;

import java.util.Scanner;

public class StringcountWord {

	public static void main(String[] args) {
		
		int words=1,character=1;
		String s = new String("I love java:");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		System.out.println("Enter string:");
		for(int i=0;i<s.length()-1;i++)
		{
			char ch = s.charAt(i);
			System.out.println("Character"+i+":"+ch);
			if(s.charAt(i)==' '&& s.charAt(i+1)!=' ')
			{
				words++;
			}
			else if(s.charAt(i)!=' ')
			{
				character++;
			}
			
		}
		System.out.println("Total word:"+words);
		System.out.println("Total character:"+character);
		System.out.println("sapace:"+(words-1));
	}

}
