package com.oops.shape;

public class Square implements Shape{

	 private double s;
	 public Square(double s) {
	        this.s = s;  
	    }
	    @Override
	    public double area() {
	        return s*s*s*s;
	    }
}
