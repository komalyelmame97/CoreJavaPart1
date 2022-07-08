package com.java;

import java.util.Scanner;

public class StarPatten {

	public static void main(String[] args) {
     int i,j,size;
     System.out.println("Enter star patten: ");
     Scanner sc = new Scanner(System.in);
       size = sc.nextInt();
     
//   for(i=0;i<=n;i++)
//     {
//    	 for(j=0;j<=i;j++)
//    	 {
//    		 System.out.print("* ");
//    	 }
//    	 System.out.print("");
//     }
     
     
    for(i=0;i<size;i++)
     {
    	 for(j=1;j<size-i;j++)
    	 {
    		 System.out.print("  ");
    	 }
    	 for(int k=0;k<=i;k++)
    	 {
    	 System.out.print("*");
         }
 
    	 System.out.println("");
	}

 }
}
