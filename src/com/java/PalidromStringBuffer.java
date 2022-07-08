package com.java;

public class PalidromStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("level:");
		String original = str.toString();
		String reverse = str.reverse().toString();
		if(original.equals(reverse))
		{
			System.out.println("Word is palidrom:");
		}
		else 
		{
			System.out.println("Word is not palidrom:");
		}
	}

}
