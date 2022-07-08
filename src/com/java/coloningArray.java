package com.java;

public class coloningArray {

	public static void main(String[] args) {
		//manual method
//		int a[] = {1,2,3,4,5,6};
//		int b[] = a;
//		a[3]=40;     //here value is change but not change in also 2nd array copy
//		System.out.println("Orignal array is:");
//		
//			for(int i=0;i<a.length;i++)
//			{
//				System.out.println(a[i]+" ");
//		    }
//			
//			System.out.println("Copy array is:");
//			for(int i=0;i<b.length;i++)
//			{
//				System.out.print(b[i]+" ");
//		    }
			
		//	2.method is System.arraycopy
			
//			int original[] = {20,40,80,10,30,50,70};
//			int copy[] = new int[original.length];
//			
//			System.arraycopy(original, 0, copy, 0, original.length);
//	         
//			for(int i=0;i<original.length;i++)
//			{
//				System.out.println(original[i]+" ");
//		    }
//			
//			System.out.println("Copy array is:");
//			for(int i=0;i<copy.length;i++)
//			{
//				System.out.print(copy[i]+" ");
//		    }
			
			
			//3.methode Array.copyOf
			
//			int original[] = {20,40,80,10,30,50,70};
//			int copy[] = new int[original.length];
//			
//			System.out.println("Orignal array is:");
//			for(int i=0;i<original.length;i++)
//			{
//			copy[i]=original[i];
//			}
//			
//			for(int i=0;i<original.length;i++)
//			{
//					System.out.println(original[i]+" ");
//			    }
//				
//				System.out.println("Copy array is:");
//				for(int i=0;i<copy.length;i++)
//				{
//					System.out.print(copy[i]+" ");
//			    }
				
				//4.Object.clone() methode
				
				int original[] = {20,40,80,10,30,50,70};
				int clone[] = original.clone();
				
				System.out.println("Orignal array is:");
				for(int i=0;i<original.length;i++)
				{
					System.out.println(original[i]+" ");
				}
				
				System.out.println("Clone array is:");
				for(int i=0;i<clone.length;i++)
				{
					System.out.print(clone[i]+" ");
			    }
				System.out.print("original == clone: ");
				System.out.println(original == clone );
			
				
				//5.method Array of copyRange
	}

}
