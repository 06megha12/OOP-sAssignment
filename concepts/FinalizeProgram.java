package com.oops.concepts;

public class FinalizeProgram {

	public static void main(String[] args) {
		FinalizeProgram f1=new FinalizeProgram();
		System.gc();
		
	//	finalize9=null;
	//	System.gc();
		System.out.println("---END----");
	}
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("finalize method");
	}
	

}
