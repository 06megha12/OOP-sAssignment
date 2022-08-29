package com.oops.stringcomparisn;

import java.util.Scanner;

public class Child extends Parent{
	 public void stringCompare(){
	        System.out.println("child Method");
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter first string");
	        String s1=sc.next();
	        
	        System.out.println("Enter second string");
	        String s2=sc.next();
	        int strlen = s2.length();
	        
	        if(s1.length()==s2.length()) {
	            for(int i=0;i<strlen;i++) {
	                if(s1.charAt(i)==s2.charAt(i)) {
	                    System.out.println(i+1+" character matched");
	                }
	                else {
	                    System.out.println(i+"character not matched");
	                }
	                
	            }
	        }
	        else {
	            System.out.println("Not comparable");
	        }
	        
	        
	    }
	                
	            
}
