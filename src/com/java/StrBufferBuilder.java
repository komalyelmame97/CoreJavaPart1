package com.java;

import java.security.DrbgParameters.Capability;

public class StrBufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("Lear Java:");
		System.out.println("Reverse"+str.reverse());
		System.out.println("Capacity"+str.capacity());
		System.out.println("Append"+str.append(" likely")+" ");
		System.out.println("Replace"+str.replace(2,5, "c++"));
		System.out.println("Insert:"+str.insert(0, "komal"));
		System.out.println("Delete:"+str.delete(0, 4));
		
		
		StringBuffer sb=new StringBuffer();  
        System.out.println(sb.capacity());  
        sb.append("DataFlair");
        sb.length();
        System.out.println(sb.capacity());
        sb.append("DataFlair is company that teaches programming!!!");  
        System.out.println(sb.capacity()); 
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());  
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());

	}

}
